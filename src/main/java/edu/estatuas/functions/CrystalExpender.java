package edu.estatuas.functions;

public class CrystalExpender implements GuestDispatcher{

    private int stock = 0;
    private double itemCost = 0d;

    public CrystalExpender(int stock, double itemCost){
        this.stock = stock;
        this.itemCost = itemCost;

    }


    public int stock(){
        return this.stock;
    }

    @Override
    public void dispatch(CreditCard card){

        if (this.stock > 0 && card.pay(this.itemCost)){
            this.stock--;
        }
        
    }


    @Override
    public String toString(){
        return "Stock:\s" + this.stock + "\n" +
        "Cost:\s" + this.itemCost;
    }
    
}
