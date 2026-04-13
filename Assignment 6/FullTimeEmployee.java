import java.util.Date;

public class FullTimeEmployee extends Employee {
    protected String role;

    public FullTimeEmployee(String name, String panNo, Date joiningDate,
                            String designation, int empId,
                            double baseSalary, double perfBonus, String role)
            throws InvalidSalaryException {

        super(name, panNo, joiningDate, designation, empId);

        if (baseSalary < 0 || perfBonus < 0) {
            throw new InvalidSalaryException("Base salary or bonus cannot be negative!");
        }

        this.role = role;
    }

    @Override
    public double calcCTC(Payroll p) {
        if (role.equalsIgnoreCase("SWE")) {
            return p.getBaseSalary() + p.getBonus();
        } else if (role.equalsIgnoreCase("HR")) {
            return p.getBaseSalary() + (0.1 * p.getBaseSalary());
        }
        return p.getBaseSalary();
    }
}