// IF and Else - Conditional statements


public class Code8 {
    public static void main ( String[] a ){

//----------------------------------------------------------------------//
        int x = 6;

        if ( x < 10 ) {
            System.out.println("low");
        } else if ( x == 10 ){
            System.out.println("same");
        } else {
            System.out.println("high");
        }
//----------------------------------------------------------------------//
        if ( x < 10 )
            System.out.println("low");
        else if ( x == 10 )
            System.out.println("same");
//----------------------------------------------------------------------//


        // Ternary Operator


        int n = 5;
        String result = n % 2 != 0 ? "odd" : "even" ;
        System.out.println(result);









    }
}
