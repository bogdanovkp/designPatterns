package design.patterns.generating.factory.method;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class RunFactoryMethodSimpleTest {
    public static void main(String[] args) {
        Client client = new Client();
        client.someOperation(new SimpleOrderFactory());
        client.someOperation(new ExtendedOrderFactory());
    }
}
