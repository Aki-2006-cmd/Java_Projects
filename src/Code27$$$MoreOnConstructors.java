// Default Vs Parameterized Constructors

class Human3{

    private int age = 11;
    private String name = " Akash " ;


    // constructor part

    public Human3(){                                 // default Constructor
        System.out.println("in constructor");

        age = 12;
        name = "himaya"; // putting default values
    }

    public Human3(int a , String n){                 // parameterized constructor
        age = a;
        name = n;

    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Code27$$$MoreOnConstructors {
    public static void main(String[] a){


        Human3 obj = new Human3();
        Human3 obj1 = new Human3(12 , "Akash");

        obj.setName("Akash");
        obj.setAge(21);

        System.out.println(obj.getName() + " : " + obj.getAge());









    }
}
