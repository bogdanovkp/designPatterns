package design.patterns.generating.factoryabstract;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class AudioFactory implements MediaFactory {
    @Override
    public TCPMediaContent createTCPObject() {
        return new TCPAudioContent();
    }

    @Override
    public UDPMediaContent createUDPObject() {
        return new UDPAudioContent();
    }
}
