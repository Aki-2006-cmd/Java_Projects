// Arrays ============== in python this is lists

public class Code18 {
    public static void main ( String[ ] a){

        int nums[] = { 3,4,5,6 };

        for ( int x=0 ; x < 4 ; x++ ){
            System.out.print(nums[x] + " ");
        }

        System.out.println();

        int list[] = new int[5];

        for ( int x=0 ; x < 5 ; x++ ){
            System.out.print(list[x] + " "); // [ 0,0,0,0,0 ]
        }


    }
}
