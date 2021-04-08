package de.fhdw.informationsinfrastrukturen.cinema.rest.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



import generated.cinemaApp.CinemaApp;
import generated.cinemaApp.Person;
import generated.cinemaApp.Reservation;
import generated.cinemaApp.Row;
import generated.cinemaApp.Showing;

@Path("/reservation")
public class ReservationResource {

	private Exception INIT_ERROR;
	
	@Path("/")
	@Produces(MediaType.TEXT_PLAIN)
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response reservation(ReservationRequest res) {
		if (this.INIT_ERROR != null)
			return this.status();
		try{
			Person user = Person.createFresh(res.name);
		Showing showing = CinemaApp.getInstance().getShowing(res.showingId);
		Row row = CinemaApp.getInstance().getRow(res.rowId);
		Reservation reservation = CinemaApp.getInstance().reserveSeat(user, showing, row);
		
		return Response.status(200).entity(reservation.getId()).build();
		
		}catch (Exception e) {
			return Response.status(400).entity(e.getMessage()).build(); 
		}
	}
	
	@Path("/status")
	@Produces(MediaType.TEXT_PLAIN)
	@GET
	public Response status() {
		if (this.INIT_ERROR == null)
			return Response.status(200).entity("Successful connection to server 🚀!").build();
		else
			return Response.status(500).entity("Connection to server failed.").build();
	}
}
