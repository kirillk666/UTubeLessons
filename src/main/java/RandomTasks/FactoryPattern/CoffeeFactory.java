package RandomTasks.FactoryPattern;

import RandomTasks.FactoryPattern.Coffee.*;

public class CoffeeFactory {

    public Coffee makeCoffee(CoffeeType type, CoffeeSize size, MilkType milkType, boolean isSugar) {

        return switch (type) {
            case AMERICANO -> new Americano(size, isSugar);
            case CAPPUCCINO -> new Cappuccino(size, milkType, isSugar);
            case LATTE -> new Latte(size, milkType, isSugar);
            case ESPRESSO -> new Espresso(size, isSugar);
        };
    }
}
