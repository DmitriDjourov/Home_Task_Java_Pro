package org.example;

import java.util.Random;
import java.util.Scanner;

public class PlayRullette {
		public static double getRullettePlay(Scanner scanner, double bablo) {
				int MIN_STAVKA = 10;
				int MAX_STAVKA = 1000;
				int MAX_NUM_ROULETTE = 36;
				int selecteRuldNum = -1;
				int selecteChetNechet = 3;
				Random random = new Random();

				System.out.println("Добро пожаловать в рулетку! Ваш баланс " + bablo + ". Минимальная ставка " + MIN_STAVKA +
						                   ", но не более " + MAX_STAVKA + " баксов.");

				while (bablo > 0) {
						System.out.print("Делайте ваши ставки , Господа (введите сумму) : ");
						int stavka = scanner.nextInt();

						if (stavka < MIN_STAVKA || stavka > MAX_STAVKA || stavka > bablo) {
								System.out.println("Неверная ставка. Попробуйте снова.");
								continue;
						}

						System.out.println("Выберите номер от 0 до 36:");
						selecteRuldNum = scanner.nextInt();
						if (selecteRuldNum < 0 || selecteRuldNum > 36) {
								System.out.println("Неправильный выбор номера ставки. Попробуйте снова.");
								continue;
						}

						System.out.println("Поставте на четные(2) или нечетные(1)  : ");
						selecteChetNechet = scanner.nextInt();
						if (selecteChetNechet < 1 || selecteChetNechet > 2) {
								System.out.println("Неправильный выбор номера чёт-нечет. Попробуйте снова.");
								continue;
						}

						int rouletteResult = random.nextInt(MAX_NUM_ROULETTE + 1);
						System.out.println("Шарик упал на номер: " + rouletteResult);

						if (rouletteResult == selecteRuldNum) {
								int win = stavka * 36; // Выигрыш 36:1
								System.out.println("Поздравляем ваш номер :" + selecteRuldNum +
										                   " сыграл ! Вы выиграли :" + win + " баксов !");
								bablo += win;
						} else if ((rouletteResult % 2 == 0 && selecteChetNechet == 2 && rouletteResult != 0) ||
								           (rouletteResult % 2 != 0
										            && selecteChetNechet == 1)) {
								int win = stavka * 2;
								bablo += win;
								System.out.println("Поздравляем! Ваш номер : " + selecteRuldNum + " ,и Вы выиграли в чёт-нечет : " +
										                   win + " баксов ! А ты фартовый ...кхе ...кхе... и у тебя в кармане " +
										                   bablo + " баксов...");
						} else {
								bablo -= stavka;
								System.out.println("Увы, Вы проиграли... у Вас в кармане : " + bablo + " баксов.");
						}
				}
				scanner.close();
				return bablo;
		}
}
