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
	public Response income(@PathParam("showingId") String showingId) {
		try {
			Showing showing = CinemaApp.getInstance().getShowing(Integer.valueOf(showingId));
			return Response.status(200).entity(CinemaApp.getInstance().calculateIncome(showing)).build();
		} catch (Exception e) {
			return Response.status(400).entity("The requested showing id does not exist.").build();
		}

		// Url?username=Hugo&showing=1

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
