import java.io.FileWriter;
import java.io.IOException;

public class AddStudents {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("StudentRecord.csv", true);

            writer.append("3,C,ENTC,65,64,46,0,0,0\n");
            writer.append("4,D,CS,78,82,65,0,0,0\n");
            writer.append("5,E,IT,64,24,96,0,0,0\n");

            writer.close();
            System.out.println("New Students Added.");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
