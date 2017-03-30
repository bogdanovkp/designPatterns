package design.patterns.behavior.chain.of.responsibility;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class Authentification extends AbstractHandler {
    public Authentification() {
    }

    @Override
    public void handleRequest(Employee emp) {
        if (checkStatus(emp)){

        }
    }

    public boolean checkStatus(Employee user){
        boolean flag = true;
        System.out.println(user);
        System.out.println("check user status");
        return flag;
    }
}
