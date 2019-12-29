package Exceptions;

public class WrongTemperatureException extends Exception {
	int temperature;

	public WrongTemperatureException(String message, int temperature) {
		super(message);
		this.temperature = temperature;
	}
}
