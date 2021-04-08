package de.fhdw.informationsinfrastrukturen.cinema.rest.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.ws.rs.core.Response;

import org.junit.jupiter.api.Test;

import generated.cinemaApp.CinemaApp;

public class BookingResourceTest {
	
	@Test
	public void bookingTest() throws Exception{
		CinemaApp.getInstance();
	ReservationRequest user = new ReservationRequest();
    user.name = "Marc";
    user.showingId = 217;
    user.rowId = 30;
   
    ReservationRequest user1 = new ReservationRequest();
    user1.name = "Stefanie";
    user1.showingId = 217;
    user1.rowId = 30;
   
    ReservationRequest user2 = new ReservationRequest();
    user2.name = "Andres";
    user2.showingId = 217;
    user2.rowId = 30; 
    
    ReservationResource res = new ReservationResource();
    Response reservation = res.reservation(user);
    Response reservation1 = res.reservation(user1);
    Response reservation2 = res.reservation(user2);
    
    BookingResource book = new BookingResource();
    Response booking = book.booking(Integer.valueOf(reservation.getEntity().toString()));
    System.out.println(booking.getEntity());
    assertEquals(200, booking.getStatus());
    assertEquals(200, book.booking(Integer.valueOf(reservation1.getEntity().toString())).getStatus());
    assertEquals(200, book.booking(Integer.valueOf(reservation2.getEntity().toString())).getStatus());
    
    
	}
	
	@Test
	public void reservationTestIfThereIsNoSeatAvailable() throws Exception{
		CinemaApp.getInstance();
	ReservationRequest user3 = new ReservationRequest();
    user3.name = "Justin";
    user3.showingId = 217;
    user3.rowId = 30;
    
    ReservationResource res = new ReservationResource();
    Response reservation = res.reservation(user3);
    
    BookingResource book = new BookingResource();
    Response booking = book.booking(Integer.valueOf(reservation.getEntity().toString()));
    assertEquals(200, booking.getStatus());
    
    Response oneMoreTryToBook = book.booking(Integer.valueOf(reservation.getEntity().toString()));
    assertEquals(400, oneMoreTryToBook.getStatus());
    System.out.println(oneMoreTryToBook.getEntity());
    
	}

}
