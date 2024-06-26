package com.read.readbook.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.read.readbook.model.ShowSeat;

@Service
public class ReserveSeats {
    
    public void reserveSeat(boolean reserved, List<ShowSeat> seatList) {
        for (int i = 0; i < seatList.size(); i++) {
            ShowSeat seat = seatList.get(i);
            if (!reserved && !seat.isReserved()) {
                System.out.println("Seat index: " + i);
            } else if (reserved) {
                seat.setReserved(true);
            }
        }
    }
}

