package design.patterns.generating.builder;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class DOMBuilder extends BaseBuilder {
    @Override
    public void buildLogin() {
        user.setLogin("domLogin");
    }

    @Override
    public void buildPassword() {
        user.setPassword("domPassword");
    }
}
