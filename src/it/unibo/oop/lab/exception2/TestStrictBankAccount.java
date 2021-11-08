package it.unibo.oop.lab.exception2;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

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
    
    	//too many transactions
    	try {
    		for(int i=0; i<10; i++) {
    			account1.depositFromATM(user1.getUserID(), 1_000);
    		}
    		account1.depositFromATM(user1.getUserID(), 2_000);
    		fail("The exception should be for too many transactions");
    	}catch(TransactionsOverQuotaException e) {
    		System.out.println(e);
    	}
    	
    	//wrong account
    	try {
    		account2.deposit(user1.getUserID(), 500);
    		fail("Wrong user!");
    	}catch(WrongAccountHolderException e) {
    		assertNotNull(e);
    	}
    	
    	//not enough founds
    	try {
            account1.withdraw(user1.getUserID(), 1_000_000);
        } catch (NotEnoughFoundsException e) {
        	System.out.println(e);
        } catch (Exception e) {
        	fail();
        }
    	
    }

}
