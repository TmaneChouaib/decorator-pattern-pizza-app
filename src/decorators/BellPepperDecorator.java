package decorators;

import Pizzas.IPizza;

public class BellPepperDecorator extends PizzaDecorator {
    public BellPepperDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Bell Pepper";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2;
    }
}
