package edu.estatuas.functions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UfosPark implements GuestDispatcher {


    private Double fee = 500d;
    private HashMap<String, String> flota = new HashMap<>();




    public void UfosPark(){}

    public void add(String ufoID){
        flota.putIfAbsent(ufoID, null);
    }

    @Override
    public void dispatch(CreditCard card){
        if (!flota.values().contains(card.number()) ){
            for (Map.Entry<String, String> ovni : flota.entrySet()){
                    if (ovni.getValue() == null && card.pay(fee)){
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

    @Override
    public String toString(){

        Set<String> ovnis = flota.keySet();
        return "" + ovnis;
    
    }
}