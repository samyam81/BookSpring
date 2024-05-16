package com.read.readbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.read.readbook.Repo.LibraryRepo;
import com.read.readbook.model.Library;

@SpringBootApplication
public class ReadbookApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(ReadbookApplication.class, args);

		Library library1=context.getBean(Library.class);

		library1.setLibraryID(111);
		library1.setName("Ss40");
		library1.setLocation("Kathmandu");

		LibraryRepo repo=context.getBean(LibraryRepo.class);

		try {
			System.out.println(repo.findAllLibraries());
		} catch (Exception e) {
			System.out.println("Error..");
		}
		

	}

}
