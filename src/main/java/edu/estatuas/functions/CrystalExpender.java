package edu.estatuas.functions;

public class CrystalExpender {

    int stock;
    double itemCost;

    public CrystalExpender(int stock, double itemCost){
        this.stock = stock;
        this.itemCost = itemCost;

    }


    public int stock(){
        return this.stock;
    }


    public void dispatch(CreditCard card){

        if (this.stock > 0 && card.pay(this.itemCost)){
            this.stock = this.stock - 1;
        }
        
    }


    @Override
    public String toString(){
        return "Stock:\s" + this.stock + "\n" +
        "Cost:\s" + this.itemCost;
    }
    
}
