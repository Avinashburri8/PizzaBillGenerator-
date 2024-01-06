public class Main{
    public static void main(String[] args){

        Pizza basePizza = new Pizza(false);
        basePizza.addExtraCheese();
        basePizza.addExtraToppings();
        basePizza.takeaway();
        basePizza.getBill();

        DeluxePizza dp = new DeluxePizza(false);

        dp.addExtraCheese();
        dp.addExtraToppings();
        dp.getBill();
    }
}
