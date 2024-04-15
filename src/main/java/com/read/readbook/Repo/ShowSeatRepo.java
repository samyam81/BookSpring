package com.read.readbook.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.read.readbook.model.ShowSeat;

public class ShowSeatRepo {
    
    @Autowired
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(ShowSeat seat) {
       String sql = "INSERT INTO Seat(seatId, reserved, price, shift) VALUES (?, ?, ?, ?)";
       int rows = template.update(sql, seat.getSeatId(), seat.isReserved(), seat.getPrice(), seat.getShift());
       System.out.println("Rows Affected: " + rows);
    }

}
