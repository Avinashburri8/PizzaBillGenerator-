public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrize = 100;
    private int extraToppingsAdded = 150;
    private int backpack = 20;
    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;

        this.price += extraCheesePrize;
    }
    public void addExtraToppings(){
        isExtraToppingsAdded = true;

        this.price += extraToppingsAdded;
    }
    public void takeaway(){
        isOptedForTakeAway = true;

        this.price += backpack;
    }

    public void getBill(){
        String bill = " ";
        System.out.println("Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra cheese added: "+extraCheesePrize+ "\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra Toppings added: "+extraToppingsAdded+ "\n";
        }
        if(isOptedForTakeAway) {
            bill += "Take away: " + backpack + "\n";
        }
        bill += "Bill: "+this.price+ "\n";
        System.out.println(bill);
    }
}