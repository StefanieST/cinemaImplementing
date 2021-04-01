package de.fhdw.informationsinfrastrukturen.cinema.rest.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.ws.rs.core.Response;

import org.junit.jupiter.api.Test;

import generated.cinemaApp.CinemaApp;


public class ReservationRessourceTest {

	@Test
	public void reservationTest() throws Exception{
		CinemaApp.getInstance();
	ReservationRequest user = new ReservationRequest();
    user.name = "Marc";
    user.showingId = 217;
    user.rowId = 75;
   
    ReservationRequest user1 = new ReservationRequest();
    user1.name = "Stefanie";
    user1.showingId = 217;
    user1.rowId = 75;
   
    ReservationRequest user2 = new ReservationRequest();
    user2.name = "Andres";
    user2.showingId = 217;
    user2.rowId = 75; 
    
    ReservationResource res = new ReservationResource();
    Response reservation1 = res.reservation(user);
    System.out.println(reservation1.getEntity());
    assertEquals(200, reservation1.getStatus());
    assertEquals(200, res.reservation(user1).getStatus());
    assertEquals(200, res.reservation(user2).getStatus());
    
	}
	
	@Test
	public void reservationTestIfThereIsNoSeatAvailable() throws Exception{
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
	  
	ReservationRequest user3 = new ReservationRequest();
    user3.name = "Justin";
    user3.showingId = 217;
    user3.rowId = 30;
    
    ReservationRequest user4 = new ReservationRequest();
    user4.name = "Prinz";
    user4.showingId = 217;
    user4.rowId = 30;
    
    ReservationRequest user5 = new ReservationRequest();
    user5.name = "Prinzessin";
    user5.showingId = 217;
    user5.rowId = 30;
    
    ReservationResource res = new ReservationResource();
    
    Response reservation1 = res.reservation(user);
    System.out.println(reservation1.getEntity());
    assertEquals(200, reservation1.getStatus());
    
    assertEquals(200, res.reservation(user1).getStatus());
    
    assertEquals(200, res.reservation(user2).getStatus());
    
    assertEquals(200, res.reservation(user3).getStatus());
    
    assertEquals(200, res.reservation(user4).getStatus());
    
    Response noReservation = res.reservation(user5);
    assertEquals(400, noReservation.getStatus());
    System.out.println(noReservation.getEntity());
    
	}
}
