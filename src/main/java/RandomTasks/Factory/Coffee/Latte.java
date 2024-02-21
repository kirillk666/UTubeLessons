package RandomTasks.Factory.Coffee;

import RandomTasks.Factory.CoffeeSize;
import RandomTasks.Factory.CoffeeType;

public class Latte extends Coffee {
    CoffeeType coffeeType = CoffeeType.AMERICANO;
    CoffeeSize size;
    MilkType milkType;
    boolean isSugar;

    public Latte(CoffeeSize size, MilkType milkType, boolean isSugar) {
        this.size = size;
        this.milkType = milkType;
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
        return "Latte{" +
                "coffeeType=" + coffeeType +
                ", size=" + size +
                ", milkType=" + milkType +
                ", isSugar=" + isSugar +
                '}';
    }
}
