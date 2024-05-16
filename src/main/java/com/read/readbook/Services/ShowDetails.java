package com.read.readbook.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.read.readbook.model.ShowSeat;
@Service
public class ShowDetails {
    private List<ShowSeat> showSeats;

    public ShowDetails() {
        this.showSeats = new ArrayList<>();
    }

    public void addShowSeat(ShowSeat showSeat) {
        showSeats.add(showSeat);
    }

    public void printReservedSeats() {
        List<ShowSeat> reservedSeats = new ArrayList<>();
        for (ShowSeat seat : showSeats) {
            if (seat.isReserved()) {
                reservedSeats.add(seat);
            }
        }
        System.out.println("Reserved seats:");
        for (ShowSeat seat : reservedSeats) {
            System.out.println(seat);
        }
    }
}
