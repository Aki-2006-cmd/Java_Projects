// OOP CONCEPTS

class Calculator{  //  this is how creating class
    public int add (int x,int y){  // this is how creating method

        /* int r = num1 + num2 ;
        methn mehem krnn ba mkd num1 and num2 kiyn ewa thiyenne code 13 kiyn class eke.
        eewa thiyenne calculator kiyn class eke wage newe.
        nikn hriyt python wala function ekakata eliye thiyena variables gann hdnw wge.
        ethkot python wala wage argumentry function ghnw wge ewa pass krnn class eketh ewa pass krnn kramayak thiyenawa

         */

        return x+y;
    }
}

public class Code13 {
    public static void main ( String[] a){

        int num1 = 2;
        int num2 = 54;

        Calculator calc = new Calculator(); // this is how creating object line
        /*

        first the class name
        second the variable name. the variable name which u can access the methods of calculator
        then the new keyword. this creates the relavent space in the memory for further usage
        then again the class name with brackets like calling a function in python

        */

        int result = calc.add(num1 , num2);
        System.out.println(result);

        //int result = num1 + num2 ;

        //System.out.println(result);
    }
}
