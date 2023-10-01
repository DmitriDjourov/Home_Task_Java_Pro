package org.example;

import java.util.Random;
import java.util.Scanner;

public class Play777 {
		public static double play777(Scanner scanner, double bablo) {
				Random random = new Random();
				System.out.println("Добро пожаловать в игру 777!");
				System.out.println("У тебя в кармане всё еще : " + bablo + "баксов... кхе ..кхе");

				while (bablo > 0) {
						System.out.println("\nДёргай за ручку ... фрайерок... (нажми Enter)...");
						scanner.nextLine();

						// Генерируем случайные числа для барабанов
						int reel1 = random.nextInt(7);
						int reel2 = random.nextInt(7);
						int reel3 = random.nextInt(7);

						System.out.println("\n И так на табло ... выпало : " + reel1 + " " + reel2 + " " + reel3);

						// Проверяем выигрыш
						if (reel1 == 7 && reel2 == 7 && reel3 == 7) {
								System.out.println(" А ты фартовый ...кхе ...кхе... твой карман потяжелел на 100$ !");
								bablo += 100;
						} else if (reel1 != 7 && reel1 == reel2 && reel2 == reel3) {
								System.out.println("Эхх...были бы <777> a не три <" + reel1 + reel1 + reel1 + ">... но ты все равно поднял 50 баксов!");
								bablo += 50;
						} else {
								bablo -= 10;
								if (bablo > 0) {
										System.out.println("\n Не дрейфь фрайерок...в следующий раз обязательно повезет...жми давай...кхе ..кхе");
								}
						}
						if (bablo < 1) {
							break;
						} else {
								System.out.println("У тебя в кармане всё еще : " + bablo + " баксов... кхе ..кхе\n");
						}
				}
				scanner.close();
				return bablo;
		}
}

