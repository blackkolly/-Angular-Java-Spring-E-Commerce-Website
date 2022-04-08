package service.reservation;

import model.customer.Customer;
import model.reservation.Reservation;
import model.room.InterfaceRoom;


import java.util.stream.Collectors;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class ReservationService {
     private static final ReservationService SINGLETON  = new ReservationService();
     private static final int DEFAULT_DAYS = 7;

     private final Map<String, InterfaceRoom> rooms = new HashMap<>();
     private final Map<String,Collection<Reservation>> reservations = new HashMap<>();

     private ReservationService() {}

     public static ReservationService getSingleton() {
          return SINGLETON;
     }

     public void addRoom(final InterfaceRoom room) {
          rooms.put(room.getRoomNumber(), room);
     }

     public InterfaceRoom getARoom(final String roomNumber) {
          return rooms.get(roomNumber);
     }

     public Collection<InterfaceRoom> getAllRooms() {
          return rooms.values();
     }

     public Reservation reserveARoom(final Customer customer, final InterfaceRoom room,
                                     final Date checkInDate, final Date checkOutDate) {
          final Reservation reservation = new Reservation(customer,checkInDate,checkOutDate,room);

          Collection<Reservation> customerReservations = getCustomersReservation(customer);

          if (customerReservations == null) {
               customerReservations = new LinkedList<>();
          }

          customerReservations.add(reservation);
          reservations.put(customer.getEmail(), customerReservations);

          return reservation;
     }

     public Collection<InterfaceRoom> findRooms(final Date checkInDate, final Date checkOutDate) {
          return findAvailableRooms(checkInDate, checkOutDate);
     }

     public Collection<InterfaceRoom> findAlternativeRooms(final Date checkInDate, final Date checkOutDate) {
          return findAvailableRooms(addDefaultPlusDays(checkInDate), addDefaultPlusDays(checkOutDate));
     }

     private Collection<InterfaceRoom> findAvailableRooms(final Date checkInDate, final Date checkOutDate) {
          final Collection<Reservation> allReservations = getAllReservations();
          final Collection<InterfaceRoom> notAvailableRooms = new LinkedList<>();

          for (Reservation reservation : allReservations) {
               if (reservationOverlaps(reservation, checkInDate, checkOutDate)) {
                    notAvailableRooms.add(reservation.getRoom());
               }
          }

          return rooms.values().stream().filter(room -> notAvailableRooms.stream()
                          .noneMatch(notAvailableRoom -> notAvailableRoom.equals(room)))
                  .collect(Collectors.toList());
     }

     public Date addDefaultPlusDays(final Date date) {
          Calendar calendar = Calendar.getInstance();
          calendar.setTime(date);
          calendar.add(Calendar.DATE, DEFAULT_DAYS);

          return calendar.getTime();
     }

     private boolean reservationOverlaps(final Reservation reservation, final Date checkInDate,
                                         final Date checkOutDate){
          return checkInDate.before(reservation.getCheckOutDate())
                  && checkOutDate.after(reservation.getCheckInDate());
     }

     public Collection<Reservation> getCustomersReservation(final Customer customer) {
          return reservations.get(customer.getEmail());
     }

     public void printAllReservation() {
          final Collection<Reservation> reservations = getAllReservations();

          if (reservations.isEmpty()) {
               System.out.println("No reservations found.");
          } else {
               for (Reservation reservation : reservations) {
                    System.out.println(reservation + "\n");
               }
          }
     }

     private Collection<Reservation> getAllReservations() {
          final Collection<Reservation> allReservations = new LinkedList<>();

          for(Collection<Reservation> reservations : reservations.values()) {
               allReservations.addAll(reservations);
          }

          return allReservations;
     }
}

