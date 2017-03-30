package design.patterns.generating.factoryabstract;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public interface MediaFactory {
    TCPMediaContent createTCPObject();
    UDPMediaContent createUDPObject();
}
