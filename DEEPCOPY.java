
public class DEEPCOPY {
    public static void main(String[] args) {

        Student s1 = new Student("Rahul");
        System.out.println(s1.name);

        s1.roll = 456;
        s1.password = "abcd";

        s1.marks[0] = 100;
        s1.marks[1] = 50;
        s1.marks[2] = 60;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s2.marks[2] = 200;
        

        for(int i = 0; i < 3; i++){
            System.out.println(s2.marks[i]);
              System.out.println(s1.marks[i]);
        }
    }
}

            class Student{
                String name;
                int roll;
                String password;
                int marks[];

                // normal constructor
                Student(String name) {
                    this.name = name;
                    this.marks = new int[3]; 
                }

                // Deep Copy Constructor
                Student(Student s1){
                    this.name = s1.name;
                    this.roll = s1.roll;

                    this.marks = new int[s1.marks.length];   // new array
                    for(int i = 0; i < s1.marks.length; i++){
                        this.marks[i] = s1.marks[i];
                    }
                }
            }
