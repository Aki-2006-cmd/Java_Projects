// This & Super Match

class A{ // A is a super class here

    public A(){
        System.out.println("in A");
    }

}

class B extends A {

    public B(){
        super(); // meka ghuwe nthth thiyenawa
        System.out.println("in B");
    }
}

public class Code31$$$ThisSuperMatch {
    public static void main(String[] a){

        B obj = new B();
    }
}
