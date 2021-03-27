package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Optional;

import org.junit.Test;

import generated.cinemaApp.Booking;
import generated.cinemaApp.CinemaApp;
import generated.cinemaApp.Film;
import generated.cinemaApp.ModelException;
import generated.cinemaApp.NotAvailable;
import generated.cinemaApp.Person;
import generated.cinemaApp.Reservation;
import generated.cinemaApp.Room;
import generated.cinemaApp.Row;
import generated.cinemaApp.Showing;
import generated.cinemaApp.Stall;

public class BookingTest {
	
	@Test
	public void bookSeat() throws ModelException, NotAvailable {
		CinemaApp.getInstance();
		Stall front = Stall.getInstance();
		front.setPrice(6);
		
		Person person = Person.createFresh("Stefanie");
		Person person1 = Person.createFresh("Marc");
		
		Film harry = Film.createFresh("Harry Potter 2");
		Room room = Room.createFresh("Room 3");
		Row rowAroom = Row.createFresh(front, "B", room);
			rowAroom.createSeatsPerRow(3);
		Showing harry2RoomThree = Showing.createFresh(harry, room);	
		
		Reservation reserve = CinemaApp.getInstance().reserveSeat(person, harry2RoomThree, rowAroom);
		Reservation reserve1 = CinemaApp.getInstance().reserveSeat(person1, harry2RoomThree, rowAroom);
		
		Booking book = CinemaApp.getInstance().bookSeat(person, harry2RoomThree);
		Booking book1 = CinemaApp.getInstance().bookSeat(person1, harry2RoomThree);

		assertEquals(reserve.getBooking(), Optional.of(book));
		assertEquals(reserve1.getBooking(), Optional.of(book1));
	}
	
	@Test
	public void bookSeatWithoutReservation() throws ModelException, NotAvailable {
		CinemaApp.getInstance();
		Stall front = Stall.getInstance();
		front.setPrice(6);
		
		Person person = Person.createFresh("Stefanie");
		Person person1 = Person.createFresh("Marc");
		
		Film harry = Film.createFresh("Harry Potter 2");
		Room room = Room.createFresh("Room 3");
		Row rowAroom = Row.createFresh(front, "B", room);
			rowAroom.createSeatsPerRow(3);
		Showing harry2RoomThree = Showing.createFresh(harry, room);	
		
		Reservation reserve = CinemaApp.getInstance().reserveSeat(person, harry2RoomThree, rowAroom);
		
		Booking book = CinemaApp.getInstance().bookSeat(person, harry2RoomThree);

		assertEquals(reserve.getBooking(), Optional.of(book));
		
		assertThrows(
                ModelException.class,
                () -> CinemaApp.getInstance().bookSeat(person1, harry2RoomThree),
                "The person did not do a reservation");
	}
}
