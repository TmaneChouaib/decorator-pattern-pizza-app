package decorators;

import pizzas.IPizza;

public class OnionDecorator extends PizzaDecorator {
    public OnionDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Onion";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2;
    }
}
