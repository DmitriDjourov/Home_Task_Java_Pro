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

				System.out.print("Как звать то тебя , мил человек ? (Напиши под каким именем тут тебя будут знать): ");
				String name = scanner.nextLine();
				System.out.println(" Ну проходи " + name + " гостем будешь ... ");

				do {
						System.out.print("...ну чЁ ...бабло принес?...  засвети-ка обществу " +
								                 "( Напиши сумму с которой ты готов расстаться ): ");
						bablo = scanner.nextInt();

						if (bablo <= 0) {
								System.out.println("...ты чЁ.." + name + "... берега попутал? ...а если найду?..ну ка подпрыгни...\n");
						}
				} while (bablo <= 0);

				while (bablo > 0) {

						System.out.println("\n... о...ёпть...да ты сегодня при бабле.. ну " + bablo +
								                   " баксов и ты желанный гость ... кхе... кхе...");
						System.out.println("Чё изволитес ...Рулетка ? ...или 777 ? :\n");
						System.out.println("1. Крутану рулеточку...");
						System.out.println("2. Рубанусь на 777...");
						System.out.println("3. ...та ну вас наХ ... я сваливаю...\n");

						int choice = scanner.nextInt();

						switch (choice) {
								case 1:
										bablo = PlayRullette.getRullettePlay(scanner, bablo, name);
										break;
								case 2:
										bablo = Play777.play777(scanner, bablo, name);
										break;
								case 3:
										System.out.println("\nОба на ...! А куда енто мы подорвались " + name + "...вход то рубль... ,а вот за выход");
										System.out.println("  с тебя по любому " + bablo + " баксов... Промокашка" + " ...тряхни-ка Буратину... кхе... кхе...\n");
										return;
								default:
										System.out.println("\nТы это... ты " + name + " давай, выбирай то что по душе... Шлимазал... кхе...кхе...");
										break;
						}
				}
				System.out.println("\n Оба на ! ...а чё..." + name + " - всё... головка бо-бо... денежки тю-тю... во рту - кака... ну");
				System.out.println(" заходь еще...только бабла побольше бери... Шлимазл-" + name + "... кхе... кхе!");
		}
}

