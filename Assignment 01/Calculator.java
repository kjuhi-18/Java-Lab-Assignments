import java.util.Scanner;

public class Calculator {

    public static int addnums(int n1, int n2) {
        return n1 + n2;
    }

    public static int subnums(int n1, int n2) {
        return n1 - n2;
    }

    public static long mulnums(int n1, int n2) {
        return (long) n1 * n2;
    }

    public static float divnums(int n1, int n2) {
        return (float) n1 / n2;
    }

    public static int modulus(int n1, int n2) {
        return n1 % n2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opr;

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("0. Exit");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.print("Enter your choice: ");

            opr = scan.nextInt();

            if (opr == 0) {
                System.out.println("Exiting Calculator...");
                break;
            }

            System.out.print("Enter first number: ");
            int n1 = scan.nextInt();

            System.out.print("Enter second number: ");
            int n2 = scan.nextInt();

            switch (opr) {
                case 1:
                    System.out.println("Sum = " + addnums(n1, n2));
                    break;
                case 2:
                    System.out.println("Difference = " + subnums(n1, n2));
                    break;
                case 3:
                    System.out.println("Product = " + mulnums(n1, n2));
                    break;
                case 4:
                    System.out.println("Quotient = " + divnums(n1, n2));
                    break;
                case 5:
                    System.out.println("Remainder = " + modulus(n1, n2));
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (true);

        scan.close();
    }
}
