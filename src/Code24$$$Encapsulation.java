// Encapsulation

class Human{

    private int age = 11;
    private String name = " Akash " ;


    public int getAge(){
        return age;
    }

    public void setAge(int b){
        age = b;
    }

    public String getName(){
        return name;
    }

    public void setName(String text){
        name = text;
    }
}


public class Code24$$$Encapsulation {
    public static void main(String[] a){

        Human obj = new Human();

        obj.setName("Akash");
        obj.setAge(21);

        System.out.println(obj.getName() + " : " + obj.getAge());


































    }
}
