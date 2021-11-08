package it.unibo.oop.lab.exception2;

public class NotEnoughFoundsException extends IllegalStateException{

	private static final long serialVersionUID = 1L;
	
	public String toString() {
		return "Not enough money...";
	}
	
	public String getMessage() {
        return this.toString();
    }
	
}	
