package decorators;

import pizzas.IPizza;

public abstract class PizzaDecorator implements IPizza {
    protected IPizza pizza;

    public PizzaDecorator(IPizza pizza) {
        this.pizza = pizza;
    }
}
