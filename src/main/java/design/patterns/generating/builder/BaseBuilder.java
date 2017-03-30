package design.patterns.generating.builder;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public abstract class BaseBuilder {
    protected User user = new User();

    public User getUser() {
        return user;
    }

    public abstract void buildLogin();
    public abstract void buildPassword();
}
