package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.Test;

import db.executer.PersistenceException;
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

public class ShowingTest {
	@Test
	public void getAllShowings() throws ModelException, NotAvailable{
		CinemaApp.getInstance();
		
		CinemaApp.getInstance().getAllShowings().forEach(System.out::println);

//		assertEquals(reserve.getBooking(), Optional.of(book));
//		assertEquals(reserve1.getBooking(), Optional.of(book1));
	}
}
