import java.util.ArrayList;

class Customer {
    private int customerId;
    private String name;
    private ArrayList<Account> accounts;

    public Customer(int id, String name) {
        this.customerId = id;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public void displayCustomerDetails() {
        System.out.println("\nCustomer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Accounts:");

        for (Account acc : accounts) {
            acc.display();
        }
    }
}