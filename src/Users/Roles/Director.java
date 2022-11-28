package Users.Roles;

import Users.Interfaces.IDirector;

public class Director extends Manager implements IDirector {

    private String[] employees = {"Tom", "Jim"};


    public Director(String _firstName, String _lastName, int _id, String _role) {
        super(_firstName, _lastName, _id, _role);
    }

    /**
     *
     */
    @Override
    public void directWork() {
        System.out.println("Directing!");
    }

    /**
     * @param username
     */
    @Override
    public void changePassword(String username, String newPass) {
        for (String name: employees) {
            if(username == name){
                System.out.println("Changing password!");
            }

        }
    }


}
