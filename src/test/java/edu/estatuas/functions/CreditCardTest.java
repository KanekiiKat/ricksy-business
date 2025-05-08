package edu.estatuas.functions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class CreditCardTest {

    private CreditCard card = null;

    @Before
    public void setupCard() {
        card = new CreditCard("Abradolf Lincler", "4916119711304546");
        assertNotNull("CreditCard creada", card);
    }
    @Test public void constructorTest() {  
        assertNotNull("CreditCard creada", card);      
        assertEquals("4916119711304546", card.number());
    }

    @Test
    public void payTestOK() {
        assertTrue(card.pay(2999.0));
        assertEquals(1.0, card.credit(), 0);
    }

    @Test
    public void payTestNOTOK() {
        assertFalse(card.pay(4000));
        assertEquals(3000, card.credit(), 0);
    }


}