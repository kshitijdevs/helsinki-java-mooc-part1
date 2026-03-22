
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int temp = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println(temp);
                break;
            }
            String[] pieces = input.split(",");
            age = Integer.valueOf(pieces[1]);
            if (temp < age) {
                temp = age;
            }

        }

    }
}
