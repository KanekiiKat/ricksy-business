package edu.estatuas.functions;

import java.util.ArrayList;
import java.util.List;

public class Receptivo {

    private final List<GuestDispatcher> observers = new ArrayList();
    
    public Receptivo(){}

    
    public void registra(GuestDispatcher registro){
        
        this.observers.add(registro);
        
    }

    public void dispatch(CreditCard card){

        for (GuestDispatcher observer : observers){
            observer.dispatch(card);
        }
        
    }

}
