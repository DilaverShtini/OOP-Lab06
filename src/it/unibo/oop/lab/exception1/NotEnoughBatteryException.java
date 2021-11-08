package it.unibo.oop.lab.exception1;

public class NotEnoughBatteryException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private final int batteryLevel;
	private final int batteryRequired;
	
	public NotEnoughBatteryException(int batteryLevel, int batteryRequired) {
		super();
		this.batteryLevel = batteryLevel;
		this.batteryRequired = batteryRequired;
	}
		
	public String toString() {
        return "Can not move, level battery is low > " + this.batteryLevel + ", you need " + this.batteryRequired; 
    }
	
	public String getMessage() {
        return this.toString();
    }
}
