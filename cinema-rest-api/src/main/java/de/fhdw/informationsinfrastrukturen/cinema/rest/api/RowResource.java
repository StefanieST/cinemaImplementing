package de.fhdw.informationsinfrastrukturen.cinema.rest.api;

import java.util.Collection;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONArray;
import org.json.JSONObject;

import generated.cinemaApp.CinemaApp;

@Path("/rowInfo")
public class RowResource {
	
	private Exception INIT_ERROR;

	@Path("/")
	@Produces(MediaType.TEXT_PLAIN)
	@GET
	public Response rowInfo() {
		if (this.INIT_ERROR != null)
			return this.status();
		try {
			
			JSONArray allRows = new JSONArray();
		
			Collection<Integer> rowIds = CinemaApp.getInstance().getAllRows();
			
				for (Integer rowId : rowIds) {
					JSONObject rowObject = new JSONObject();
					rowObject.put("roomId",CinemaApp.getInstance().getRow(rowId).getRoom().getId());
					rowObject.put("rowId",rowId);
					rowObject.put("rowName", CinemaApp.getInstance().getRow(rowId).getName());
					rowObject.put("rowCategorie",CinemaApp.getInstance().getRow(rowId).getCategory().getName().orElse("nN"));
					rowObject.put("categoriePreis", CinemaApp.getInstance().getRow(rowId).getCategory().getPrice().orElse(0));
				allRows.put(rowObject);
			}
			
			return Response.status(200).entity(allRows).build();
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
