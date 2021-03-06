package de.fhdw.informationsinfrastrukturen.cinema.rest.api;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONArray;
import org.json.JSONObject;

import generated.cinemaApp.CinemaApp;
import generated.cinemaApp.Showing;

@Path("/showingInfo")
public class ShowingResource {
	
	private Exception INIT_ERROR;

	@Path("/")
	@Produces(MediaType.TEXT_PLAIN)
	@GET
	public Response showingInfo() {
		if (this.INIT_ERROR != null)
			return this.status();
		try {
			JSONArray allShowings = new JSONArray();
			Collection<Integer> showingIds = CinemaApp.getInstance().getAllShowings();
			
			for (Integer showing : showingIds) {
			JSONObject showingObject = new JSONObject();	
			showingObject.put("showingId", showing);
			showingObject.put("filmName", CinemaApp.getInstance().getShowing(showing).getFilm().getName());
			showingObject.put("roomId", CinemaApp.getInstance().getShowing(showing).getRoom().getId());
			allShowings.put(showingObject);
			}
			
			return Response.status(200).entity(allShowings).build();
		} catch (Exception e) {
			return Response.status(400).entity("There are no information about Showing.").build();
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



