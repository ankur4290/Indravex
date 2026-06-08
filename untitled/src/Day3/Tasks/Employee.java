package Day3.Tasks;

public class Employee {

    private int employeeId;
    private String employeeName;
    private String designation;
    private double salary;

    public Employee(int employeeId, String employeeName,
                    String designation, double salary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;

        if (salary >= 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}
