import Pizzas.BasicPizza;
import Pizzas.IPizza;
import Pizzas.MargaritaPizza;
import decorators.BellPepperDecorator;
import decorators.CheeseDecorator;
import decorators.MushroomDecorator;
import decorators.OnionDecorator;

public class Main {
    public static void main(String[] args) {

        IPizza basicPizza = new BasicPizza();
        IPizza margaritaPizza = new MargaritaPizza();


        IPizza cheesePizza = new CheeseDecorator(basicPizza);
        IPizza cheeseBelPepperPizza = new BellPepperDecorator(cheesePizza);
        IPizza cheeseOnionBellPepperPizza = new OnionDecorator(cheeseBelPepperPizza);
        IPizza cheeseVegetablesPizza = new MushroomDecorator(cheeseOnionBellPepperPizza);

        IPizza cheeseMargaritaPizza = new CheeseDecorator(margaritaPizza);

        System.out.println("cheeseVegetablesPizza served with : \n" + "-> " +cheeseVegetablesPizza.getDescription() + "\n - Cost: " + cheeseVegetablesPizza.getCost() + " DH \n\n");
        System.out.println("cheeseMargaritaPizza served with : \n" + "-> "+ cheeseMargaritaPizza.getDescription() + "\n - Cost: " + cheeseMargaritaPizza.getCost() + " DH \n\n");

    }
}