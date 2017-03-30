package design.patterns.behavior.chain.of.responsibility;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public abstract class AbstractHandler {
    protected MapEmployee db;
    protected AbstractHandler successor = DefaultHandleRequest.getHandleRequest();

    public AbstractHandler(AbstractHandler successor) {
        this.successor = successor;
        this.db = new MapEmployee();
    }

    public AbstractHandler() {
        this.db = new MapEmployee();
    }

    public void setSuccessor(AbstractHandler successor) {
        this.successor = successor;
    }

    abstract public void handleRequest(Employee emp);

    public void chain(Employee user){
        if (db.containsUser(user)){
            handleRequest(user);
            successor.chain(user);
        } else {
            System.out.println("user don`t exist");
        }
    }

    private static class DefaultHandleRequest extends AbstractHandler {
        private static DefaultHandleRequest handler = new DefaultHandleRequest();

        public static DefaultHandleRequest getHandleRequest() {
            return handler;
        }

        @Override
        public void handleRequest(Employee emp) {

        }

        @Override
        public void chain(Employee user) {

        }

    }
}
