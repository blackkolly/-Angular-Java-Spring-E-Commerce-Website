package api;

import model.customer.Customer;
import model.reservation.Reservation;
import model.room.InterfaceRoom;
import service.customer.CustomerService;
import service.reservation.ReservationService;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;

public class HotelResources {
    private static final HotelResources SINGLETON = new HotelResources();

    private final CustomerService customerService = CustomerService.getSingleton();
    private final ReservationService reservationService = ReservationService.getSingleton();

    private HotelResources() {}

    public static HotelResources getSingleton() {
        return SINGLETON;
    }

    public Customer getCustomer(String email) {
        return customerService.getCustomer(email);
    }

    public void createACustomer(String email, String firstName, String lastName) {
        customerService.addCustomer(firstName, lastName, email);
    }

    public InterfaceRoom getRoom(String roomNumber) {
        return reservationService.getARoom(roomNumber);
    }

    public Reservation bookARoom(String customerEmail, InterfaceRoom room, Date checkInDate, Date checkOutDate) {
        return reservationService.reserveARoom(getCustomer(customerEmail), room, checkInDate, checkOutDate);
    }

    public Collection<Reservation> getCustomersReservations(String customerEmail) {
        final Customer customer = getCustomer(customerEmail);

        if (customer == null) {
            return Collections.emptyList();
        }

        return reservationService.getCustomersReservation(getCustomer(customerEmail));
    }

    public Collection<InterfaceRoom> findARoom(final Date checkIn, final Date checkOut) {
        return reservationService.findRooms(checkIn, checkOut);
    }

    public Collection<InterfaceRoom> findAlternativeRooms(final Date checkIn, final Date checkOut) {
        return reservationService.findAlternativeRooms(checkIn, checkOut);
    }

    public Date addDefaultPlusDays(final Date date) {
        return reservationService.addDefaultPlusDays(date);
    }
}



