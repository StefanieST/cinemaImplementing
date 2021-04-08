package de.fhdw.informationsinfrastrukturen.cinema.rest.api;

import org.junit.jupiter.api.Test;

import generated.cinemaApp.CinemaApp;

public class RowResourceTest {
	@Test
	 public void getAllRows() throws Exception {
		CinemaApp cinema = CinemaApp.getInstance();
       RowResource showing = new RowResource();
      
      
       

       System.out.println(showing.rowInfo().getEntity());
      
   }

}

