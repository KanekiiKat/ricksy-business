package edu.estatuas.functions;

import java.util.HashMap;
import java.util.Map;

public class UfosPark {


    private Double fee = 500d;
    private HashMap<String, String> flota = new HashMap<>();




    public void UfosPark(){}

    public void add(String ufoID){
        flota.putIfAbsent(ufoID, null);
    }

    public void dispatch(CreditCard card){

        for (String numberInFlota : flota.values() ){
            if (card.number() != numberInFlota){
                if (card.pay(fee)){
                    for (String ufo : flota.keySet())
                        flota.replace( ufo, null, card.number());
                        break;
                }
            }
        }
    }

    public String getUfoOf(String number){
        String ufo = "";
        for (Map.Entry<String, String> flota : flota.entrySet()){
            if (flota.getValue().equals(number)){
                return flota.getKey();
            } else {
                ufo = "Null";
                break;
            }
            
        }
        return ufo;
    } 

}