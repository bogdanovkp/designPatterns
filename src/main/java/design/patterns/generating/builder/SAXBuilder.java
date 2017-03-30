package design.patterns.generating.builder;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class SAXBuilder extends BaseBuilder {
    @Override
    public void buildLogin() {
        user.setLogin("saxLogin");
    }

    @Override
    public void buildPassword() {
        user.setPassword("saxPassword");
    }
}
