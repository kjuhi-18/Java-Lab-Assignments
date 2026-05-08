public class Payroll {
    private double baseSalary;
    private double bonus;
    private double travelAllowance;
    private double educationAllowance;
    private int noOfHours;
    private double hourlyRate;

    public Payroll(double baseSalary, double bonus,
                   double travelAllowance, double educationAllowance,
                   int noOfHours, double hourlyRate) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.travelAllowance = travelAllowance;
        this.educationAllowance = educationAllowance;
        this.noOfHours = noOfHours;
        this.hourlyRate = hourlyRate;
    }

    public double getBaseSalary() { return baseSalary; }
    public double getBonus() { return bonus; }
    public double getTravelAllowance() { return travelAllowance; }
    public double getEducationAllowance() { return educationAllowance; }
    public int getNoOfHours() { return noOfHours; }
    public double getHourlyRate() { return hourlyRate; }
}