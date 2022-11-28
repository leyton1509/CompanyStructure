package Users.Roles;

import Users.Interfaces.ISupervisor;

public class Supervisor extends Worker implements ISupervisor {

    public Supervisor(String _firstName, String _lastName, int _id, String _role) {
        super(_firstName, _lastName, _id, _role);
    }

    /**
     *
     */
    @Override
    public void work() {
        System.out.println("I supervise the workers!");
    }

    /**
     *
     */
    @Override
    public void assignWork() {
        System.out.println("I give the workers their work!");

    }
}
