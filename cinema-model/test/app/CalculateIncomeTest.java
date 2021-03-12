package app;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import generated.cinemaApp.Booking;
import generated.cinemaApp.CinemaApp;
import generated.cinemaApp.Film;
import generated.cinemaApp.ModelException;
import generated.cinemaApp.Reservation;
import generated.cinemaApp.Room;
import generated.cinemaApp.Row;
import generated.cinemaApp.Showing;
import generated.cinemaApp.Stall;
import generated.cinemaApp.Person;
public class CalculateIncomeTest {
	
	@Test
	public void calculateIncomeOfShowingHarryPotterRoomThree() throws ModelException {
		CinemaApp.getInstance();
		Stall front = Stall.getInstance();
		front.setPrice(6);
		
		Person person = Person.createFresh("Stefanie");
		
		Film harry = Film.createFresh("Harry Potter");
		Room room = Room.createFresh("Room 3");
		Row rowAroom = Row.createFresh(front, "A", room);
			rowAroom.createSeatsPerRow(6);
		Showing harryRoomThree = Showing.createFresh(harry, room);	
		
		Reservation reservationOne = Reservation.createFresh(person, rowAroom.getSeats().get(0), harryRoomThree);
		Reservation reservationTwo = Reservation.createFresh(person, rowAroom.getSeats().get(1), harryRoomThree);
		Reservation reservationThree = Reservation.createFresh(person, rowAroom.getSeats().get(2), harryRoomThree);
		
		Booking bookingOne = Booking.createFresh();
		reservationOne.setBooking(bookingOne);
		Booking bookingTwo = Booking.createFresh();
		reservationTwo.setBooking(bookingTwo);
		Booking bookingThree = Booking.createFresh();
		reservationThree.setBooking(bookingThree);
		
		assertEquals(rowAroom.getSeats().size(), 6);
		assertEquals(CinemaApp.getInstance().calculateIncome(harryRoomThree), 18);
	}

}