package app;

import org.junit.Test;

import generated.cinemaApp.CinemaApp;
import generated.cinemaApp.ModelException;
import generated.cinemaApp.NotAvailable;

public class RowTest {
	@Test
	public void getAllRooms() throws ModelException, NotAvailable{
		CinemaApp.getInstance();
		
		CinemaApp.getInstance().getAllRows().forEach(System.out::println);

}
}
