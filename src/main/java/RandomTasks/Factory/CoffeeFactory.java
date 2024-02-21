package RandomTasks.Factory;

import RandomTasks.Factory.Coffee.*;

public class CoffeeFactory {

    public Coffee makeCoffee(CoffeeType type, CoffeeSize size, MilkType milkType, boolean isSugar) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new Americano(size, isSugar);
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino(size, milkType, isSugar);
                break;
            case LATTE:
                coffee = new Latte(size, milkType, isSugar);
                break;
            case ESPRESSO:
                coffee = new Espresso(size, isSugar);
                break;
        }

        return coffee;
    }
}
