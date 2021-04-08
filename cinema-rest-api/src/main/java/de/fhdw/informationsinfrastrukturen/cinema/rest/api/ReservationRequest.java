package de.fhdw.informationsinfrastrukturen.cinema.rest.api;

import java.io.Serializable;

public class ReservationRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String name;
	Integer showingId;
	Integer rowId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getShowingId() {
		return showingId;
	}
	public void setShowingId(Integer showingId) {
		this.showingId = showingId;
	}
	public Integer getRowId() {
		return rowId;
	}
	public void setRowId(Integer rowId) {
		this.rowId = rowId;
	}
	
	
}
