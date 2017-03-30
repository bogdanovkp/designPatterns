package design.patterns.generating.builder;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class Runner {
    public static void main(String[] args) {
        User user1 = Director.createUser(new DOMBuilder());
        User user2 = Director.createUser(new SAXBuilder());
    }
}
