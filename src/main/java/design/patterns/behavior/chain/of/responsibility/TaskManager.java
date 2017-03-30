package design.patterns.behavior.chain.of.responsibility;

/**
 * Created by BogdanovKP on 30.03.2017.
 */
public class TaskManager extends AbstractHandler {
    public TaskManager() {
    }

    @Override
    public void handleRequest(Employee emp) {
        assingTask();
    }

    public void assingTask(){
        System.out.println("assign task");
    }


}
