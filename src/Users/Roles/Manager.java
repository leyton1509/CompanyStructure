package Users.Roles;

import Users.Interfaces.IManager;

public class Manager extends Supervisor implements IManager {
    public Manager(String _firstName, String _lastName, int _id, String _role) {
        super(_firstName, _lastName, _id, _role);
    }

    /**
     *
     */
    @Override
    public void manageWork() {

        System.out.println("I manage the companies flow");

    }

    /**
     *
     */
    @Override
    public void work() {
        System.out.println("I manage the companies assets and supervisors!");
    }

    /**
     *
     */
    @Override
    public void assignWork() {
        System.out.println("I give the supervisors their work!");

    }
}
