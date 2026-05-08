import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

        // Create Customers
        Customer c1 = new Customer(1, "Kunal");
        Customer c2 = new Customer(2, "Rahul");

        // Create Accounts
        Account s1 = new SavingsAccount(101, 5000);
        Account l1 = new LoanAccount(201, 20000);

        Account s2 = new SavingsAccount(102, 8000);

        // Assign accounts to customers
        c1.addAccount(s1);
        c1.addAccount(l1);

        c2.addAccount(s2);

        // Add customers to list
        customers.add(c1);
        customers.add(c2);

        // Perform some operations
        s1.deposit(1000);
        s1.withdraw(2000);

        l1.deposit(5000);

        // Display all customers and their accounts
        for (Customer c : customers) {
            c.displayCustomerDetails();
        }
    }
}