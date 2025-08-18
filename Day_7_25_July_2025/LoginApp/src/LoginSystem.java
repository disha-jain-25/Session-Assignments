import java.util.Scanner;

public class LoginSystem {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter username: ");
            String inputUsername = sc.nextLine();

            System.out.print("Enter password: ");
            String inputPassword = sc.nextLine();

            login(inputUsername, inputPassword);

            System.out.println(" Login successful!");

        } catch (InvalidCredentialsException e) {
            System.out.println(" Login failed: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Thank you for using the system.");
        }
    }

    public static void login(String username, String password) throws InvalidCredentialsException {
        if (!USERNAME.equals(username) || !PASSWORD.equals(password)) {
            throw new InvalidCredentialsException("Incorrect username or password.");
        }
    }
}
