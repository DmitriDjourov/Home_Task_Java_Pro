package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
				System.out.println("\n ** Заходи не бойся, уходя не плачь ! **");
				System.out.println("\n ** Жизнь плоха без лоха ! **");
				System.out.println("\n ** Добро пожаловать в казино << Наше дело ! >> ** ");
				Scanner scanner = new Scanner(System.in);
				double bablo;
				do {
						System.out.print("...ну чЁ ...деньги принес?... давай сколько есть... :");
						bablo = scanner.nextInt();

						if (bablo <= 0) {
								System.out.println("...ты чё..фрайер..а если найду?..ну ка подпрыгни...");
						}
				} while (bablo <= 0);

				System.out.println("... о...ёбть...да ты сегодня при лаве.. ну сo " + bablo + " баксов ты желанный гость ...хе...хе...");

		}
}