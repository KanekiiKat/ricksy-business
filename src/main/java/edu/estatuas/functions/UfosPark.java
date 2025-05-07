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
        if (!flota.values().contains(card.number()) && card.pay(fee)){
            for (Map.Entry<String, String> ovni : flota.entrySet()){
                    if (ovni.getValue() == null){
                        ovni.setValue(card.number());
                        break;
                        
                }
            }
        }
    }

    public String getUfoOf(String number){
        for (Map.Entry<String, String> ovni : flota.entrySet()){
            if (ovni.getValue() == number){
                return ovni.getKey();
            }
        }
        return "null";
    } 

}