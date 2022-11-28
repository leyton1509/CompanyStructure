package Users.Roles;

import Users.Interfaces.IWorker;
import Users.Person;

public class Worker extends Person implements IWorker {

    public Worker(String _firstName, String _lastName, int _id, String _role) {
        super(_firstName, _lastName, _id, _role);
    }

    /**
     *
     */
    @Override
    public void work() {
        System.out.println("I do the factory work");
    }


}
