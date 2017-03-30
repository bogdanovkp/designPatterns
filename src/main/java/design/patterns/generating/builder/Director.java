package design.patterns.generating.builder;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class Director {
    public static User createUser(BaseBuilder baseBuilder){
        baseBuilder.buildLogin();
        baseBuilder.buildPassword();
        return baseBuilder.getUser();
    }
}
