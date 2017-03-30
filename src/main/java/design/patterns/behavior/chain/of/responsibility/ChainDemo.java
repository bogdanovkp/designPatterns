package design.patterns.behavior.chain.of.responsibility;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class ChainDemo {
    public static void main(String[] args) {
        Employee user = new Employee(30, "user", "passwordUser");
        RoleManager rm = new RoleManager();
        Authentification auth = new Authentification();
        TaskManager tm = new TaskManager();
        auth.setSuccessor(rm);
        rm.setSuccessor(tm);
        auth.chain(user);
    }
}
