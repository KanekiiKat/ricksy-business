package edu.estatuas.functions;

import java.util.ArrayList;
import java.util.List;

public class Receptivo {
    private static Receptivo instancia = null;
    private final List<GuestDispatcher> observers = new ArrayList();
    

    
    private  Receptivo(){}

    public static Receptivo getReceptivo(){
        if (instancia == null){
            instancia = new Receptivo(); 
        }
        return instancia;
    }

    public void registra(GuestDispatcher registro){
        
        this.observers.add(registro);
        
    }

    public void dispatch(CreditCard card){

        for (GuestDispatcher observer : observers){
            observer.dispatch(card);
        }
        
    }

    

}
