package com.read.readbook.Repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.read.readbook.model.LibraryHall;

@Repository
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

    public List<LibraryHall> findAllLibraryHalls(){

    String sql = "SELECT * FROM LibraryHall";
    
    RowMapper<LibraryHall> mapper = new RowMapper<LibraryHall>() {
        @SuppressWarnings("null")
        @Override
        public LibraryHall mapRow(ResultSet rs, int rowNum) throws SQLException{
            LibraryHall hall = new LibraryHall();
            hall.setHallname(rs.getString("hallname"));
            hall.setCapacity(rs.getInt("capacity"));
            hall.setHallID(rs.getInt("hallID"));

            return hall; 
        }
    };

    List<LibraryHall> halls = template.query(sql, mapper);

    return halls;
}

    @SuppressWarnings("deprecation")
    public LibraryHall findLibraryHallByID(int hallID){

    String sql = "SELECT * FROM LibraryHall WHERE hallID = ?";
    
    RowMapper<LibraryHall> mapper = new RowMapper<LibraryHall>() {
        @SuppressWarnings("null")
        @Override
        public LibraryHall mapRow(ResultSet rs, int rowNum) throws SQLException{
            LibraryHall hall = new LibraryHall();
            hall.setHallname(rs.getString("hallname"));
            hall.setCapacity(rs.getInt("capacity"));
            hall.setHallID(rs.getInt("hallID"));

            return hall;
        }
    };

    List<LibraryHall> halls = template.query(sql, new Object[]{hallID}, mapper);

    if (halls.isEmpty()) {
        return null; // No hall found with the given ID
    } else {
        return halls.get(0); // Return the first hall found with the given ID
    }
}


}
