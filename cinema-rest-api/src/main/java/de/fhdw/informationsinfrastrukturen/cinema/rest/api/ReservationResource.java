package de.fhdw.informationsinfrastrukturen.cinema.rest.api;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;



import generated.cinemaApp.CinemaApp;
import generated.cinemaApp.ModelException;
import generated.cinemaApp.NotAvailable;
import generated.cinemaApp.Person;
import generated.cinemaApp.Row;
import generated.cinemaApp.Showing;

@Path("/reservation")
public class ReservationResource {

	@POST
	@Path("/")
	public Response reservation(ReservationRequest res) throws ModelException, NotAvailable {
		Person user = Person.createFresh(res.name);
		Showing showing = CinemaApp.getInstance().getShowing(res.showingId);
		Row row = CinemaApp.getInstance().getRow(res.rowId);
		CinemaApp.getInstance().reserveSeat(user, showing, row);
		
		return Response.ok("Successful reservation!").build();
		
	}
}
