package Users;

public abstract class Person {

    private String firstName;
    private String lastName;
    private int id;
    private String role;

    public Person(String _firstName, String _lastName, int _id, String _role) {
        firstName = _firstName;
        lastName = _lastName;
        id = _id;
        role = _role;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getID(){
        return id;
    }

    public String getFirstRole(){
        return role;
    }


    public abstract void work();
}
