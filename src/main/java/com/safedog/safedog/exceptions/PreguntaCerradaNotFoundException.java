package com.safedog.safedog.exceptions;

public class PreguntaCerradaNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public PreguntaCerradaNotFoundException(Long id) {
		super("El conjunto de preguntas cerradas con el Id: " + id + " no existe." );
	}
}
