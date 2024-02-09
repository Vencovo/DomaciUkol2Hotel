import engeto.ukol2.com.Bookings;
import engeto.ukol2.com.Guests;
import engeto.ukol2.com.Rooms;

import java.awt.print.Book;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guests guest1 = new Guests("Adéla Malíková",
                LocalDate.of(1993, 3, 13));
        Guests guest2 = new Guests("Jana Dvořáková",
                LocalDate.of(1995,5,5));
        Guests guest3 = new Guests("Franta Bohdan",
                LocalDate.of(1994,1,2));

        Rooms room1 = new Rooms("1", 1,true, true, 1000);
        Rooms room2 = new Rooms("2", 1,true, true, 1000);
        Rooms room3 = new Rooms("3", 3, false, true,2400);

        Bookings reservation1 = new Bookings(LocalDateTime.of(2021,1,25,14,30,22), LocalDate.of(2021,7,19), LocalDate.of(2021,7,26),"Working stay", room1, guest1);
        Bookings reservation2 = new Bookings(LocalDateTime.of(2021,7,29,15,32,2), LocalDate.of(2021,9,1), LocalDate.of(2021,9,14), "Holiday", room3, guest2);
        Bookings reservation3 = new Bookings(LocalDateTime.of(2021,7,29,15,32,2), LocalDate.of(2021,9,1), LocalDate.of(2021,9,14), "Holiday", room3, guest1);
        Bookings reservation4 = new Bookings(LocalDateTime.of(2021,7,29,15,32,2), LocalDate.of(2021,9,1), LocalDate.of(2021,9,14), "Holiday", room2, guest3);
        Bookings reservation5 = new Bookings(LocalDateTime.of(2021,10,15,16,40,55), LocalDate.of(2021,12,10), LocalDate.of(2022,1,5), "Holiday", room1, guest3);


        List<Guests> guestList = new ArrayList<>();
        guestList.add(guest1);
        guestList.add(guest2);
        guestList.add(guest3);

        List<Bookings> reservationList = new ArrayList<>();
        reservationList.add(reservation1);
        reservationList.add(reservation2);
        reservationList.add(reservation3);
        reservationList.add(reservation4);
        reservationList.add(reservation5);

        int i = 0;
        for (Guests guest : guestList) {
            System.out.println(i+": "+guest.getGuestName()+" "+guest.getGuestBirthDate());
            i++;
        }

        System.out.println(reservationList);



    }
}