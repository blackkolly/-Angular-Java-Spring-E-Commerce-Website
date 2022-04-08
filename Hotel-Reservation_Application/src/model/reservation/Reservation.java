package model.reservation;
import model.customer.Customer;
import model.room.InterfaceRoom;
import java.util.Date;

public class Reservation {
    private final Customer customer;
    private final Date checkInDate;
    private final Date checkOutDate;
    private final InterfaceRoom room;

    public Reservation(Customer customer,Date checkInDate,Date checkOutDate,InterfaceRoom room){
        this.customer = customer;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.room = room;
    }
    public InterfaceRoom getRoom(){
        return room;
    }public Date getCheckInDate(){
        return checkInDate;
    }
    public Date getCheckOutDate() {
        return checkOutDate;
    }
    @Override
    public String toString(){
        return "Customer detail " + customer + "Room details " + room
                + "\nCheck in date: " + checkInDate
                + "\nCheck out date: " + checkOutDate;
    }
}

