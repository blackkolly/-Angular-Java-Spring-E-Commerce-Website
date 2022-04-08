package model.room;
import model.room.enums.RoomType;

import java.util.Objects;

public class Room implements InterfaceRoom {
    private final String roomNumber;
    private final Double roomPrice;
    private final RoomType enumeration;

    public Room (String roomNumber, Double roomPrice,RoomType enumeration){
        this.roomNumber = roomNumber;
        this.roomPrice = roomPrice;
        this.enumeration = enumeration;
    }
    public String getRoomNumber(){
      return roomNumber;

    }
    public Double getRoomPrice() {
        return roomPrice;
    }
    public RoomType getRoomType() {
        return enumeration;
    }
    public boolean isVacant(){
        return roomPrice != null && roomPrice.equals(0);
    }
    @Override
    public String toString(){
        return "Room Number: " + roomNumber
                + " Price: $" + roomPrice
                + " Enumeration: " + enumeration;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }

        if(!(obj instanceof Room)) {
            return false;
        }

        final Room room = (Room) obj;
        return Objects.equals(roomNumber, room.roomNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNumber);
    }
}
