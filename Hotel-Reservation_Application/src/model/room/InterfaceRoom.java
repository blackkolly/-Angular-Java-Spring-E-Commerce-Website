package model.room;
import model.room.enums.RoomType;

public interface InterfaceRoom {
    public String getRoomNumber();
    public Double getRoomPrice();
    public RoomType getRoomType();
    public boolean isVacant();

}
