package de.fhdw.informationsinfrastrukturen.cinema.rest.api;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import generated.cinemaApp.CinemaApp;
import generated.cinemaApp.Person;
import generated.cinemaApp.Reservation;


public class IncomeResourceTest {
	
	
	@Test
	 public void getTheIncomeIfShowingExists() throws Exception {
		CinemaApp cinema = CinemaApp.getInstance();
        IncomeResource inc = new IncomeResource();
        
		Person person = Person.createFresh("Stefanie");
		Person person1 = Person.createFresh("Marc");
		Person person2 = Person.createFresh("Andres");
		
		Reservation reservation1 = cinema.reserveSeat(person, cinema.getShowing(217),cinema.getRow(30));
		Reservation reservation2 = cinema.reserveSeat(person1, cinema.getShowing(217),cinema.getRow(75));
		Reservation reservation3 = cinema.reserveSeat(person2, cinema.getShowing(217),cinema.getRow(115));

		cinema.bookSeat(cinema.getReservation(reservation1.getId()));
        cinema.bookSeat(cinema.getReservation(reservation2.getId()));
        cinema.bookSeat(cinema.getReservation(reservation3.getId()));
       
        

        System.out.println(inc.income("217").getEntity());
        assertNotNull(inc.income("217").getEntity());
        assertEquals("33", inc.income("217").getEntity());
    }
	@Test
	 public void getNoIncomeIfShowingDoesNotExist() throws Exception{
		CinemaApp cinema = CinemaApp.getInstance();
        IncomeResource inc = new IncomeResource();
        
		Person person = Person.createFresh("Justin");
		Reservation reservation1 = cinema.reserveSeat(person, cinema.getShowing(217),cinema.getRow(30));
		cinema.bookSeat(cinema.getReservation(reservation1.getId()));
		
		assertEquals("The requested showing id does not exist.", inc.income("1").getEntity()); 
		
	}
	
}