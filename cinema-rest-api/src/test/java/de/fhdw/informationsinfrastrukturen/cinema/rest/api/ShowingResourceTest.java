package de.fhdw.informationsinfrastrukturen.cinema.rest.api;

import org.junit.jupiter.api.Test;

import generated.cinemaApp.CinemaApp;

public class ShowingResourceTest {
	@Test
	 public void getAllShowings() throws Exception {
		CinemaApp cinema = CinemaApp.getInstance();
       ShowingResource showing = new ShowingResource();
      
      
       

       System.out.println(showing.showingInfo().getEntity());
      
   }

}
