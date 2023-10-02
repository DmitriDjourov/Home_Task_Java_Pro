package org.example;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Play777 {
		public static double play777(Scanner scanner, double bablo, String name) {
				Random random = new Random();
				System.out.println("\nДобро пожаловать " + name + " в игру 777!");
				System.out.println("\nУ тебя в кармане всё еще : " + bablo + " баксов... кхе ..кхе");
				System.out.println("...правила игры простые, дёргаешь за ручку и если три одинаковых циферки выпало");
				System.out.println(" то ты молодец, вот тебе полтийничек...а если три топора(777), то и весь стольник твой, понял?");
				System.out.println("... " + name + "  дёргает за ручку... раздается отчаянный визг крупье !!!");
				System.out.println("...это не ручка...прохрипел крупье и густо покраснел...");
				System.out.println("...кхе...кхе...ты это ... " + name + "... ты мне тут людей не калечь ...ты впервой у нас что-ль?");
				System.out.println(" ...ты " + name + " тогда просто кнопку Enter на клаве жми...вот енту ...да ...вот так ... ");

				while (bablo > 0) {
/*						System.out.println("\nДёргай за ручку...  " + name + " ... (нажми Enter)...");
						scanner.nextLine();*/
						System.out.println(  name + " если хочешь продолжить игру нажми Enter, Если хочешь уйти нажми <y>");

						String jamp = scanner.nextLine();
						if (jamp.equals("y")) {
								return bablo;
						}

						// Генерируем случайные числа для барабанов
						int reel1 = random.nextInt(7);
						int reel2 = random.nextInt(7);
						int reel3 = random.nextInt(7);

						System.out.println("\n И так, на твоё табло ... выпало : " + reel1 + " " + reel2 + " " + reel3);

						// Проверяем выигрыш
						if (reel1 == 7 && reel2 == 7 && reel3 == 7) {
								System.out.println(" А ты  " + name + " фартовый ...кхе ...кхе ...твой карман потяжелел на 100 баксов !");
								bablo += 100;
						} else if (reel1 != 7 && reel1 == reel2 && reel2 == reel3) {
								System.out.println("Эхх... были бы <777> a не <" + reel1 + reel1 + reel1 + ">... но ты все равно поднял 50 баксов!");
								bablo += 50;
						} else {
								bablo -= 10;
								if (bablo > 0) {
										System.out.println("\n Не дрейфь  " + name + "  ...в следующий раз обязательно повезет ...жми давай ...кхе ...кхе");
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

