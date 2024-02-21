package decorators;

import Pizzas.IPizza;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 5;
    }
}
