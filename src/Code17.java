// over loading  methods

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

        int r1 = result.add(32,53,24);
        int r2 = result.add(43,53);

        System.out.println(r1);
        System.out.println(r2);

    }
}
