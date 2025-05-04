package edu.estatuas.functions;

import java.util.HashMap;

public class UfosPark {


    private Double fee;
    private HashMap<String, String> flota;




    public void UfosPark(){}

    public void add(String ufo){
        flota.putIfAbsent(ufo, null);
    }

    public void dispatch(CreditCard card){
        
    }

    

}
