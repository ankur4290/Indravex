package Day3.Tasks;

public class StudentMain {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul Sharma", "Java Development", 85.5);
        Student s2 = new Student(102, "Anjali Verma", "Python Development", 88.0);
        Student s3 = new Student(103, "Amit Kumar", "Full Stack Development", 91.5);

        s1.displayStudentDetails();
        s2.displayStudentDetails();
        s3.displayStudentDetails();
    }
}
