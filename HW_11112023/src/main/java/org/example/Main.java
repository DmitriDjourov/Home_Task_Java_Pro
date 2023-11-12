package org.example;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
		public static void main(String[] args) {
				String fileName = "C:\\Users\\Dmitr\\IdeaProjects\\Home_Task_Java_Pro\\HW_11112023\\1.txt";

				List<String> lines = stringTelName(fileName);
				System.out.println(lines);

				//1. Метод для создания мапы, где ключ - первая буква имени, а значение - количество таких имен
				Map<Character, Long> nameFrequencyMap = createNameFrequencyMap(lines);
				System.out.println("Name Frequency Map: " + nameFrequencyMap);

				//2. Метод для нахождения самой часто встречающейся первой буквы в именах
				Optional<String> mostFrequentFirstLetter = findMostFrequentFirstLetter(lines);
				System.out.println("Most Frequent First Letter: " + mostFrequentFirstLetter.orElse("Not found"));

				//3. Метод для создания списка номеров телефонов, где каждый номер преобразован в числовой формат
				List<Long> phoneNumbers = extractPhoneNumbers(lines);
				System.out.println("Phone Numbers: " + phoneNumbers);

				//4. Метод для группировки имен по длине имени
				Map<Integer, List<String>> namesByLength = groupNamesByLength(lines);
				System.out.println("Names by Length: " + namesByLength);

				//5. Метод для поиска уникальных фамилий
				Set<String> uniqueSurnames = findUniqueSurnames(lines);
				System.out.println("Unique Surnames: " + uniqueSurnames);

				//6. Метод для создания списка имен, отсортированного в обратном алфавитном порядке
				List<String> sortedNamesDescending = sortNamesDescending(lines);
				System.out.println("Sorted Names Descending: " + sortedNamesDescending);

				//7. Метод для преобразования данных в формат имя=номер
				Map<String, Long> namePhoneNumberMap = formatDataAsNamePhoneNumber(lines);
				System.out.println("Name=PhoneNumber Map: " + namePhoneNumberMap);

				//8. Метод для расчета средней длины имени
				double averageNameLength = calculateAverageNameLength(lines);
				System.out.println("Average Name Length: " + averageNameLength);

				//9. Метод для создания карты, где ключ - номер телефона, а значение - имя
				Map<Long, String> phoneNumberNameMap = createPhoneNumberNameMap(lines);
				System.out.println("PhoneNumber=Name Map: " + phoneNumberNameMap);

				//10. Метод для поиска контактов с максимальной и минимальной длиной имени
				Map.Entry<String, Integer> maxContact = findContactWithMaxLength(lines);
				System.out.println("Contact with max length: " + maxContact.getKey() + " - " + maxContact.getValue());
				Map.Entry<String, Integer> minContact = findContactWithMinLength(lines);
				System.out.println("Contact with min length: " + minContact.getKey() + " - " + minContact.getValue());
		}

		public static List<String> stringTelName(String fileName) {
				try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
						List<String> listTelName = new ArrayList<>();
						String line;
						while ((line = reader.readLine()) != null) {
								listTelName.add(line);
						}
						return listTelName;
				} catch (IOException e) {
						throw new RuntimeException(e);
				}
		}

		//1. Метод для создания мапы, где ключ - первая буква имени, а значение - количество таких имен
		public static Map<Character, Long> createNameFrequencyMap(List<String> lines) {
				return lines.stream()
						       .map(line -> line.replaceAll("[^a-zA-Z ]", ""))//.replaceAll("[^a-zA-Z]","") будет заменять все символы в каждой строке, которые не являются латинскими буквами, на пустую строку
						       .flatMap(line -> Arrays.stream(line.trim().split("\\s+")))//принимает строку (line), обрезает её пробельными символами с обоих концов (.trim()), а затем разбивает на массив строк, используя пробельные символы в качестве разделителя (split("\\s+")) каждая строка будет преобразована в массив слов, и все эти массивы будут объединены в один плоский поток слов.
						       .filter(name -> !name.isEmpty())//оставит только те строки, которые не являются пустыми.
						       .collect(Collectors.groupingBy(// Групирует по name и берет первый символ из каждой строки (предполагается, что строки не пусты). Подсчитывает количество элементов в каждой группе.
								       name -> name.charAt(0),
								       Collectors.counting()
						       ));
		}

		//2. Метод для нахождения самой часто встречающейся первой буквы в именах
		public static Optional<String> findMostFrequentFirstLetter(List<String> lines) {// String потому что при падении надо дать сообщение. Если без этого, то будтет Optional<Character>
				return lines.stream()
						       .map(line -> line.replaceAll("[^a-zA-Z ]", ""))
						       .flatMap(line -> Arrays.stream(line.trim().split("\\s+")))
						       .filter(name -> !name.isEmpty())
						       .collect(Collectors.groupingBy(
								       name -> name.charAt(0),
								       Collectors.counting()
						       ))
						       .entrySet().stream()
						       .max(Comparator.comparingLong(Map.Entry::getValue))//компаратор сравнивает элементы по значению (getValue()) в каждой записи
						       .map(entry -> String.valueOf(entry.getKey()));//преобразует ключ записи (букву) в строку с помощью String.valueOf()
		}

		//3. Метод для создания списка номеров телефонов, где каждый номер преобразован в числовой формат
		public static List<Long> extractPhoneNumbers(List<String> lines) {
				List<Long> phoneNumbers = new ArrayList<>();

				for (String line : lines) {
						Pattern pattern = Pattern.compile("\\d+"); // Создание шаблона для поиска последовательности цифр
						Matcher matcher = pattern.matcher(line);    // Создание объекта Matcher для поиска соответствий шаблону в строке
						while (matcher.find()) {
								phoneNumbers.add(Long.parseLong(matcher.group())); // Извлечение числа из найденной последовательности цифр и добавление в список
						}
				}
				return phoneNumbers;
		}

		//4. Метод для группировки имен по длине имени
		public static Map<Integer, List<String>> groupNamesByLength(List<String> lines) {
				return lines.stream()
						       .map(line -> line.replaceAll("[^a-zA-Z ]", ""))
						       .flatMap(line -> Arrays.stream(line.trim().split("\\s+")))
						       .filter(name -> !name.isEmpty())
						       .collect(Collectors.groupingBy(s -> s.length()));
		}

		//5. Метод для поиска уникальных фамилий
		public static Set<String> findUniqueSurnames(List<String> lines) {
				Set<String> uniqueSurnames = new HashSet<>();

				for (String line : lines) {
						String[] nameParts = line.split("\\s+");
						if (nameParts.length > 1) {
								uniqueSurnames.add(nameParts[nameParts.length - 1]);
						}
				}
				return uniqueSurnames;
		}


		//6. Метод для создания списка имен, отсортированного в обратном алфавитном порядке
		public static List<String> sortNamesDescending(List<String> lines) {
				return lines.stream()
						       .map(line -> line.replaceAll("[^a-zA-Z ]", ""))
						       .flatMap(line -> Arrays.stream(line.trim().split("\\s+")))
						       .filter(name -> !name.isEmpty())
						       .sorted(Comparator.reverseOrder())
						       .collect(Collectors.toList());
		}

		//7. Метод для преобразования данных в формат имя=номер
		public static Map<String, Long> formatDataAsNamePhoneNumber(List<String> lines) {
				Map<String, Long> namePhoneNumberMap = new HashMap<>();
				for (String line : lines) {
						String name = line.replaceAll("[^a-zA-Z ]", "").trim();
						Long phoneNumber = extractPhoneNumber(line);
						if (!name.isEmpty() && phoneNumber != null) {
								namePhoneNumberMap.put(name, phoneNumber);
						}
				}
				return namePhoneNumberMap;
		}

		public static Long extractPhoneNumber(String line) {
				Pattern pattern = Pattern.compile("\\d+"); // Создание шаблона для поиска последовательности цифр
				Matcher matcher = pattern.matcher(line);    // Создание объекта Matcher для поиска соответствий шаблону в строке
				while (matcher.find()) {
						String phoneNumberString = matcher.group(); // Получение найденной последовательности цифр
						if (phoneNumberString.length() >= 10) { // Проверка, что последовательность цифр имеет длину не менее 10 символов
								return Long.parseLong(phoneNumberString); // Преобразование строки с номером в число типа Long и возврат
						}
				}
				return null; // Возврат null, если не найдено подходящего номера
		}

		//8. Метод для расчета средней длины имени
		public static double calculateAverageNameLength(List<String> lines) {
				return lines.stream()
						       .map(line -> line.replaceAll("[^a-zA-Z]", ""))
						       .flatMap(line -> Arrays.stream(line.trim().split("\\s+")))
						       .filter(name -> !name.isEmpty())
						       .mapToInt(String::length)
						       .average()
						       .orElse(0);
		}

		//9. Метод для создания карты, где ключ - номер телефона, а значение - имя
		public static Map<Long, String> createPhoneNumberNameMap(List<String> lines) {
				Map<Long, String> phoneNumberNameMap = new HashMap<>();
				for (String line : lines) {
						String name = line.replaceAll("[^a-zA-Z ]", "").trim();
						Long phoneNumber = extractPhoneNumber(line);
						if (!name.isEmpty() && phoneNumber != null) {
								phoneNumberNameMap.put(phoneNumber, name);
						}
				}
				return phoneNumberNameMap;
		}

		//10. Метод для поиска контактов с максимальной и минимальной длиной имени
		public static Map.Entry<String, Integer> findContactWithMaxLength(List<String> lines) {
				return lines.stream()
						       .map(line -> line.replaceAll("[^a-zA-Z ]", ""))
						       .flatMap(line -> Arrays.stream(line.trim().split("\\s+")))
						       .filter(name -> !name.isEmpty())
						       .collect(Collectors.toMap(
								       name -> name,
								       String::length,
								       Integer::max,
								       TreeMap::new
						       ))
						       .lastEntry();
		}

		public static Map.Entry<String, Integer> findContactWithMinLength(List<String> lines) {
				return lines.stream()
						       .map(line -> line.replaceAll("[^a-zA-Z ]", ""))
						       .flatMap(line -> Arrays.stream(line.trim().split("\\s+")))
						       .filter(name -> !name.isEmpty())
						       .collect(Collectors.toMap(
								       name -> name,
								       String::length,
								       Integer::min,
								       TreeMap::new
						       ))
						       .firstEntry();
		}
}


