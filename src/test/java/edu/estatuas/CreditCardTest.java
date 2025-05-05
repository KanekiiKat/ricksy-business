package edu.estatuas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import edu.estatuas.functions.CreditCard;

public class CreditCardTest {

    CreditCard card = new CreditCard("Morty","2382462136741273484");

    @Test
    public void getNumberTest(){
        assertEquals("2382462136741273484", card.number());
    }

    @Test
    public void payTest(){
        assertTrue(card.pay(105.0));
    }

}