package design.patterns.behavior.chain.of.responsibility;

import java.util.HashMap;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class MapEmployee {
    private HashMap<Integer, Employee> users = new HashMap<>();

    public HashMap<Integer, Employee> getUsers() {
        return users;
    }

    public boolean containsUser(Employee emp){
        return users.containsValue(emp);
    }

    public MapEmployee(){
        users.put(1, new Employee(10, "admin", "passwordAdmin"));
        users.put(2, new Employee(20, "employee", "passwordEmployee"));
        users.put(1, new Employee(30, "user", "passwordUser"));
    }
}
