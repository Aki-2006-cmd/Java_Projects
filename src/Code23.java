class Mobile{

    String brand;
    int price;
    static String name;

    public void show(){

        System.out.println(brand + " : " + price+ " : " + name);
    }

    public static void show1(){

        System.out.println("static method");
    }
}
public class Code23 {
    public static void main ( String[] a){


        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name  = " SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name  = " SmartPhone";

        Mobile obj3 = new Mobile();
        obj3.brand = "Nokia";
        obj3.price = 800;
        Mobile.name  = " SmartPhone";







    }
}
