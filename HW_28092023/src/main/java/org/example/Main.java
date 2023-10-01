package org.example;

import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
				System.out.println("\n ** ЗАХОДИ НЕ БОЙСЯ, УХОДЯ НЕ ПЛАЧ !!! **");
				System.out.println("\n ** ЖИЗНЬ ПЛОХА БЕЗ ЛОХА !!! **");
				System.out.println("\n ** ДОБРО ПОЖАЛОВАТЬ В ЭКСКЛЮЗИВНОЕ КАЗИНО  << НАШЕ ДЕЛО! (cosa nostra) >> ** \n");

				String videoUrl = "https://www.youtube.com/watch?v=LVR7fbkC360&ab_channel=LubaUspenskayaClub";
				Clip.openYTV(videoUrl);
				Scanner scanner = new Scanner(System.in);
				double bablo;
				do {
						System.out.print("...ну чЁ ...бабло принес?...  засвети-ка обществу " +
								                 "( Напиши сумму с которой ты готов расстаться ): ");
						bablo = scanner.nextInt();

						if (bablo <= 0) {
								System.out.println("...ты чЁ..фрайерок... берега попутал? ...а если найду?..ну ка подпрыгни...\n");
						}
				} while (bablo <= 0);

				while (bablo > 0) {

						System.out.println("\n... о...ёпть...да ты сегодня при лаве.. ну с " + bablo + " баксов ты желанный гость ... кхе... кхе...");
						System.out.println("Чё изволитес-с-с ...Рулетка ? ...или 777 ? :\n");
						System.out.println("1. Крутану рулеточку...");
						System.out.println("2. Рубанусь на 777...");
						System.out.println("3. ...та ну вас нах ... я сваливаю...\n");

						int choice = scanner.nextInt();

						switch (choice) {
								case 1:
										bablo = PlayRullette.getRullettePlay(scanner, bablo);
										break;
								case 2:
										bablo = Play777.play777(scanner, bablo);
										break;
								case 3:
										System.out.println("\nОба на ...! А куда енто мы подорвались...вход то рупь... ," +
												                   " а вот за выход с тебя по любому " + bablo + " баксов... Промокашка" +
												                   " ...тряхни-ка Буратину... кхе... кхе...\n");
										return;
								default:
										System.out.println("\nТы это... ты давай, выбирай то что по душе... Шлимазал... кхе...кхе...");
										break;
						}
				}
				System.out.println("\n Оба на ! ...а чё...всё шоль... головка бо-бо... денежки тю-тю... во рту - кака... ну" +
						                   " заходь еще...только бобла побольше бери... Шлимазл... кхе... кхе!");
		}
}

