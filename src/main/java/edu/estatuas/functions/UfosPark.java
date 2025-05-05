package edu.estatuas.functions;

import java.util.HashMap;
import java.util.Map;

public class UfosPark {


    private Double fee = 500d;
    private HashMap<String, String> flota;




    public void UfosPark(){}

    public void add(String ufoID){
        flota.putIfAbsent(ufoID, null);
    }

    public void dispatch(CreditCard card){

        for (String numberInFlota : flota.values() ){
            if (card.number() != numberInFlota){
                if (card.pay(fee)){
                    for (String ufo : flota.keySet()){
                        flota.replace(ufo, card.number());
                    }
                }
            }
        }
    }

    public String getUfoOf(String number){
        for (String ufoInFlota : flota.keySet() ){
            if (flota.values().contains(number)){
                return ufoInFlota;
            } else {
                return "Null";
            }
        }
    }

}