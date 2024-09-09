package RandomTasks.FactoryPattern.Coffee;

import RandomTasks.FactoryPattern.CoffeeSize;
import RandomTasks.FactoryPattern.CoffeeType;

public abstract class Coffee {
    CoffeeType coffeeType;
    CoffeeSize coffeeSize;
    boolean isSugar;

    public void grindCoffee() {
        System.out.println("Grinded");
    }

    public void makeCoffee() {
        System.out.println("Done");
    }

    public void pourIntoCup() {
        System.out.println("Poured");
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "coffeeType=" + coffeeType +
                ", coffeeSize=" + coffeeSize +
                ", isSugar=" + isSugar +
                '}';
    }
}
