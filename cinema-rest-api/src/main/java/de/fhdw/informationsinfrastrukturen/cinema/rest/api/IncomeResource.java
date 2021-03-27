package de.fhdw.informationsinfrastrukturen.cinema.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import generated.cinemaApp.CinemaApp;
import generated.cinemaApp.ModelException;
import generated.cinemaApp.Showing;

@Path("/income")
public class IncomeResource {
	private Exception INIT_ERROR;

	@Path("/{showingId}")
	@Produces(MediaType.TEXT_PLAIN)
	@GET
	public Integer income(@PathParam("showingId") String showingId) throws ModelException {
		Showing showing = CinemaApp.getInstance().getShowing(Integer.valueOf(showingId));
		return CinemaApp.getInstance().calculateIncome(showing);
		// Url?username=Hugo&showing=1

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
