package RandomTasks.FactoryPattern.Coffee;

import RandomTasks.FactoryPattern.CoffeeSize;
import RandomTasks.FactoryPattern.CoffeeType;

public class Espresso extends Coffee {
    CoffeeType coffeeType = CoffeeType.AMERICANO;
    CoffeeSize size;
    boolean isSugar;

    public Espresso(CoffeeSize size, boolean isSugar) {
        this.size = size;
        this.isSugar = isSugar;
    }

    @Override
    public void grindCoffee() {
        super.grindCoffee();
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
    }

    @Override
    public void pourIntoCup() {
        super.pourIntoCup();
    }

    @Override
    public String toString() {
        return "Espresso{" +
                "coffeeType=" + coffeeType +
                ", size=" + size +
                ", isSugar=" + isSugar +
                '}';
    }
}
