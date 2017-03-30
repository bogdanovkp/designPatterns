package design.patterns.generating.factory.method;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class SimpleOrder implements AbstractOrder {
    @Override
   public void perform() {
        System.out.println("Simple order");
    }
}
