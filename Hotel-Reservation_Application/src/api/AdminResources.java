package api;

import model.customer.Customer;
import model.room.InterfaceRoom;
import service.customer.CustomerService;
import service.reservation.ReservationService;

import java.util.Collection;
import java.util.List;

public class AdminResources {
    private static final AdminResources SINGLETON = new AdminResources();

    private final CustomerService customerService = CustomerService.getSingleton();
    private final ReservationService reservationService = ReservationService.getSingleton();

    private AdminResources() {}

    public static AdminResources getSingleton() {
        return SINGLETON;
    }

    public Customer getCustomer(String email) {
        return customerService.getCustomer(email);
    }

    public void addRoom(List<InterfaceRoom> rooms) {
        rooms.forEach(reservationService::addRoom);
    }

    public Collection<InterfaceRoom> getAllRooms() {
        return reservationService.getAllRooms();
    }

    public Collection<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    public void displayAllReservations() {
        reservationService.printAllReservation();
    }
}
