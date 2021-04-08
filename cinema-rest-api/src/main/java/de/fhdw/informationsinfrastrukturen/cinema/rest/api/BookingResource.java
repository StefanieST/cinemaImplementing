package de.fhdw.informationsinfrastrukturen.cinema.rest.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import generated.cinemaApp.CinemaApp;
import generated.cinemaApp.Reservation;

@Path("/booking")
public class BookingResource {
	
private Exception INIT_ERROR;
	
	@Path("/")
	@Produces(MediaType.TEXT_PLAIN)
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response booking(Integer reservationId) {
		if (this.INIT_ERROR != null)
			return this.status();
		try{
			Reservation res = CinemaApp.getInstance().getReservation(Integer.valueOf(reservationId));
		CinemaApp.getInstance().bookSeat(res);
		String responseText = "You booked a seat in the film " + res.getShowing().getFilm()
				.getName().toString()+ ". Seat: "+ res.getSeat().getNumber().toString()+ ", Row: " 
				+res.getSeat().getRow().getName().toString()+  ". "+ res.getShowing()
				.getRoom().getName().toString()+
				". Price: "+ res.getSeat().getRow().getCategory().getPrice().orElse(0).toString();
		
		return Response.status(200).entity(responseText).build();
		
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
