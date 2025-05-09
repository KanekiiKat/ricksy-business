package edu.estatuas.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Receptivo {
    private static Optional<Receptivo> instancia = Optional.empty();
    private final List<GuestDispatcher> observers = new ArrayList();
    

    
    private  Receptivo(){}

    public static Receptivo getReceptivo(){
        if (instancia.isEmpty()){
            instancia = Optional.of(new Receptivo()); 
        }
        return instancia.get();
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
