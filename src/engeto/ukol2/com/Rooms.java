package engeto.ukol2.com;

import java.time.LocalDate;

public class Rooms {
    private String numberOfRoom;
    private int bedsInRoom;
    private boolean withBalcon;
    private boolean withSeaViews;
    private double costsRoom;




//Region kon.

    public Rooms(String numberOfRoom, int bedsInRoom, boolean withBalcon, boolean withSeaViews, double costsRoom) {
        this.numberOfRoom = numberOfRoom;
        this.bedsInRoom = bedsInRoom;
        this.withBalcon = withBalcon;
        this.withSeaViews = withSeaViews;
        this.costsRoom = costsRoom;
    }

//endregion kon.

//Region get.a.sett

    public String getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(String numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getBedsInRoom() {
        return bedsInRoom;
    }

    public void setBedsInRoom(int bedsInRoom) {
        this.bedsInRoom = bedsInRoom;
    }

    public boolean isWithBalcon() {
        return withBalcon;
    }

    public void setWithBalcon(boolean withBalcon) {
        this.withBalcon = withBalcon;
    }

    public boolean isWithSeaViews() {
        return withSeaViews;
    }

    public void setWithSeaViews(boolean withSeaViews) {
        this.withSeaViews = withSeaViews;
    }

    public double getCostsRoom() {
        return costsRoom;
    }

    public void setCostsRoom(double costsRoom) {
        this.costsRoom = costsRoom;
    }



//endregion get.a.sett


    @Override
    public String toString() {
        return numberOfRoom;
    }
}