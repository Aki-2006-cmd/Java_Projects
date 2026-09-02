// taking the inputs of an user

import java.util.Scanner;

public class Code14 {
    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);

        // First input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();


        // Now that you're done with ALL inputs, close it
        scanner.close();
    }
}



