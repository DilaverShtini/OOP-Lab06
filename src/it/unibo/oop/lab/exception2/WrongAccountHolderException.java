package it.unibo.oop.lab.exception2;

public class WrongAccountHolderException extends IllegalArgumentException{
	
	private static final long serialVersionUID = 1L;
	
	private final String nameAccount;
	
	public WrongAccountHolderException(final String nameAccount) {
        super();
        this.nameAccount = nameAccount;
    }

    public String toString() {
        return "Account > " + this.nameAccount + " > is not authorized";
    }

    public String getMessage() {
        return this.toString();
    }
}
