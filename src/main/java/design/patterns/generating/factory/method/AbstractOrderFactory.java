package design.patterns.generating.factory.method;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public interface AbstractOrderFactory {
     AbstractOrder getOrder();
     default void anOperation(){
        System.out.println("operation");
    }
}
