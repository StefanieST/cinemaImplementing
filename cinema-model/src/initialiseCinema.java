


import generated.cinemaApp.Balcony;
import generated.cinemaApp.Box;
import generated.cinemaApp.CinemaApp;
import generated.cinemaApp.Film;
import generated.cinemaApp.ModelException;
import generated.cinemaApp.Room;
import generated.cinemaApp.Row;
import generated.cinemaApp.Stall;

public class initialiseCinema {

	public static void main(String[] args) throws ModelException {		
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
		
		Room roomOne = Room.createFresh("Room 1");
		Row rowAroomOne = Row.createFresh(front, "A", roomOne);
			rowAroomOne.createSeatsPerRow(5);
		Row rowBroomOne = Row.createFresh(front, "B", roomOne);
			rowBroomOne.createSeatsPerRow(6);
		Row rowCroomOne = Row.createFresh(middle, "C", roomOne);
			rowCroomOne.createSeatsPerRow(7);
		Row rowDroomOne= Row.createFresh(middle, "D", roomOne);
			rowDroomOne.createSeatsPerRow(8);
		Row rowEroomOne = Row.createFresh(back, "E", roomOne);
			rowEroomOne.createSeatsPerRow(9);
		Row rowFroomOne = Row.createFresh(back, "F", roomOne);
			rowFroomOne.createSeatsPerRow(10);
		
		
		Room roomTwo = Room.createFresh("Room 2");
		Row rowAroomTwo = Row.createFresh(front, "A", roomTwo);
			rowAroomTwo.createSeatsPerRow(5);
		Row rowBroomTwo = Row.createFresh(front, "B", roomTwo);
			rowBroomTwo.createSeatsPerRow(5);
		Row rowCroomTwo = Row.createFresh(middle, "C", roomTwo);
			rowCroomTwo.createSeatsPerRow(5);
		Row rowDroomTwo= Row.createFresh(middle, "D", roomTwo);
			rowDroomTwo.createSeatsPerRow(5);
		Row rowEroomTwo = Row.createFresh(back, "E", roomTwo);
			rowEroomTwo.createSeatsPerRow(5);
		Row rowFroomTwo = Row.createFresh(back, "F", roomTwo);
			rowFroomTwo.createSeatsPerRow(5);

	}

}
