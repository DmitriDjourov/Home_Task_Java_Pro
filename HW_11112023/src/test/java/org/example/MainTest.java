package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {

		//0. тест метода который парсит файл
		@Test
		void testStringTelName() throws IOException {
				// Создаем временный файл и записываем в него тестовые данные
				Path tempFile = Files.createTempFile("tempfile", ".txt");
				Files.write(tempFile, List.of("John", "Alice", "Bob", "Charlie", "David", "Anna"));

				// Вызываем метод и получаем результат
				List<String> result = Main.stringTelName(tempFile.toString());
				// Проверяем, что результат соответствует ожидаемому
				assertEquals(List.of("John", "Alice", "Bob", "Charlie", "David", "Anna"), result);

				// Удаляем временный файл
				Files.deleteIfExists(tempFile);
		}

		@Test
		void testStringTelNameWithInvalidFile() {
				// Передаем некорректный путь к файлу, ожидаем RuntimeException
				assertThrows(RuntimeException.class, () -> Main.stringTelName("nonexistentfile.txt"));
		}

		//1. Метод для создания мапы, где ключ - первая буква имени, а значение - количество таких имен
		@Test
		void testCreateNameFrequencyMap() {
				List<String> lines = Arrays.asList("Dana", "Anna", "Betty", "Ciki", "Goga", "Gosha");
				Map<Character, Long> rez = Main.createNameFrequencyMap(lines);

				// Ожидаемый результат: {'G': 2, 'A': 1, 'B': 1, 'C': 1, 'D': 1}
				Assertions.assertEquals(2, rez.get('G'));
				Assertions.assertEquals(1, rez.get('A'));
				Assertions.assertEquals(1, rez.get('B'));
				Assertions.assertEquals(1, rez.get('C'));
				Assertions.assertEquals(1, rez.get('D'));

				// Проверка на отсутствие других ключей
				Assertions.assertNull(rez.get('W'));
		}

		@Test
		void testCreateNameFrequencyMapWithNullLines() {
				List<String> lines = Arrays.asList();
				Map<Character, Long> rez = Main.createNameFrequencyMap(lines);

				// Ожидаемый результат: null, так как нет строк
				Assertions.assertEquals(0, rez.size());
		}

		//2. Метод для нахождения самой часто встречающейся первой буквы в именах
		@Test
		void testFindMostFrequentFirstLetter() {
				List<String> lines = Arrays.asList("Dana", "Anna", "Betty", "Ciki", "Goga", "Gosha");
				Optional<String> rez = Main.findMostFrequentFirstLetter(lines);

				// Ожидаемый результат: {'G'}
				Assertions.assertEquals("G", rez.get());
		}

		@Test
		void testFindMostFrequentFirstLetterNull() {
				List<String> lines = Arrays.asList();
				Optional<String> rez = Main.findMostFrequentFirstLetter(lines);
				// ожидаемый результат true так как список пуст rez.isEmpty()
				Assertions.assertTrue(rez.isEmpty());
		}

		@Test
		void testFindMostFrequentFirstLetterWithEqualFrequencies() {
				List<String> lines = Arrays.asList("Anna", "Betty", "Ciki");
				Optional<String> rez = Main.findMostFrequentFirstLetter(lines);
				// Ожидаемый результат: "A" или "B" или "C", так как они все повторяются одинаковое число раз
				Assertions.assertTrue(rez.get().equals("A") || rez.get().equals("B") || rez.get().equals("C"));
		}

		//3. Метод для создания списка номеров телефонов, где каждый номер преобразован в числовой формат
		@Test
		void testExtractPhoneNumbers() {
				List<String> lines = Arrays.asList(
						"+1-240-701-5763x6875 - Jose Edwards"
				);
				List<Long> rez = Main.extractPhoneNumbers(lines);
				// не пустой список
				Assertions.assertFalse(rez.isEmpty());
				// возвращает стрингу из цифр
				Assertions.assertEquals("124070157636875", rez.toString().replaceAll("\\D", ""));
		}

		@Test
		void testExtractPhoneNumbersWithNoNumbers() {
				// список без номеров
				List<String> lines = Arrays.asList("No numbers", "Keine numeren", "בלי מיספרים", "Без номеров");
				List<Long> rez = Main.extractPhoneNumbers(lines);
				Assertions.assertEquals(List.of(), rez);
		}

		//4. Метод для группировки имен по длине имени
		@Test
		void testGroupNamesByLength() {
				List<String> lines = Arrays.asList("Dana", "Anna", "Betta", "Ciki", "Goga", "Gosha");
				Map<Integer, List<String>> rez = Main.groupNamesByLength(lines);
				// проверка на количество групп . Ожидемый результат 2 группы (4 буквы и 5 букв)
				Assertions.assertEquals(2, rez.size());
				// проверка что список не пуст
				Assertions.assertFalse(rez.isEmpty());

				Assertions.assertTrue(rez.containsKey(5));
				Assertions.assertTrue(rez.containsKey(4));
				Assertions.assertFalse(rez.containsKey(3));

				Assertions.assertEquals(List.of("Betta", "Gosha"), rez.get(5));
				Assertions.assertEquals(List.of("Dana", "Anna", "Ciki", "Goga"), rez.get(4));
		}

		@Test
		void testGroupNamesByLengthWithEmptyLines() {
				// Пустой список
				List<String> lines = Arrays.asList();
				Map<Integer, List<String>> rez = Main.groupNamesByLength(lines);
				// Ожидаемый результат: пустая мапа
				Assertions.assertTrue(rez.isEmpty());
		}

		//5. Метод для поиска уникальных фамилий
		@Test
		void testFfindUniqueSurnamesWithoutLastName() {
				// Список с единственным именем
				List<String> lines = Arrays.asList("Vasiliy");

				Set<String> rez = Main.findUniqueSurnames(lines);
				// фамилии нет должен быть пустой список
				Assertions.assertTrue(rez.isEmpty());
		}

		@Test
		void testFindUniqueSurnamesNull() {
				List<String> lines = Arrays.asList();
				// пустой список
				Set<String> rez = Main.findUniqueSurnames(lines);
				// ожидаю пустой список
				Assertions.assertTrue(rez.isEmpty());
		}

		@Test
		void testFindUniqueSurnames() {
				List<String> lines = Arrays.asList(
						"Jose Edwards",
						"Lisa Herman",
						"Timothy Blake",
						"Dana Mitchell"
				);
				Set<String> rez = Main.findUniqueSurnames(lines);
				// список не пустой
				Assertions.assertFalse(rez.isEmpty());
				// размер 4 записи
				Assertions.assertEquals(4, rez.size());
				// содержит Edwards
				Assertions.assertTrue(rez.contains("Edwards"));
		}

		//6. Метод для создания списка имен, отсортированного в обратном алфавитном порядке
		@Test
		void testSortNamesDescending() {
				List<String> lines = Arrays.asList(
						"Jose",
						"Lisa",
						"Timothy",
						"Dana"
				);

				List<String> rez = Main.sortNamesDescending(lines);
				// ожидаю что список не пустой
				Assertions.assertFalse(rez.isEmpty());
				// ожидаю 4 записи
				Assertions.assertEquals(4, rez.size());
				// ожидаю что список содержит имя Jose
				Assertions.assertTrue(rez.contains("Jose"));
				// ожидаю обратную сортировку
				Assertions.assertEquals("Timothy", rez.get(0));
				Assertions.assertEquals("Lisa", rez.get(1));
				Assertions.assertEquals("Jose", rez.get(2));
				Assertions.assertEquals("Dana", rez.get(3));
		}

		@Test
		void testSortNamesDescendingWithoutNames() {
				List<String> lines = Arrays.asList();
				List<String> rez = Main.sortNamesDescending(lines);
				// ожидаю что список пустой
				Assertions.assertTrue(rez.isEmpty());
		}

		//7. Метод для преобразования данных в формат имя=номер
		@Test
		void testFormatDataAsNamePhoneNumber() {
				List<String> lines = Arrays.asList(
						"124070157636875 - Jose Edwards",
						"4324615121 - Lisa Herman",
						"11593224388 - Timothy Blake"
				);
				Map<String, Long> rez = Main.formatDataAsNamePhoneNumber(lines);
				// Ожидаемый результат: {"Jose Edwards"=12407015763, "Lisa Herman"=4324615121, "Timothy Blake"=1593224388}
				Assertions.assertEquals(3, rez.size());

				Assertions.assertTrue(rez.containsKey("Timothy Blake"));
				Assertions.assertEquals(4324615121L, rez.get("Lisa Herman"));
		}

		@Test
		void testFormatDataAsNamePhoneNumberWithoutLines() {
				List<String> lines = List.of();
				Map<String, Long> rez = Main.formatDataAsNamePhoneNumber(lines);
				//  ожидаю пустую запись
				Assertions.assertEquals(0, rez.size());
		}

		@Test
		void testExtractPhoneNumber() {
				String line = "124070157636875 - Jose Edwards";
				Long rez = Main.extractPhoneNumber(line);
				// ожидаю совпадения номера
				Assertions.assertEquals(124070157636875L, rez);
		}

		@Test
		void testExtractPhoneNumberWithoutNumber() {
				String lines = "No number";
				Long rez = Main.extractPhoneNumber(lines);
				// ожидаю пустую запись так как нет номера
				Assertions.assertNull(rez);
		}

		@Test
		void testExtractPhoneNumberWithShotNumber() {
				String lines = "1240 - Jose Edwards";
				Long rez = Main.extractPhoneNumber(lines);
				// ожидаю пустую запись так как номер короткий
				Assertions.assertNull(rez);
		}

		//8. Метод для расчета средней длины имени
		@Test
		void testCalculateAverageNameLength() {
				List<String> lines = Arrays.asList(
						"Jose",
						"Bob",
						"Tim",
						"Daniel");
				double rez = Main.calculateAverageNameLength(lines);

				Assertions.assertEquals(4, rez);
		}

		@Test
		void testCalculateAverageNameLengthNull() {
				List<String> lines = List.of();
				double rez = Main.calculateAverageNameLength(lines);

				Assertions.assertEquals(0.0, rez);
		}

		//9. Метод для создания карты, где ключ - номер телефона, а значение - имя
		@Test
		void testCreatePhoneNumberNameMap() {
				List<String> lines = Arrays.asList(
						"124070157636875 - Jose Edwards",
						"4324615121111 - Lisa Herman",
						"11593224388 - Timothy Blake"
				);
				Map<Long, String> rez = Main.createPhoneNumberNameMap(lines);
				// ожидаю равенство 3 записям
				Assertions.assertEquals(3, rez.size());
				// ожидаю что ключ содержится в мапе
				Assertions.assertTrue(rez.containsKey(11593224388L));
				// утверждаю что значение содержится в мапе
				Assertions.assertTrue(rez.containsValue("Lisa Herman"));

		}

		@Test
		void testCreatePhoneNumberNameMapWithoutLines() {
				List<String> lines = List.of();
				Map<Long, String> rez = Main.createPhoneNumberNameMap(lines);
				// утверждаю что будет пустая запись
				Assertions.assertTrue(rez.isEmpty());
		}

		@Test
		void testCreatePhoneNumberNameMapWithoutName() {
				List<String> lines = Arrays.asList("12405454554");
				Map<Character, Long> rez = Main.createNameFrequencyMap(lines);
				// утверждаю что будет пустая мапа
				Assertions.assertTrue(rez.isEmpty());
		}

		//10. Метод для поиска контактов с максимальной и минимальной длиной имени
		@Test
		void testFindContactWithMaxLength() {
				List<String> lines = Arrays.asList(
						"124070157636875  Jose",
						"4324615121111  Lisa",
						"11593224388  Timothy"
				);

				Map.Entry<String, Integer> rez = Main.findContactWithMaxLength(lines);

				// Ожидаемый результат: {"Timothy ", 7}, так как "Timothy" имеет максимальную длину
				assertEquals("Timothy", rez.getKey());
				assertEquals(7, rez.getValue());
		}

		@Test
		void testFindContactWithMaxLengthWithEmptyLines() {
				// Пустой список строк
				List<String> lines = Arrays.asList();

				Map.Entry<String, Integer> rez = Main.findContactWithMaxLength(lines);

				// Ожидаемый результат: null, так как нет строк
				Assertions.assertNull(rez);
		}

		@Test
		void testFindContactWithMinLength() {
				List<String> lines = Arrays.asList(
						"124070157636875  Jo",
						"4324615121111  Lisa",
						"11593224388  Timothy"
				);

				Map.Entry<String, Integer> rez = Main.findContactWithMinLength(lines);

				// Ожидаемый результат: {"Jo", 2}, так как "Jo" имеет минимальную длину
				assertEquals("Jo", rez.getKey());
				assertEquals(2, rez.getValue());
		}

		@Test
		void testFindContactWithMinLengthWithEmptyLines() {
				// Пустой список строк
				List<String> lines = Arrays.asList();

				Map.Entry<String, Integer> rez = Main.findContactWithMinLength(lines);

				// Ожидаемый результат: null, так как нет строк
				Assertions.assertNull(rez);
		}
}

