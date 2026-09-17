// Constructors

class Human2{

    private int age ;
    private String name;


    // constructor part

    public Human2(){
        System.out.println("in constructor");

        age = 12;
        name = "himaya"; // putting default values
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

public class Code26$$$Constructors {
    public static void main(String[] a){


        Human2 obj = new Human2();

        obj.setName("Akash");
        obj.setAge(21);

        System.out.println(obj.getName() + " : " + obj.getAge());









    }
}
