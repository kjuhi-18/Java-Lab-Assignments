import java.util.Date;

public class ContractEmployee extends Employee {

    public ContractEmployee(String name, String panNo, Date joiningDate,
                            String designation, int empId,
                            int noOfHours, double hourlyRate)
            throws InvalidSalaryException {

        super(name, panNo, joiningDate, designation, empId);

        if (noOfHours < 0 || hourlyRate < 0) {
            throw new InvalidSalaryException("Hours or hourly rate cannot be negative!");
        }
    }

    @Override
    public double calcCTC(Payroll p) {
        return p.getNoOfHours() * p.getHourlyRate();
    }
}