package com.read.readbook.Repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.read.readbook.model.Library;

public class LibraryRepo {
    
    @Autowired
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Library library) {
     String sql = "INSERT INTO Library(id, name, location, TotalCapacity) VALUES (?, ?, ?, ?)";
     int rows = template.update(sql, library.getLibraryID(), library.getName(), library.getLocation(), library.getTotalcapacity());
     System.out.println("Rows Affected: " + rows);
    }

    public List<Library> findAllLibraries(){

    String sql = "SELECT * FROM Library";
    
    RowMapper<Library> mapper = new RowMapper<Library>() {
        @SuppressWarnings("null")
        @Override
        public Library mapRow(ResultSet rs, int rowNum) throws SQLException{
            Library library = new Library();
            library.setName(rs.getString("name"));
            library.setTotalcapacity(rs.getInt("totalcapacity"));
            library.setLocation(rs.getString("location"));
            library.setLibraryID(rs.getInt("LibraryID"));

            return library; // Returning the Library object 'library', not the class name.
        }
    };

    List<Library> libraries = template.query(sql, mapper);

    return libraries;
}

    @SuppressWarnings("deprecation")
    public List<Library> findLibrariesByLocation(String location){

    String sql = "SELECT * FROM Library WHERE location = ?";
    
    RowMapper<Library> mapper = new RowMapper<Library>() {
        @SuppressWarnings("null")
        @Override
        public Library mapRow(ResultSet rs, int rowNum) throws SQLException{
            Library library = new Library();
            library.setName(rs.getString("name"));
            library.setTotalcapacity(rs.getInt("totalcapacity"));
            library.setLocation(rs.getString("location"));
            library.setLibraryID(rs.getInt("LibraryID"));

            return library; 
        }
    };

    List<Library> libraries = template.query(sql, new Object[]{location}, mapper);

    return libraries;
}

}
