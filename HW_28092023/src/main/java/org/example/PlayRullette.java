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

				System.out.println("Ну крутануть так крутануть! У тя в карманах " + bablo + " баксов . Минимальная ставка "
						                   + MIN_STAVKA + ", но не более " + MAX_STAVKA + " баксов. Заряжай ему, Промакашка...а пока...");

				System.out.println("Что тебе налить , фрайерок, что бы душа пела... ? ");
				for (AlcoholDrink drink : AlcoholDrink.values()) {
						System.out.println(drink.ordinal() + 1 + ". " + drink.getName());
				}
				System.out.print("Всё на халяву... всего лишь выбери номер напитка: ");
				int buhlo = scanner.nextInt();
				if (buhlo >= 1 && buhlo <= AlcoholDrink.values().length) {
						AlcoholDrink tvoyDrink = AlcoholDrink.values()[buhlo - 1];
						System.out.println("Ооо..." + tvoyDrink.getName() + " серьёзный выбор, Промокашка плесни гостю его пойла... кхе... кхе ");
				} else {
						System.out.println("Ты чЁ язвенник , аль стукачёк?... ладно не дуйся..ну нет так нет...");
				}
				while (bablo > 0) {
						System.out.print("Делайте ваши ставки , Господа (введите сумму) : ");
						int stavka = scanner.nextInt();

						if (stavka < MIN_STAVKA || stavka > MAX_STAVKA || stavka > bablo) {
								System.out.println("Неверная ставка. Попробуй ещё раз.");
								continue;
						}

						System.out.println("Выбери номер от 0 до 36:");
						selecteRuldNum = scanner.nextInt();
						if (selecteRuldNum < 0 || selecteRuldNum > 36) {
								System.out.println("Неправильный выбор номера ставки. Попробуй ещё раз.");
								continue;
						}

						System.out.println("Поставь на четные(2) или нечетные(1)  : ");
						selecteChetNechet = scanner.nextInt();
						if (selecteChetNechet < 1 || selecteChetNechet > 2) {
								System.out.println("Неправильный выбор номера чёт-нечет. Попробуй снова.");
								continue;
						}

						int rouletteResult = random.nextInt(MAX_NUM_ROULETTE + 1);
						System.out.println("Шарик упал на номер: " + rouletteResult);

						if (rouletteResult == selecteRuldNum) {
								int win = stavka * 36; // Выигрыш 36:1
								System.out.println("Ваууу! Круто! Твой номер :" + selecteRuldNum +
										                   " сыграл ! И ты таки выиграл аж " + win + " баксов! Промокашка, почему у гостя стакан пустой , где его " + buhlo);
								bablo += win;
						} else if ((rouletteResult % 2 == 0 && selecteChetNechet == 2 && rouletteResult != 0) ||
								           (rouletteResult % 2 != 0
										            && selecteChetNechet == 1)) {
								int win = stavka * 2;
								bablo += win;
								System.out.println("Вай вай ! Твой номер : " + selecteRuldNum + " ,а ещё ты выиграл в чёт-нечет : " +
										                   win + " баксов ! А ты фартовый ...кхе ...кхе ...и у тебя в кармане " +
										                   bablo + " баксов... это нужно отметить... Промокашка... где там  его " + buhlo);
						} else {
								bablo -= stavka;
								System.out.println("Увы, прощелкал ещё " + stavka + " баксов... а в кармане осталось : " + bablo);
						}
				}
				scanner.close();
				return bablo;
		}
}
