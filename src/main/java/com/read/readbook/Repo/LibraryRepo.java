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

    public void save(Library Libray){
        String sql="Insert into Libray(id,name,location,TotalCapacity)& values(?,?,?,?)";
        int rows=template.update(sql,Libray.getLibraryID(),Libray.getLocation(),Libray.getName(),Libray.getTotalcapacity());
        System.out.println("Rows Affected:::"+rows);    
    }
}
