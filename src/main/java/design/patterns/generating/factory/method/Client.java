package design.patterns.generating.factory.method;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class Client {
    public void someOperation(AbstractOrderFactory factory){
        AbstractOrder order = factory.getOrder();
        order.perform();
    }
}
