package design.patterns.generating.factoryabstract;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class Client {
    private UDPMediaContent udpMediaContent;
    private TCPMediaContent tcpMediaContent;

    public void makeMediaFactoryWork(MediaFactory factory){
        udpMediaContent = factory.createUDPObject();
        tcpMediaContent = factory.createTCPObject();
    }

    public void transform(){
        udpMediaContent.transform();
    }

    public void play(){
        udpMediaContent.play();
        tcpMediaContent.play();
    }
}
