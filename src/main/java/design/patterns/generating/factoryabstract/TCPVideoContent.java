package design.patterns.generating.factoryabstract;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class TCPVideoContent implements TCPMediaContent {
    @Override
    public void play() {
        System.out.println("TCPVideoContent - play");
    }
}
