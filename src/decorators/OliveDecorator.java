package decorators;

import pizzas.IPizza;

public class OliveDecorator extends PizzaDecorator {
    public OliveDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olive";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2;
    }
}
