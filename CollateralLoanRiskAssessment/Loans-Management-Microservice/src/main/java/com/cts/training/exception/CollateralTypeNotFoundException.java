package com.cts.training.exception;
/**
 * CollateralTypeNotFoundException
 */
public class CollateralTypeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * CollateralTypeNotFoundException contructor
	 * @param message
	 */
	public CollateralTypeNotFoundException(String message) {
		super(message);
	}

}
