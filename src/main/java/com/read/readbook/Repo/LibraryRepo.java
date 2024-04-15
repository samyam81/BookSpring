package com.read.readbook.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

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

}
