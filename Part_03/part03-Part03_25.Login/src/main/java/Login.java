
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user01 = "alex";
        String user02 = "emma";
        String pass01 = "sunshine";
        String pass02 = "haskell";
        System.out.println("Enter username:");
        String isUsername = scanner.nextLine();
        System.out.println("Enter password:");
        String isPassword = scanner.nextLine();
        if ((user01.equals(isUsername) && pass01.equals(isPassword))
                || (user02.equals(isUsername) && pass02.equals(isPassword))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
