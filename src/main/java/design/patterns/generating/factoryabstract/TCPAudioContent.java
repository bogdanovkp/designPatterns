package design.patterns.generating.factoryabstract;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class TCPAudioContent implements TCPMediaContent {
    @Override
    public void play() {
        System.out.println("TCPAudioContent - play");
    }
}
