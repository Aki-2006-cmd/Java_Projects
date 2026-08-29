// Switch cases

public class Code9 {
    public static void main (String[] a){
         int n = 1;

         switch (n) {
             case 1:
                 System.out.println("MOnday");
                 break;
             case 2:
                 System.out.println("Tuesday");
                 break;
         }

         // latest switch use

        String day = "Mnday";

         switch (day){
             case "Monday" , "Sunday":
                 System.out.println("sleep");
                 break;
             case "Tuesday":
                 System.out.println("wakeup");
                 break;
             default:
                 System.out.println("goon");
                 break;
         }





    }
}
