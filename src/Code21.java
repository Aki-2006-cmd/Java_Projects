// Drawbacks of Arrays

// # space is fixed. if u need to be increased then create a new array



// Array of Objects
class Student{

    int rollno;
    String name;
    int marks;

}
public class Code21 {
    public static void main ( String[] a){

        Student s1 = new Student(); // creating s1 object
        s1.rollno = 1;
        s1.name = " Amal";
        s1.marks = 77;

        Student s2 = new Student(); // creating s2 object
        s2.rollno = 5;
        s2.name = " Bimal";
        s2.marks = 88;

        Student s3 = new Student(); // creating s3 object
        s3.rollno = 8;
        s3.name = " Comal";
        s3.marks = 99;

        Student student[] = new Student[3];// this will create an array to hold the student records
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

    // { s1, s2 , s3 }
    // { [ 1, "Amal" , 77 ] , [ 5 , "Bimal" , 88 ] , [ 8 , "Comal" , 99 ] }

        for ( int i = 0 ; i <student.length ; i++) {
            System.out.print("Roll number ; " + student[i].rollno + " ||| Student name ; " + student[i].name + " ||| Marks ; "+ student[i].marks );
            System.out.println();
        }
    }
}
