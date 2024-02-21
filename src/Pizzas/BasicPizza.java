package Pizzas;

public class BasicPizza implements IPizza {
    @Override
    public String getDescription() {
        return "Basic pizza";
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}
