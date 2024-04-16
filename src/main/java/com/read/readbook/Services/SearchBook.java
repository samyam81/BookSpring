package com.read.readbook.Services;

import java.util.List;

import com.read.readbook.model.Book;
import com.read.readbook.model.Library;
import com.read.readbook.model.Reading;
import com.read.readbook.model.ShowSeat;

public class SearchBook {
    
    public List<ShowSeat> Searchbook(Book book,Library library,Reading reading){

        List<ShowSeat> available =new ArrayList<>();

        String bname=book.getName();
        String city=library.getLocation();
        Date date=reading.getCdate();

        String sql = "SELECT b.name, l.location, r.cdate FROM Book b, Library l, Reading r";
        
        RowMapper<Object[]> mapper = new RowMapper<Object[]>() {
            @Override
            public Object[] mapRow(ResultSet rs, int rowNum) throws SQLException {
                Object[] result = new Object[3];
                result[0] = rs.getString("name");
                result[1] = rs.getString("location");
                result[2] = rs.getDate("cdate");

                return result; 
            }
        };

        List<Object[]> data = template.query(sql, mapper);

        return data;


        return null;
        
    }
}
