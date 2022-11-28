import Users.Roles.Director;
import Users.Roles.Manager;
import Users.Roles.Supervisor;
import Users.Roles.Worker;

import java.util.LinkedList;

public class Driver {

    public static void main(String[] args) {

        LinkedList<Worker> workers = new LinkedList<>();

        Worker jim = new Worker("Jim", "Barry", 3033, "Worker");
        Manager tim = new Manager("Tim", "Smith", 3038, "Manager");
        Supervisor scott = new Supervisor("Scott", "Tam", 3098, "Supervisor");
        Director trevor = new Director("Trevor", "Smith", 3099, "Director");

        workers.add(jim);
        workers.add(tim);
        workers.add(scott);
        workers.add(trevor);

        for (Worker employee:workers) {
            employee.work();
        }
    }


}
