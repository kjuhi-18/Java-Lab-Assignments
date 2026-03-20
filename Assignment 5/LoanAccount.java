class LoanAccount extends Account {

    public LoanAccount(int accNo, double loanAmount) {
        super(accNo, -loanAmount); // loan = negative balance
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Loan repaid: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Cannot withdraw from Loan Account!");
    }

    @Override
    public void display() {
        System.out.println("[Loan] Acc No: " + accountNumber + ", Loan Due: " + (-balance));
    }
}