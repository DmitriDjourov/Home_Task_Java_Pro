package org.example;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Clip {
		public static void openYTV(String videoUrl) {
				try {
						// Создаем объект Desktop
						Desktop desktop = Desktop.getDesktop();
						// Преобразуем строку URL в объект URI
						URI uri = new URI(videoUrl);
						// Открываем ссылку в браузере
						desktop.browse(uri);
				} catch (IOException | URISyntaxException e) {
						e.printStackTrace();
				}
		}

}
