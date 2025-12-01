package Models;

public class AdminUser extends User {
    public AdminUser(String username, String fullName){
        super(username, fullName, "Admin");
    }

    @Override
    public boolean canCreateProjects(){
        return true;
    }
    @Override
    public boolean canDeleteProjects(){
        return true;
    }
}
