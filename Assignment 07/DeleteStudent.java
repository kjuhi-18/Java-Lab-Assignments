import java.io.*;
import java.util.*;

public class DeleteStudent {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int deleteId = 3;

        try {
            BufferedReader br = new BufferedReader(new FileReader("StudentRecorhhyd.csv"));
            String line;

            list.add(br.readLine()); // header

            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");

                if (Integer.parseInt(d[0]) != deleteId) {
                    list.add(line);
                }
            }

            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter("StudentRecord.csv"));
            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }

            bw.close();
            System.out.println("Student deleted (ID = " + deleteId + ")");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
