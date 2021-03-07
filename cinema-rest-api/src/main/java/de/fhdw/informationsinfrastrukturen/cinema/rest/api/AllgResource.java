package de.fhdw.informationsinfrastrukturen.cinema.rest.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import db.executer.PersistenceException;
import generated.cinemaApp.CinemaApp;
import generated.cinemaApp.Room;
import generated.cinemaApp.Showing;

public class AllgResource {
	
	private Exception INIT_ERROR;
	
	
	@Path("/income/{income}")
	@Produces(MediaType.TEXT_PLAIN)
	@GET
	public Response income(@PathParam("film") String film, @PathParam("room") String room) throws PersistenceException {
		
		
		
		return null;
		
	}

	
	@Path("/status")
	@Produces(MediaType.TEXT_PLAIN)
	@GET
	public Response status() {
		if (this.INIT_ERROR == null)
			return Response.status(200).entity("1 nice api 🚀").build();
		else
			return Response.status(500).entity("1 nice api 🚀  if working").build();
	}

}
