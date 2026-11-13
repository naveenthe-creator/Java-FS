//Single Inheritance
class User {
    void login() {
        System.out.println("User logged in successfully");
    }
}

class Admin extends User {
    void manageUsers() {
        System.out.println("Admin can manage users");
    }
}

public class In2 {
    public static void main(String[] args) {
        Admin admin = new Admin();

        admin.login();
        admin.manageUsers();
    }
}