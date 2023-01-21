package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int extraToppings;

    private boolean isTakeAway;
    private boolean isCheeseAdded;
    private boolean isBilled;
    private boolean addExtraToppings;




    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isBilled = false;
        this.isCheeseAdded = false;
        this.addExtraToppings = false;
        this.isTakeAway = false;
        this.bill = "";

        // your code goes here
        if(isVeg){
            this.price = 300;
            this.extraToppings  = 70;
        }
        else {
            this.price = 400;
            this.extraToppings = 120;
        }
        this.cheese = 80;
        this.bill += "Base Price Of The Pizza: "+ this.price+'\n';
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            this.price += cheese;
            this.isCheeseAdded = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!addExtraToppings){
            this.price += extraToppings;
            addExtraToppings = true;
        }


    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price += 20;
            isTakeAway = true;
        }

        return;
    }

    public String getBill(){
        // your code goes here
        if(!isBilled){
        if(isCheeseAdded) this.bill += "Extra Cheese Added: "+ this.cheese +'\n';
        if(addExtraToppings) this.bill+= "Extra Toppings Added: "+this.extraToppings +'\n';
        if(isTakeAway) this.bill+= "Paperbag Added: " + 20+'\n';
        this.bill+= "Total Price: "+ this.price+'\n';
        isBilled =true;
        }
        return this.bill;
    }
}
