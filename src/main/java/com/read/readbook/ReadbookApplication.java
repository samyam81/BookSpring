package com.read.readbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.read.readbook.Repo.BookRepo;
import com.read.readbook.Repo.LibraryRepo;
import com.read.readbook.model.Book; // Import your custom Book class
import com.read.readbook.model.Library;

@SpringBootApplication
public class ReadbookApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ReadbookApplication.class, args);

		Library library1 = context.getBean(Library.class);

		library1.setLibraryID(111);
		library1.setName("Ss40");
		library1.setLocation("Kathmandu");

		LibraryRepo repo = context.getBean(LibraryRepo.class);

		try {
			System.out.println(repo.findAllLibraries());
		} catch (Exception e) {
			System.out.println("Error..LibraryRepo");
		}

		// Uncommented and corrected part
		ConfigurableApplicationContext context2 = SpringApplication.run(ReadbookApplication.class, args);
		Book book1 = context2.getBean(Book.class);
		book1.setName("The Great Gatsby");
		book1.setDetail("A novel by F. Scott Fitzgerald");
		book1.setPages(180);
		book1.setLanguage("English");
		book1.setGenre("Fiction");
		book1.setBookID(123456);

		BookRepo repo2=context2.getBean(BookRepo.class);
		try {
			System.out.println(repo2.findBooksByGenre("Fiction"));
		} catch (Exception e) {
			System.out.println("Error..BookRepo");
		}

	}

}
