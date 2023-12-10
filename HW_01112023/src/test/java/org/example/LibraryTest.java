package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibraryTest {
		// Создаем библиотеку
		static Library library = new Library();

		// Создаем авторов
		Author author = new Author("John Smith", 1999);
		Author author1 = new Author("John S", 1988);

		// Создаем книги
		Book book = new Book("Introduction to Java", author, "978-1234567890", 100);
		Book book2 = new Book("Introduction to Java To", author, "978-1234567891", 10);
		Book book1 = new Book("Introduction to J", author1, "978-1234567111", 100);

		// очищаем библиотеку и заполняем заново перед каждым запуском теста
		@BeforeEach
		void setUp() {
				library.clear();
				library.addBook(book);
				library.addBook(book1);
				library.addBook(book2);
		}

		// Добавляем книгу в библиотеку
		@Test
		void addBookTest() {
				//System.out.println(library.getNumberOfBooks() + "before");
				library.addBook(book);
				library.addBook(book1);
				library.addBook(book2);
				Assertions.assertEquals(3, library.getNumberOfBooks());
		}

		@Test
		void addBookWithIllegalArgumentExceptionTest() {
				//Book book = null;
				Assertions.assertThrows(IllegalArgumentException.class, () -> library.addBook(null));
		}

		// Удаляем книгу из библиотеки
		@Test
		void removeBookTest() {
				//System.out.println(library.getNumberOfBooks() + "before");
				library.removeBook(book1);
				Assertions.assertEquals(2, library.getNumberOfBooks());
		}

		@Test
		void removeBookWithIllegalArgumentExceptionTest() {
				//Book book = null;
				Assertions.assertThrows(IllegalArgumentException.class, () -> library.removeBook(null));
		}

		// Вытаскиваем по автору
		@Test
		void getBooksByAuthorTest() {
				//System.out.println(library.getNumberOfBooks() + "before");
				Assertions.assertEquals(2, library.getBooksByAuthor(author).size());
		}

		// Вытаскиваем сколько всего авторов
		@Test
		void getAllAuthorsTest() {
				//System.out.println(library.getNumberOfBooks() + " before");
				Assertions.assertEquals(2, library.getAllAuthors().size());
		}

		// Вытаскиваем по ISBN
		@Test
		void findBookByISBNTest() {
				Assertions.assertEquals("978-1234567890", library.findBookByISBN("978-1234567890").getIsbn());
		}

		// Вытаскиваем по Title где в названии есть "Java"
		@Test
		void searchBooksByTitleTest() {
				Assertions.assertEquals(2, library.searchBooksByTitle("Java").size());
				//assertTrue(library.searchBooksByTitle("Introduction to Java").contains(book));
		}

		// Добавляем копию книги в библиотеку
		@Test
		void addCopies() {
				//System.out.println(book.getCopies());
				library.addCopies(book, 1);
				Assertions.assertEquals(101, book.getCopies());
		}

		@Test
		void addCopiesWithIllegalArgumentExceptionTest() {
				//Book book = null;
				Assertions.assertThrows(IllegalArgumentException.class, () -> library.addCopies(null, 1));
		}

		// Выдаем книжку из библиотеки
		@Test
		void lendBookTest() {
				//System.out.println(book.getCopies());
				library.lendBook(book);
				Assertions.assertEquals(99, book.getCopies());
		}

		@Test
		void lendBookWithNullIllegalArgumentExceptionTest() {
				//Book book = null;
				Assertions.assertThrows(IllegalArgumentException.class, () -> library.lendBook(null));
		}

		@Test
		void lendBookWithMinusIllegalArgumentExceptionTest() {
				book.setCopies(0);
				Assertions.assertThrows(IllegalArgumentException.class, () -> library.lendBook(book));
		}

		// Возврат книги в библиотеку
		@Test
		void returnBookTest() {
				//System.out.println(book.getCopies());
				library.returnBook(book);
				Assertions.assertEquals(101, book.getCopies());
		}

		@Test
		void returnBookIllegalArgumentExceptionTest() {
				//Book book = null;
				Assertions.assertThrows(IllegalArgumentException.class, () -> library.returnBook(null));
		}
}