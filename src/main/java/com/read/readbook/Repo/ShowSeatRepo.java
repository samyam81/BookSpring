package com.read.readbook.Repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

// import org.springframework.lang.Nullable;

import com.read.readbook.model.ShowSeat;

@Repository
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

    public List<ShowSeat> findAllShowseats(){

    String sql = "SELECT * FROM Showseat";
    
    RowMapper<ShowSeat> mapper = new RowMapper<ShowSeat>() {
        @SuppressWarnings("null")
        @Override
        public ShowSeat mapRow(ResultSet rs, int rowNum) throws SQLException{
            ShowSeat showseat = new ShowSeat();
            showseat.setSeatId(rs.getInt("seatId"));
            showseat.setReserved(rs.getBoolean("reserved"));
            showseat.setPrice(rs.getInt("price"));
            showseat.setShift(rs.getString("shift").charAt(0));

            return showseat; // Returning the Showseat object 'showseat', not the class name.
        }
    };

    List<ShowSeat> showseats = template.query(sql, mapper);

    return showseats;
}

}
