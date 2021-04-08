package de.fhdw.informationsinfrastrukturen.cinema.rest.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import generated.cinemaApp.CinemaApp;

@ApplicationPath("")
public class App extends Application {
	
	public App(){
		CinemaApp.getInstance();
		
	}
}
