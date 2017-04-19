package org.itsimulator.germes.app.infra.exception.base;

public class AppException extends RuntimeException{
	private static final long serialVersionUID = 7837501112802868980L;

	public AppException(String message, Throwable cause) {
		super(message, cause);
	}

	public AppException(String message) {
		super(message);
	}	

}
