package design.patterns.generating.factory.method;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class ExtendedOrder implements AbstractOrder {
    @Override
    public void perform() {
        System.out.println("Extended order");
    }
}
