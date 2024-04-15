package com.read.readbook.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.read.readbook.model.LibraryHall;

public class LibraryHallRepo {

    @Autowired
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

      public void save(LibraryHall LibraryHall){
        String sql="Insert into LibraryHall(hallname,capacity,hallID) & values(?,?,?)";
        int rows=template.update(sql,LibraryHall.getCapacity(),LibraryHall.getHallID(),LibraryHall.getHallname());
        System.out.println("Rows Affected:::"+rows);
    }
}
