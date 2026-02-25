import java.util.Scanner;

public class MainVector {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter size of first vector: ");
            int size1 = sc.nextInt();

            if (size1 != 2 && size1 != 3) {
                throw new Exception("Not a valid vector! Only 2D or 3D vectors allowed.");
            }

            double[] v1 = new double[size1];
            System.out.println("Enter elements of first vector:");
            for (int i = 0; i < size1; i++) {
                v1[i] = sc.nextDouble();
            }

            System.out.print("Enter size of second vector: ");
            int size2 = sc.nextInt();

            if (size2 != 2 && size2 != 3) {
                throw new Exception("Not a valid vector! Only 2D or 3D vectors allowed.");
            }

            double[] v2 = new double[size2];
            System.out.println("Enter elements of second vector:");
            for (int i = 0; i < size2; i++) {
                v2[i] = sc.nextDouble();
            }

            VectorOperations vec1 = new VectorOperations(v1);
            VectorOperations vec2 = new VectorOperations(v2);

            System.out.println("\nAddition Result:");
            VectorOperations addResult = vec1.add(vec2);
            addResult.display();

            System.out.println("Subtraction Result:");
            VectorOperations subResult = vec1.subtract(vec2);
            subResult.display();

            double dot = vec1.dotProduct(vec2);
            System.out.println("Dot Product: " + dot);

        } catch (VectorSizeMismatchException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}