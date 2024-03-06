package RandomTasks.FactoryPattern;

import RandomTasks.FactoryPattern.Coffee.Coffee;
import RandomTasks.FactoryPattern.Coffee.MilkType;

public class CoffeeShop {
    CoffeeFactory coffeeFactory;

    public CoffeeShop(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

        public void createCoffee(CoffeeType type, CoffeeSize size, boolean isSugar) {
        MilkType milkType = MilkType.NONE;
        createCoffee(type, size, milkType, isSugar);
        }

        public void createCoffee(CoffeeType type, CoffeeSize size, MilkType milkType, boolean isSugar) {
        Coffee coffee = coffeeFactory.makeCoffee(type, size, milkType, isSugar);

        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println(coffee);
    }
}
