package RandomTasks.Factory;

import RandomTasks.Factory.Coffee.MilkType;

public class Main {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        CoffeeShop coffeeShop = new CoffeeShop(coffeeFactory);
        coffeeShop.createCoffee(CoffeeType.AMERICANO, CoffeeSize.LARGE, false);
        coffeeShop.createCoffee(CoffeeType.CAPPUCCINO, CoffeeSize.LARGE, MilkType.CLASSIC, false);
    }
}
