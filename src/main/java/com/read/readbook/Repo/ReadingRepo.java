package com.read.readbook.Repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.read.readbook.model.Reading;

public class ReadingRepo {

    @Autowired
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Reading attendance) {
        String sql = "INSERT INTO Attendance(cdate, shift) VALUES (?, ?)";
        int rows = template.update(sql, attendance.getCdate(), attendance.getShift());
        System.out.println("Rows Affected: " + rows);
    }


    public List<Reading> findAll(){

    String sql = "SELECT * FROM Reading";
    
    RowMapper<Reading> mapper = new RowMapper<Reading>() {
        @Override
        public Reading mapRow(@SuppressWarnings("null") ResultSet rs, int rowNum) throws SQLException{
            Reading reading = new Reading();
            reading.setCdate(rs.getDate("cdate"));
            reading.setShift(rs.getString("shift").charAt(0));

            return reading; 
        }
    };

    List<Reading> readings = template.query(sql, mapper);

    return readings;
}

    public List<Reading> findByShift(char shift){

    String sql = "SELECT * FROM Reading WHERE shift = ?";
    
    RowMapper<Reading> mapper = new RowMapper<Reading>() {
        @Override
        public Reading mapRow(ResultSet rs, int rowNum) throws SQLException{
            Reading reading = new Reading();
            reading.setCdate(rs.getDate("cdate"));
            reading.setShift(rs.getString("shift").charAt(0));

            return reading; // Returning the Reading object 'reading', not the class name.
        }
    };

    List<Reading> readings = template.query(sql, new Object[]{shift}, mapper);

    return readings;
}

}
