package engeto.ukol2.com;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Bookings {
    private LocalDateTime dateOfReservation;
    private LocalDate dateOfBookingFrom;
    private LocalDate dateOfBookingTo;
    private String typeOfVacation;
    private Rooms room;
    private Guests guest;

    public Bookings(LocalDateTime dateOfReservation, LocalDate dateOfBookingFrom, LocalDate dateOfBookingTo, String typeOfVacation, Rooms room, Guests guest) {
        this.dateOfReservation = dateOfReservation;
        this.dateOfBookingFrom = dateOfBookingFrom;
        this.dateOfBookingTo = dateOfBookingTo;
        this.typeOfVacation = typeOfVacation;
        this.room = room;
        this.guest = guest;
    }

    public LocalDateTime getDateOfReservation() {
        return dateOfReservation;
    }

    public void setDateOfReservation(LocalDateTime dateOfReservation) {
        this.dateOfReservation = dateOfReservation;
    }

    public LocalDate getDateOfBookingFrom() {
        return dateOfBookingFrom;
    }

    public void setDateOfBookingFrom(LocalDate dateOfBookingFrom) {
        this.dateOfBookingFrom = dateOfBookingFrom;
    }

    public LocalDate getDateOfBookingTo() {
        return dateOfBookingTo;
    }

    public void setDateOfBookingTo(LocalDate dateOfBookingTo) {
        this.dateOfBookingTo = dateOfBookingTo;
    }

    public String getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(String typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

    public Rooms getRoom() {
        return room;
    }

    public void setRoom(Rooms room) {
        this.room = room;
    }
    public Guests getGuest() {
        return guest;
    }

    public void setGuest(Guests room) {
        this.guest = guest;
    }

    @Override
    public String toString() {
        return "Reservation - " +
                "{Start of reservation = " + dateOfBookingFrom +
                ", End of reservation = " + dateOfBookingTo +
                ", Vacation = " + typeOfVacation + '\'' +
                ", Room number = " + room +
                ", Guest name = " + guest +
                '}';
    }
}

