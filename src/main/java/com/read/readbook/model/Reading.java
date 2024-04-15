package com.read.readbook.model;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class Reading {
    
// CREATE TABLE reading (
//     createdON DATE,
//     Shift CHAR(1) PRIMARY KEY
// );

    private Date cdate;
    private char shift;

    public Date getCdate() {
        return cdate;
    }
    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }
    
    public char getShift() {
        return shift;
    }
    public void setShift(char shift) {
        this.shift = shift;
    }

    
    @Override
    public String toString() {
        return "Reading [cdate=" + cdate + ", shift=" + shift + "]";
    }

    
}
