package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int vegToppings;
    private int nonVegToppings;
    private boolean isTakeAway;
    private boolean isCheeseAdded;
    private boolean isBilled;
    private boolean addExtraToppings;

    private int extraToppings;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
        }
        else this.price = 400;

        bill = "Base Price Of The Pizza: "+ this.price+'\n';
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            this.price += 80;
        }
        isCheeseAdded = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!addExtraToppings){
            if(isVeg==true){
                this.extraToppings = 70;
            }
            else this.extraToppings = 120;
        }
        addExtraToppings = true;
        this.price+=extraToppings;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price += 20;
        }
        isTakeAway = true;
        return;
    }

    public String getBill(){
        // your code goes here
        if(isCheeseAdded) bill += "Extra Cheese Added: "+ 80 +'\n';
        if(addExtraToppings) bill+= "Extra Toppings Added: "+this.extraToppings +'\n';
        if(isTakeAway) bill+= "Paperbag Added: " + 20+'\n';
        bill+= "Total Price: "+ this.price+'\n';
        return this.bill;
    }
}
