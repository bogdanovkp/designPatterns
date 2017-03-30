package design.patterns.generating.factory.method;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class SimpleOrderFactory implements AbstractOrderFactory {
    @Override
    public SimpleOrder getOrder() {
        return new SimpleOrder();
    }
}
