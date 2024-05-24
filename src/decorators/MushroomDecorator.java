package decorators;

import pizzas.IPizza;

public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushroom";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 4;
    }
}
