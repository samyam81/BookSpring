package com.read.readbook.Repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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

    public List<Book> findAllBooks(){

    String sql = "SELECT * FROM Book";
    
    RowMapper<Book> mapper = new RowMapper<Book>() {
        @SuppressWarnings("null")
        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException{
            Book book = new Book();
            book.setName(rs.getString("name"));
            book.setDetail(rs.getString("detail"));
            book.setPages(rs.getInt("pages"));
            book.setLanguage(rs.getString("Language"));
            book.setGenre(rs.getString("genre"));
            book.setBookID(rs.getInt("bookID"));

            return book; 
        }
    };

    List<Book> books = template.query(sql, mapper);

    return books;
}

    @SuppressWarnings("deprecation")
    public List<Book> findBooksByName(String name){

    String sql = "SELECT * FROM Book WHERE name = ?";
    
    RowMapper<Book> mapper = new RowMapper<Book>() {
        @SuppressWarnings("null")
        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException{
            Book book = new Book();
            book.setName(rs.getString("name"));
            book.setDetail(rs.getString("detail"));
            book.setPages(rs.getInt("pages"));
            book.setLanguage(rs.getString("Language"));
            book.setGenre(rs.getString("genre"));
            book.setBookID(rs.getInt("bookID"));

            return book; 
        }
    };

    List<Book> books = template.query(sql, new Object[]{name}, mapper);

    return books;
}


    @SuppressWarnings("deprecation")
    public List<Book> findBooksByGenre(String genre){

    String sql = "SELECT * FROM Book WHERE genre = ?";
    
    RowMapper<Book> mapper = new RowMapper<Book>() {
        @SuppressWarnings("null")
        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException{
            Book book = new Book();
            book.setName(rs.getString("name"));
            book.setDetail(rs.getString("detail"));
            book.setPages(rs.getInt("pages"));
            book.setLanguage(rs.getString("Language"));
            book.setGenre(rs.getString("genre"));
            book.setBookID(rs.getInt("bookID"));

            return book;
        }
    };

    List<Book> books = template.query(sql, new Object[]{genre}, mapper);

    return books;
}

    @SuppressWarnings("deprecation")
    public List<Book> findBooksByLanguage(String language){

    String sql = "SELECT * FROM Book WHERE Language = ?";
    
    RowMapper<Book> mapper = new RowMapper<Book>() {
        @SuppressWarnings("null")
        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException{
            Book book = new Book();
            book.setName(rs.getString("name"));
            book.setDetail(rs.getString("detail"));
            book.setPages(rs.getInt("pages"));
            book.setLanguage(rs.getString("Language"));
            book.setGenre(rs.getString("genre"));
            book.setBookID(rs.getInt("bookID"));

            return book; 
        }
    };

    List<Book> books = template.query(sql, new Object[]{language}, mapper);

    return books;
}

    @SuppressWarnings("deprecation")
    public List<Book> findBooks(String name, String genre, String language){

    String sql = "SELECT * FROM Book WHERE 1=1";
    List<Object> params = new ArrayList<>();
    
    if (name != null) {
        sql += " AND name = ?";
        params.add(name);
    }
    
    if (genre != null) {
        sql += " AND genre = ?";
        params.add(genre);
    }

    if (language != null) {
        sql += " AND Language = ?";
        params.add(language);
    }
    
    RowMapper<Book> mapper = new RowMapper<Book>() {
        @SuppressWarnings("null")
        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException{
            Book book = new Book();
            book.setName(rs.getString("name"));
            book.setDetail(rs.getString("detail"));
            book.setPages(rs.getInt("pages"));
            book.setLanguage(rs.getString("Language"));
            book.setGenre(rs.getString("genre"));
            book.setBookID(rs.getInt("bookID"));

            return book; 
        }
    };

    List<Book> books = template.query(sql, params.toArray(), mapper);

    return books;
}

    
}
