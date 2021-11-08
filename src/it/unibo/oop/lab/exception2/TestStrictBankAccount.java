package it.unibo.oop.lab.exception2;

import org.junit.Test;

/**
 * JUnit test to test
 * {@link StrictBankAccount}.
 * 
 */
public final class TestStrictBankAccount {

    /**
     * Used to test Exceptions on {@link StrictBankAccount}.
     */
    @Test
    public void testBankOperations() {
        /*
         * 1) Creare due StrictBankAccountImpl assegnati a due AccountHolder a
         * scelta, con ammontare iniziale pari a 10000 e nMaxATMTransactions=10
         * 
         * 2) Effetture un numero di operazioni a piacere per verificare che le
         * eccezioni create vengano lanciate soltanto quando opportuno, cioè in
         * presenza di un id utente errato, oppure al superamento del numero di
         * operazioni ATM gratuite.
         */
    	final AccountHolder user1 = new AccountHolder("Marco", "Verdi", 1);
    	final AccountHolder user2 = new AccountHolder("Alessio", "Rossi", 2);
    	
    	final StrictBankAccount account1 = new StrictBankAccount(user1.getUserID(), 10_000, 10);
    	final StrictBankAccount account2 = new StrictBankAccount(user2.getUserID(), 10_000, 10);
    }
}
