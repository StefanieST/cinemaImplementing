package app;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import generated.cinemaApp.CinemaApp;
import generated.cinemaApp.Film;
import generated.cinemaApp.ModelException;
import generated.cinemaApp.NotAvailable;
import generated.cinemaApp.Reservation;
import generated.cinemaApp.Room;
import generated.cinemaApp.Row;
import generated.cinemaApp.Showing;
import generated.cinemaApp.Stall;
import generated.cinemaApp.Person;
public class ReserveSeatTest {
	
	@Test
	public void reserveSeatIfSeatIsAvailable() throws ModelException, NotAvailable {
		CinemaApp.getInstance();
		Stall front = Stall.getInstance();
		front.setPrice(6);
		
		Person person = Person.createFresh("Stefanie");
		
		Film harry = Film.createFresh("Harry Potter 2");
		Room room = Room.createFresh("Room 3");
		Row rowAroom = Row.createFresh(front, "B", room);
			rowAroom.createSeatsPerRow(3);
		Showing harry2RoomThree = Showing.createFresh(harry, room);	
		Reservation start = CinemaApp.getInstance().reserveSeat(person, harry2RoomThree, rowAroom);
		
		assertEquals(rowAroom.getSeats().size(), 3);
		assertEquals(start.getPerson().getName(), person.getName());
		assertEquals(start.getShowing(), harry2RoomThree);
		assertEquals(start.getSeat(), rowAroom.getSeats().get(0));
	}
	
	@Test
	public void reserveThrowsExceptionIfSeatIsNotAvailable() throws ModelException {
		CinemaApp.getInstance();
		Stall front = Stall.getInstance();
		front.setPrice(6);
		
		Person person = Person.createFresh("Stefanie");
		Person person1 = Person.createFresh("Marc");
		Person person2 = Person.createFresh("Andres");
				
		Film harry = Film.createFresh("Harry Potter 2");
		Room room = Room.createFresh("Room 3");
		Row rowAroom = Row.createFresh(front, "B", room);
			rowAroom.createSeatsPerRow(2);
		Showing harry2RoomThree = Showing.createFresh(harry, room);	
		
		Reservation.createFresh(person, rowAroom.getSeats().get(0), harry2RoomThree);
		Reservation.createFresh(person1, rowAroom.getSeats().get(1), harry2RoomThree);
		
		
		
		assertEquals(rowAroom.getSeats().size(), 2);
		 assertThrows(
	                NotAvailable.class,
	                () -> CinemaApp.getInstance().reserveSeat(person2, harry2RoomThree, rowAroom),
	                "A seat in the selected Row is not available!");
	}

}
