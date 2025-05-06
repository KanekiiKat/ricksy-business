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

        for (Map.Entry<String, String> ovni : flota.entrySet()){
            if (card.number() != ovni.getValue() && card.pay(fee)){
                for (String ufo : flota.keySet())
                    if (ovni.getValue() == null)
                    flota.replace( ufo, null , card.number());
                    break;
            }
        }
    }

    public String getUfoOf(String number){
        String ufo = "";
        for (Map.Entry<String, String> ovni : flota.entrySet()){
            if (flota.containsValue(number)){
                return ovni.getKey();
            } else {
                ufo = "null";
                break;
            }
            
        }
        return ufo;
    } 

}