
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        double avgOfAge = 0;
        int sumofAge = 0;
        int lenOfLargestName = -1;
        String longestNameString = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] pieces = input.split(",");
            index++;
            sumofAge += Integer.valueOf(pieces[1]);

            // for finding the largest name
            int lenOfCurrentName = Integer.valueOf(pieces[0].length());
            if (lenOfCurrentName > lenOfLargestName) {
                lenOfLargestName = lenOfCurrentName;
                longestNameString = pieces[0];
            }

        }

        if (index != 0) {
            avgOfAge = (double) sumofAge / index;
            System.out.println("Longest name: " + longestNameString);
            System.out.println("Average of the birth years: " + avgOfAge);
        }
    }
}
