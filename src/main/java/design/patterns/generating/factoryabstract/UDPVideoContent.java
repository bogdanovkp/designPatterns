package design.patterns.generating.factoryabstract;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class UDPVideoContent implements UDPMediaContent {
    @Override
    public void play() {
        System.out.println("UDPVideoContent - play");
    }

    @Override
    public void transform() {
        System.out.println("UDPVideoContent - transform");
    }
}
