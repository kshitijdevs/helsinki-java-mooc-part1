
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String para = scanner.nextLine();
            String[] words = para.split(" ");
            if (para.equals("")) {
                break;
            } else {
                for (String string : words) {
                    System.out.println(string);
                }
            }

        }
    }

}
