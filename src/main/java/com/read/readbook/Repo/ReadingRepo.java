package com.read.readbook.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

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

}
