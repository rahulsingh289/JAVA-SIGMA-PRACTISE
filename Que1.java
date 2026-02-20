 /* Taking input from Command line and convert objects into primitive data type! 
    Write a java program to take input as a command line  argument. Your name,
    course, universityrollno and semester. Display the information.
    Name:
    UniversityRollNo:
    Course:
    Semester:  */         
        
        public class Que1 {
    public static void main(String[] args) {

        if (args.length == 4) {
            String name = args[0];
            String universityRoll = args[1];
            String course = args[2];
            String semester = args[3];

            System.out.println("Name: " + name);
            System.out.println("University Roll No: " + universityRoll);
            System.out.println("Course: " + course);
            System.out.println("Semester: " + semester);

            System.out.println("Command line arguments accepted");
        } else {
            System.out.println("Invalid Command Line Argument");
            System.out.println("Please provide 4 command line arguments");
        }
    }
}
