// THIS keyword

// "THIS" is a keyword that rep[resents the current keyword.

class Human1{

    private int age = 11;
    private String name = " Akash " ;


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


public class Code25$$$ThisKeyword {
    public static void main(String[] a){

        Human1 obj = new Human1();

        obj.setName("Akash");
        obj.setAge(21);

        System.out.println(obj.getName() + " : " + obj.getAge());


































    }
}

