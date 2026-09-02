// Calculating the area of a given rectangle

import java.util.Scanner;

class multiplication{
    public double multiple (double length,double breadth){

        return length * breadth;
    }
}
public class Practise2 {
    public static void main ( String[] a){

        Scanner inputs = new Scanner(System.in);
        System.out.print("Enter the length of a side ; ");
        double x = inputs.nextDouble();

        System.out.print("Enter the breadth of a side ; ");
        double y = inputs.nextDouble();

        inputs.close();


        multiplication area = new multiplication();
        double result = area.multiple(x,y);

        System.out.println(result + " m^2");

    }
}
