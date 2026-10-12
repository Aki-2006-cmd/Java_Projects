// INHERITANCE

class  Calc000{
    public int add( int n1 , int n2){
        return n1+n2;
    }

    public int sub( int n1 , int n2){
        return n1-n2;
    }
}

class  advCalc000 extends Calc000{
    public int multi( int n1 , int n2){
        return n1*n2;
    }

    public int div( int n1 , int n2){
        return n1/n2;
    }
}

class SciCalc00 extends advCalc000{
    public double power ( int n1 , int n2){
        return Math.pow(n1,n2);
    }
}


public class Code$$$Inheritance {
    public static void main ( String[] a){

        SciCalc00 obj = new SciCalc00();
        int r1 = obj.add(3,5);
        int r2 = obj.sub(3,5);
        int r3 = obj.multi(3,5);
        float r4 = obj.div(5,2);
        double r5 = obj.power(4,7);
        System.out.println("r1 = " + r1 );
        System.out.println("r2 = " + r2 );
        System.out.println("r3 = " + r3 );
        System.out.println("r4 = " + r4 );
        System.out.println("r5 = " + r5 );


    }
}
