

import java.util.Optional;

import db.executer.PersistenceException;
import generated.cinemaApp.Balcony;
import generated.cinemaApp.Box;
import generated.cinemaApp.Category;
import generated.cinemaApp.CinemaApp;
import generated.cinemaApp.Film;
import generated.cinemaApp.Room;
import generated.cinemaApp.Row;
import generated.cinemaApp.Stall;

public class initialiseCinema {

	public static void main(String[] args) throws PersistenceException {		
		CinemaApp cinema = CinemaApp.getInstance();
		Stall front = Stall.getInstance();
		front.setName("Stall");
		front.setPrice(6);
		Box middle = Box.getInstance();
		middle.setName("Box");
		middle.setPrice(9);
		Balcony back = Balcony.getInstance();
		back.setName("Balcony");
		back.setPrice(12);
		
		Film pets = Film.createFresh("Pets");
		Film zootopia = Film.createFresh("Zootopia");
		Film madagascar = Film.createFresh("Madagascar");
		
		Room roomOne = Room.createFresh("Room1", false);
		roomOne.setUpRoom(6,10);
		//roomOne.openRoom(room);
		
		
		
		
	//new Stall(1,Optional.of("Stall"), Optional.of(6), true);

	}

}
