package Day3.Tasks;

public class Student {

    private int studentId;
    private String studentName;
    private String course;
    private double percentage;

    public Student(int studentId, String studentName, String course, double percentage) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.percentage = percentage;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Percentage: " + percentage);
        System.out.println();
    }
}
