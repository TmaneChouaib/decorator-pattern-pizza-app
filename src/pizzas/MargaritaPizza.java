package pizzas;

public class MargaritaPizza implements IPizza {
    @Override
    public String getDescription() {
        return "Margarita pizza";
    }

    @Override
    public double getCost() {
        return 20.0;
    }
}
