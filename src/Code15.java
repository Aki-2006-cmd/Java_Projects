// MORE ON TAKING INPUT. ----- processing the input


import java.util.Scanner;

public class Code15 {
    public static void main (String[] a){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name ; ");
        String name = scanner.nextLine();

        System.out.print("Enter your age ; ");
        int age = scanner.nextInt();
        scanner.nextLine();// to resolve the problem in nextline problem.

        System.out.print("What is you favourite colour ; ");
        String colour = scanner.nextLine();

        System.out.println("You are " + name + ". You are " + age + " years old and you like "+ colour);

        scanner.close();

        /*
        In Python, input("Enter your name: ") does two things at once: it prompts the user, reads the line, and immediately returns the entered value so you can store it or print it directly.
        In Java, scanner.nextLine() reads the value, but typing scanner alone refers to the Scanner tool itself—not the data you entered.

        To print user input like Python, you must store the returned value in a variable first, or nest scanner.nextLine() directly inside the print statement.

         */



    }
}
