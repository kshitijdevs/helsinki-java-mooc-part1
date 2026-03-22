
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int temp = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println(name);
                break;
            }
            String[] pieces = input.split(",");
            age = Integer.valueOf(pieces[1]);
            if (temp < age) {
                temp = age;
                name = pieces[0];
            }

        }

    }
}
