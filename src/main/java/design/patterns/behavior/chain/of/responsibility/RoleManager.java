package design.patterns.behavior.chain.of.responsibility;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class RoleManager extends AbstractHandler {
    public RoleManager() {
    }

    @Override
    public void handleRequest(Employee emp) {
        checkPermission();
    }

    public void checkPermission(){
        System.out.println("checking role");
    }
}
