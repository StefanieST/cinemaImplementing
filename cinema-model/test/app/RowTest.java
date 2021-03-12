package app;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import generated.cinemaApp.ModelException;
import generated.cinemaApp.Room;
import generated.cinemaApp.Row;
import generated.cinemaApp.Stall;
public class RowTest {
	
	@Test
	public void create6SeatsPerRow() throws ModelException {
		
		Stall front = Stall.getInstance();
		Room room = Room.createFresh("Room 2");
		Row rowAroom = Row.createFresh(front, "A", room);
			rowAroom.createSeatsPerRow(6);
			
		assertEquals(rowAroom.getSeats().size(), 6);
		assertEquals(rowAroom.getCategory(), front);
		assertEquals(rowAroom.getTheObject().getRoom(), room);
		assertEquals(rowAroom.getTheObject().getName(), "A");
	}

}
