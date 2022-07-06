import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("Admin.ser");
        if (!file.exists()) {
            Admin admin = new Admin("Admin", "admin123", "asdf1234", "03123456789",
                    "12345-1234567-1");
            FileClass fileClass = new FileClass();
            fileClass.writeFile(admin);
            AdminForm adminForm = new AdminForm(admin);
        }

        LoginForm login = new LoginForm();
    }
}
