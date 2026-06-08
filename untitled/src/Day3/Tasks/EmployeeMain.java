package Day3.Tasks;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee e1 = new Employee(1001, "Priya Patil",
                "Software Developer", 35000);

        Employee e2 = new Employee(1002, "Rahul Singh",
                "Tester", 30000);

        Employee e3 = new Employee(1003, "Neha Sharma",
                "Team Lead", 50000);

        e1.displayEmployee();
        e2.displayEmployee();
        e3.displayEmployee();
    }
}
