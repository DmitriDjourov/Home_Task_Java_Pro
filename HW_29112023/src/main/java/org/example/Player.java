package org.example;

import java.util.List;
import java.util.concurrent.Exchanger;

class Player extends Thread {
    private String name;
    private List<Position> positions;
    private Exchanger<Position> exchanger;

    public Player(String name, List<Position> positions, Exchanger<Position> exchanger) {
        this.name = name;
        this.positions = positions;
        this.exchanger = exchanger;
        //this.start();
    }

    private void play(Position mainPlayer, Position anotherPlayer) {
        if(mainPlayer == Position.PAPER && anotherPlayer == Position.STONE ||
           mainPlayer == Position.STONE && anotherPlayer == Position.SCISSORS ||
           mainPlayer == Position.SCISSORS && anotherPlayer == Position.PAPER) {
            System.out.println("***[ " + name + " ]: WINNER!***");
        }
    }

    @Override
    public void run() {
        Position reply;
        for (Position p : positions) {
            try {
                reply = exchanger.exchange(p);
                play(p, reply);
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
