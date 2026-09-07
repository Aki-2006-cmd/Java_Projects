// Creating random numbers

import java.util.Random;

public class Practise4 {
    public static void main ( String[] a){

        Random number = new Random();

        int x = number.nextInt();
        int y = number.nextInt(1,6);


        System.out.println(x);
        System.out.println(y);


        double z = number.nextDouble(1.547474,4.4564);
        System.out.println(z);


    }

}
