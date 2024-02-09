package engeto.ukol2.com;

import java.time.LocalDate;

public class Guests {
    private String guestName;
    private LocalDate guestBirthDate;

    public Guests(String guestName, LocalDate guestBirthDate) {
        this.guestName = guestName;
        this.guestBirthDate = guestBirthDate;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public LocalDate getGuestBirthDate() {
        return guestBirthDate;
    }

    public void setGuestBirthDate(LocalDate guestBirthDate) {
        this.guestBirthDate = guestBirthDate;
    }

    @Override
    public String toString() {
        return guestName;
    }
}
