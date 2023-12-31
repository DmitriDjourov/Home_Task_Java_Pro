package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class PlayRullette {
		private static final int MIN_STAVKA = 10;
		private static final int MAX_STAVKA = 1000;
		private static final int MAX_NUM_ROULETTE = 36;
		public static double getRullettePlay(Scanner scanner, double bablo, String name) {

				int selecteRuldNum = -1;
				int selecteChetNechet = 3;
				Random random = new Random();
				String sort_buhla = " ";

				System.out.println("\nНу крутануть так крутануть! У тя в карманах " + bablo + " баксов .");
				System.out.println("У нас тут минимальная ставка " + MIN_STAVKA + ", но не более " + MAX_STAVKA + " баксов. Заряжай ему, Промакашка...а пока...");

				System.out.println("Что тебе налить , " + name + ", что бы твоя душа пела... ? ");
				AlcoholDrink[] drinks = AlcoholDrink.values();
				Arrays.sort(drinks, new Comparator<AlcoholDrink>() {
						@Override
						public int compare(AlcoholDrink o1, AlcoholDrink o2) {
								return o1.getName().compareTo(o2.getName());
						}
				});
				for (AlcoholDrink drink : drinks) {
						System.out.println(drink.ordinal() + 1 + ". " + drink.getName());
				}
				System.out.print("\nВсё на халяву... всего лишь выбери код напитка: ");

				int buhlo = scanner.nextInt();


				if (buhlo >= 1 && buhlo <= AlcoholDrink.values().length) {
						AlcoholDrink tvoyDrink = AlcoholDrink.values()[buhlo - 1];
						sort_buhla = tvoyDrink.getName();
						System.out.println("\nОоо..." + name + ",да ты гурман, " + sort_buhla + " - серьёзный выбор, Промокашка плесни гостю его пойла... кхе... кхе \n");
				} else {
						System.out.println("Ты чЁ " + name + " язвенник , аль стукачёк?... ладно не дуйся..ну нет так нет...");
				}
				while (bablo > 0) {
						/*						System.out.print("Делайте ваши ставки , Господа (введите сумму) : ");*/
						System.out.println("\n" + name + " если хочешь уйти, то нажми <777> . Делайте ваши ставки , Господа (введите сумму) :");

						int stavka = scanner.nextInt();
						if (stavka == 777) {
								return bablo;
						}

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
								System.out.println("Ваууу " + name + "! Круто! Твой номер :" + selecteRuldNum + " сыграл ! И ты таки выиграл аж ");
								System.out.println(win + " баксов! Промокашка, почему у гостя стакан пустой где там его " + sort_buhla);
								bablo += win;
						} else if ((rouletteResult % 2 == 0 && selecteChetNechet == 2 && rouletteResult != 0) ||
								           (rouletteResult % 2 != 0
										            && selecteChetNechet == 1)) {
								int win = stavka * 2;
								bablo += win;
								System.out.println("Вай вай" + name + " ! Твой номер : " + selecteRuldNum + " ,а ещё ты выиграл в чёт-нечет : ");
								System.out.println(win + " баксов ! А ты " + name + " фартовый ...кхе ...кхе ...и у тебя в кармане ");
								System.out.println(bablo + " баксов... это нужно отметить... Промокашка...где там  его " + sort_buhla);
						} else {
								bablo -= stavka;
								System.out.println("Увы " + name + ",ты прощелкал ещё " + stavka + " баксов... а в кармане осталось : " + bablo);
						}
				}
				scanner.close();
				return bablo;
		}
}
