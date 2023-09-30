package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
				System.out.println("\n ** Заходи не бойся, уходя не плачь ! **");
				System.out.println("\n ** Жизнь плоха без лоха ! **");
				System.out.println("\n ** Добро пожаловать в подпольное казино << Наше дело ! >> ** ");
				Scanner scanner = new Scanner(System.in);
				double bablo;
				do {
						System.out.print("...ну чЁ ...деньги принес?... давай сколько есть... суй в эту дырочку :\n");
						bablo = scanner.nextInt();

						if (bablo <= 0) {
								System.out.println("...ты чё..фрайерок... берега попутал? ...а если найду?..ну ка подпрыгни...");
						}
				} while (bablo <= 0);

				while (bablo > 0) {
						System.out.println("... о...ёбть...да ты сегодня при лаве.. ну с " + bablo + " баксов ты желанный гость ... кхе... кхе...");
						System.out.println("...ну чё ..фрайерок...не зассышь? сделаешь ставку? Рулетка ? ...или 777 ? :");
						System.out.println("1. Крутану рулеточку...");
						System.out.println("2. Рубанусь на 777...");
						System.out.println("3. ...та ну вас нах ... я сваливаю...\n");

						int choice = scanner.nextInt();

						switch (choice) {
								case 1:
										//playInRoulette(scanner);
										break;
								case 2:
										//playIn777(scanner);
										break;
								case 3:
										System.out.println("Оба на ...! А куда енто мы подорвались... по любому... вход рупь а вот за выход с тебя : " + bablo +" баксов... Промокашка ...тряхни-ка Буратину... кхе... кхе...");
										return;
								default:
										System.out.println("Пожалуйста, выберите правильный вариант.");
										break;
						}
				}

				System.out.println("Оба на ...! ...а чё...всё шоль... головка бо-бо... денежки тю-тю... во рту - кака... ну заходь еще... фрайерок... кхе... кхе!");
		}
}
