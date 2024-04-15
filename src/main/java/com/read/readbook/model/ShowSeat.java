package com.read.readbook.model;

import org.springframework.stereotype.Component;

@Component
public class ShowSeat {

//     CREATE TABLE ShowSeat (
//     SeatNo INT PRIMARY KEY,
//     Reserved BOOLEAN,
//     Price INT,
//     Shift CHAR(1), 
//     FOREIGN KEY (Shift) REFERENCES reading(Shift) 
// );

    private int seatId;
    private boolean reserved;
    private int price;
    private char shift;

    public int getSeatId() {
        return seatId;
    }
    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }
    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }


    public char getShift() {
        return shift;
    }

    public void setShift(Reading reading) {
        char shift;
        shift=reading.getShift();
        this.shift = shift;
    }

    public void setShift(char shift){
        this.shift=shift;
    }

    @Override
    public String toString() {
        return "ShowSeat [seatId=" + seatId + ", reserved=" + reserved + ", price=" + price + ", shift=" + shift + "]";
    }

}
