package Users.Interfaces;

public interface IDirector {

    void assignWork();
    void work();
    void manageWork();
    void directWork();

    void changePassword(String username, String newPass);
}
