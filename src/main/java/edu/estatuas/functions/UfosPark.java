package edu.estatuas.functions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UfosPark implements GuestDispatcher {


    private Double fee = 500d;
    private final HashMap<String, String> flota = new HashMap<>();




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
        return "";
    } 

    @Override
    public String toString(){

        return flota.keySet().toString();
    
    }

        public boolean containsCard(String cardNumber) {
        return this.flota.containsValue(cardNumber);
    }

    Collection<String> cardNumbers() {
        return this.flota.values();
    }

}