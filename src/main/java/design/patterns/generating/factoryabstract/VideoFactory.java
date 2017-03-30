package design.patterns.generating.factoryabstract;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class VideoFactory implements MediaFactory {
    @Override
    public TCPMediaContent createTCPObject() {
        return new TCPVideoContent();
    }

    @Override
    public UDPMediaContent createUDPObject() {
        return new UDPVideoContent();
    }
}
