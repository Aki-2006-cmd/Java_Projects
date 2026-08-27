// Type Casting and Conversion

public class Code3 {

    public static void main(String[] a){

        byte b = 127;
        int c = 12;

        //----------------------------------------------------------------------------------//

        // b = c cannot be done. so need to be type casted

        b = (byte) c ; // type casting
                       // explicit conversion

        //----------------------------------------------------------------------------------//

        int num1 = 257;
        byte num2 = 127;

        num2 = (byte) num1 ;
        /*
        range ekt wada loku number ekkk thiyeddi methn byte - int conversion ekak wenawa.
        e kiynne methnnm 256n modulous eka gnnw

         int -------> byte ( ___ % 256 )

         */
        System.out.println(num2);

        //----------------------------------------------------------------------------------//

        // implicit conversion
        // c = b;

        //----------------------------------------------------------------------------------//

        var string = "556785";

        /*
        int abs = (int) string;

        #### python wala wage mehem ba.
        */
        System.out.println(string);
        int abs = Integer.parseInt(string);
        System.out.println(string);

        //----------------------------------------------------------------------------------//

        // Type promotion

        byte x = 10;
        byte y = 20;

        int result = x * y ;
        System.out.println(result);





    }


}
