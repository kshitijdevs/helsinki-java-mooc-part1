
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            String string = scanner.nextLine();
            if (!(string.equals(""))) {
                String[] arrStrings = string.split(" ");
                for (String string2 : arrStrings) {
                    if (string2.contains("av")) {
                        System.out.println(string2);
                    }
                }
            } else {
                break;
            }
        }

    }
}
