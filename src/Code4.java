// String Formatting

public class Code4 {

    public static void main( String[]a){
        String name = "Kasun";
        int age = 22;
        double gpa = 3.7584;

// Python: print(f"Name: {name}, Age: {age}, GPA: {gpa:.2f}")
        System.out.printf("Name: %s, Age: %d, GPA: %.2f\n", name, age, gpa);
// Output: Name: Kasun, Age: 22, GPA: 3.76

        System.out.println("Hello "+ name + " Age " + age);

    }
}
