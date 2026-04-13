import java.util.Date;

public abstract class Employee {
    protected String name;
    protected String panNo;
    protected Date joiningDate;
    protected String designation;
    protected int empId;

    public Employee(String name, String panNo, Date joiningDate,
                    String designation, int empId) {
        this.name = name;
        this.panNo = panNo;
        this.joiningDate = joiningDate;
        this.designation = designation;
        this.empId = empId;
    }

    // Updated abstract method
    public abstract double calcCTC(Payroll payroll);
}