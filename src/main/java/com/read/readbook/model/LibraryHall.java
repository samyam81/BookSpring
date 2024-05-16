package com.read.readbook.model;

import org.springframework.stereotype.Component;

@Component
public class LibraryHall {

//     create table Libraryhall(
//     Name VARCHAR(50),
//     TotalSeats INT,
//     HallID INT Primary key
//     );

    private String hallname;
    private int capacity;
    private int hallID;
    
    public int getHallID() {
        return hallID;
    }
    public void setHallID(int hallID) {
        this.hallID = hallID;
    }
    public String getHallname() {
        return hallname;
    }
    public void setHallname(String hallname) {
        this.hallname = hallname;
    }
    
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "LibraryHall [hallname=" + hallname + ", capacity=" + capacity + ", hallID=" + hallID + "]";
    }
    
}
