package db.executer;

import generated.cinemaApp.ModelException;

public class PersistenceException extends ModelException {
	public PersistenceException(String message) {
		super("Exception when trying to communicate with database: " + message);
	}
}
