import java.util.Date;

public class main {
    public static void main(String[] args) {
        try {

            FullTimeEmployee emp1 = new FullTimeEmployee(
                    "John", "ABCDE1234F", new Date(),
                    "Software Engineer", 101,
                    0, 0, "SWE"
            );

            ContractEmployee emp2 = new ContractEmployee(
                    "Alice", "XYZAB5678K", new Date(),
                    "Consultant", 102,
                    0, 0
            );

            Manager mgr = new Manager(
                    "Bob", "LMNOP4321Z", new Date(),
                    "Project Manager", 103,
                    0, 0, "SWE",
                    0, 0
            );

            Payroll p1 = new Payroll(50000, 10000, 0, 0, 0, 0);
            Payroll p2 = new Payroll(0, 0, 0, 0, 160, 200);
            Payroll p3 = new Payroll(80000, 20000, 5000, 7000, 0, 0);

            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.printf("%-15s %-15s %-20s %-15s %-15s\n",
                    "Emp Type", "Base Salary", "Health Ins", "Bonus", "CTC");
            System.out.println("--------------------------------------------------------------------------------------------------");

            System.out.printf("%-15s %-15.2f %-20.2f %-15.2f %-15.2f\n",
                    "Full-Time", p1.getBaseSalary(), 5000.0, p1.getBonus(), emp1.calcCTC(p1));

            System.out.printf("%-15s %-15s %-20s %-15s %-15.2f\n",
                    "Contract", "-", "-", "-", emp2.calcCTC(p2));

            System.out.printf("%-15s %-15.2f %-20.2f %-15.2f %-15.2f\n",
                    "Manager", p3.getBaseSalary(), 10000.0, p3.getBonus(), mgr.calcCTC(p3));

            System.out.println("--------------------------------------------------------------------------------------------------");

        } catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}