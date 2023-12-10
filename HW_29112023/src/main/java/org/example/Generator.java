package org.example;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;
/**
 * - Создать класс для генерации игроков (50 шт)
 * - Создать класс для генерации листа Position(10 раз)
 * - Все игроки должны сыграть "каждый с каждым"
 * - Если победа то +1 если поражение то -1 ничья 0,5
 * - Составить таблицу игроков и вывести на экран тройку лидеров
 * - Если у тройки лидеров одинаковые очки - они переигрывают ТО кол-во раз пока кол-во очков не станет разным.
 *
 * - CDL для генерации игроков.
 */
public class Generator {
		private final static Faker FAKER = new Faker();
		private static Exchanger<Position> positionExchanger;

		//класс для генерации игроков (50 шт)
		private static List<Player> playerGenerator(){
				List<Player> players = new ArrayList<>(50);
				for (int i = 0; i < 50; i++) {
						players.add(new Player(FAKER.name().name(),positionGenerator(),positionExchanger));
				}
				return players;
		}
		// класс для генерации листа Position(10 раз)
		private static List<Position> positionGenerator() {
				 List<Position> positions = new ArrayList<>();
				 Position[] arrayPosition = Position.values();
				for (int i = 0; i < 10; i++) { // 10 games
						positions.add(arrayPosition[new Random().nextInt(3)]);
				}
				 return positions;
		}
}
