package it.unibo.oop.lab.exception2;

public class TransactionsOverQuotaException extends IllegalStateException{
	
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "Too many transactions...";
	}
	
	public String getMessage() {
        return this.toString();
    }
	
}
