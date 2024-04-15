package com.read.readbook.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.read.readbook.model.Book;

@Repository
public class BookRepo {

    @Autowired
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

public void save(Book book) {
    String sql = "INSERT INTO Book(name, detail, pages, language, genre, bookID) VALUES (?, ?, ?, ?, ?, ?)";
    int rows = template.update(sql, book.getName(), book.getDetail(), book.getPages(), book.getLanguage(), book.getGenre(), book.getBookID());
    System.out.println("Rows Affected: " + rows);
}

    
}
