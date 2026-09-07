// over loading  methods


import java.util.Scanner;


class Calculator1{
    public int add (int n1 , int n2) {
        return n1 + n2;
    }
    public int add ( int n1 , int n2 , int n3) {
        return n1 + n2 + n3;
    }
}

public class Code17 {
    public static void main ( String[] a){


        Calculator1 result = new Calculator1();
        System.out.println("The result address is "+ result);

        Calculator1 test = new Calculator1();
        System.out.println("The test address is "+ test);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number = ");
        int num1 = scanner.nextInt();
        System.out.print("Enter your second number = ");
        int num2 = scanner.nextInt();
        System.out.print("Enter your three number = ");
        int num3 = scanner.nextInt();

        int r1 = result.add(num1,num2,num3);
        int r2 = result.add(num1,num2);

        System.out.println(r1);
        System.out.println(r2);

    }
}
