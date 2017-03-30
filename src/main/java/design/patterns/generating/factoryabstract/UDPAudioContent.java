package design.patterns.generating.factoryabstract;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class UDPAudioContent implements UDPMediaContent {
    @Override
    public void play() {
        System.out.println("UDPAudioContent - play");
    }

    @Override
    public void transform() {
        System.out.println("UDPAudioContent - transform");
    }
}
