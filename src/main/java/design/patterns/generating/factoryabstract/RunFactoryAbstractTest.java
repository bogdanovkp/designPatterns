package design.patterns.generating.factoryabstract;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class RunFactoryAbstractTest {
    public static void main(String[] args) {
        Client client = new Client();
        client.makeMediaFactoryWork(new AudioFactory());
//        client.makeMediaFactoryWork(new VideoFactory());
        client.transform();
        client.play();

    }
}
