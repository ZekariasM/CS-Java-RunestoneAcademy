
/**
 * What data should we store about Students? 
 * Come up with at least 4 different instance variables. What are the data types for the instance variables?
 * Write a Student class below that has your 4 instance variables and write at least 3 different constructors: 
 * one that has no parameters and initializes the instance variables to default values, 
 * one that has 4 parameters to set the instance variables, and one that has 1 parameter 
 * for the most important instance variable and uses defaults for the others.
 * Add a print() method that uses System.out.println to print out all the instance variables.
 * Add a main method that constructs at least 3 Student objects using the 3 
 * different constructors and then calls their print() methods.
 */
public class Student {
        // Write 4 instance variables
        private String name;
        private int age;
        private int grade;
        private String section;
        
    // Write 3 constructors to initialize the instance variables
    //  1. no parameters using default values
    public Student(){
        name = "";
        age = 5;
        grade = 1;
        section = "";
    }
    //  2. 1 parameter and the rest default values
    public Student(String n){
        name = n;
        age = 5;
        grade = 1;
        section = "";
        
    }
    //  3. 4 parameters
    public Student(String initname, int initage, int initgrade, String initsection){
        name = initname;
        age = initage;
        grade = initgrade;
        section = initsection;
    }
    // Write a print method that prints all the instance variables
    public void print(){
        System.out.println(name + " is " + age + " years old and a student in grade " + grade + section + ".");
    }
    // main method
    public static void main(String[] args)
    {
       // Construct 3 Student objects using the 3 different constructors
        Student s1 = new Student();
        s1.print();
        Student s2 = new Student("Hana");
        s2.print();
        Student s3 = new Student("Hana", 7, 3, "B");
        s3.print();
       // call their print() methods

    }
}
