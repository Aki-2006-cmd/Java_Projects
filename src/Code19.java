// Multi - Dimensional arrays
import java.util.Random;


public class Code19 {
    public static void main(String[] a) {

        int numlist [][]= {{2,3,5,4},{7,5,9,6}};

        int nums [][] = new int [3][4];

        Random random = new Random();

        for ( int x = 0 ; x < 3 ; x++ ) {
            for (int y = 0; y < 4; y++) {
                nums[x][y] =  random.nextInt(10,101);

            }
        }
        for ( int x = 0 ; x < 3 ; x++ ) {
            for (int y = 0; y < 4; y++) {
                System.out.print(nums[x][y] + " ");
            }
        System.out.println();
        }
        System.out.println();

        // enhanced loop

        for ( int n[] : nums ){
            for ( int m : n ){
                System.out.print( m + " ");
            }
        System.out.println();
        }


    }
}
