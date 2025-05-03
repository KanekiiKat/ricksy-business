package edu.estatuas.functions;

public class CreditCard {
    
    private String owner;
    private String number;
    private double credit;

    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }



    public boolean pay(double credit){
        double precio = 250.0;
        if (credit >= precio){
            this.credit = credit - precio;
            return true;    
        } else {
            return false;
        }
        
    }




    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
    

    @Override
    public String toString() {
        return "Owner: " + this.owner + "\n" +
               "Number: " + this.number + "\n" +
               "Credit: " + this.credit;
    }


}
