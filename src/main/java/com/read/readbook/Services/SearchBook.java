package com.read.readbook.Services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.read.readbook.model.Book;
import com.read.readbook.model.Library;
import com.read.readbook.model.Reading;
import com.read.readbook.model.ShowSeat;

@Service
public class SearchBook {
    
    private JdbcTemplate template; 
    
    @SuppressWarnings("deprecation")
    public List<ShowSeat> searchBook(Book book, Library library, Reading reading) {

        @SuppressWarnings("unused")
        List<ShowSeat> availableSeats = new ArrayList<>();

        String bname = book.getName();
        String city = library.getLocation();
        Date date = reading.getCdate();

        String sql = "SELECT * FROM Showseat WHERE book_name = ? AND library_location = ? AND reading_date = ?";
        
        RowMapper<ShowSeat> mapper = new RowMapper<ShowSeat>() {
            @SuppressWarnings("null")
            @Override
            public ShowSeat mapRow(ResultSet rs, int rowNum) throws SQLException {
                ShowSeat seat = new ShowSeat();
                seat.setSeatId(rs.getInt("seat_id"));
                seat.setReserved(rs.getBoolean("reserved"));
                seat.setPrice(rs.getInt("price"));
                seat.setShift(rs.getString("shift").charAt(0));

             
                seat.setBook(book);
                seat.setLibrary(library);
                seat.setReading(reading);

                return seat; 
            }
        };

      
        List<ShowSeat> seats = template.query(sql, new Object[]{bname, city, date}, mapper);

        return seats;
    }
}
