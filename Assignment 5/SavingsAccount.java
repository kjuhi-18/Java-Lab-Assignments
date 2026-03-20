class SavingsAccount extends Account {
    private double interestRate = 0.04;

    public SavingsAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * interestRate);
        System.out.println("Deposited with interest: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 1000) { // minimum balance condition
            balance -= amount;
            System.out.println("Withdrawn from Savings: " + amount);
        } else {
            System.out.println("Minimum balance must be maintained!");
        }
    }

    @Override
    public void display() {
        System.out.println("[Savings] Acc No: " + accountNumber + ", Balance: " + balance);
    }
}