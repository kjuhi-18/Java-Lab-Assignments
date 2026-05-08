import java.sql.*;

public class RestaurantCRUD {

    static final String URL = "jdbc:mysql://localhost:3306/java";
    static final String USER = "root";
    static final String PASS = "010824@Symbi";

    public static void printResult(ResultSet rs) throws Exception {
        ResultSetMetaData md = rs.getMetaData();
        int cols = md.getColumnCount();

        for(int i=1;i<=cols;i++)
            System.out.printf("%-15s", md.getColumnName(i));
        System.out.println();

        while(rs.next()){
            for(int i=1;i<=cols;i++)
                System.out.printf("%-15s", rs.getString(i));
            System.out.println();
        }
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL,USER,PASS);

            Statement st = con.createStatement();

            
            // -------- SELECT price <=100 --------

            System.out.println("\nItems with Price <=100");
            ResultSet rs = st.executeQuery(
                    "SELECT * FROM MenuItem WHERE Price<=100");
            printResult(rs);


            // ------- SELECT items available in Cafe Java -------

            System.out.println("\nItems in Cafe Java");
            rs = st.executeQuery(
                "SELECT m.* FROM MenuItem m " +
                "JOIN Restaurant r ON m.ResId=r.Id " +
                "WHERE r.Name='Cafe Java'"
            );
            printResult(rs);


            // -------- UPDATE price <=100 to 200 --------

            st.executeUpdate(
                "UPDATE MenuItem SET Price=200 WHERE Price<=100"
            );

            System.out.println("\nAfter Update");
            rs = st.executeQuery("SELECT * FROM MenuItem");
            printResult(rs);


            // -------- DELETE names starting with P --------

            st.executeUpdate(
                "DELETE FROM MenuItem WHERE Name LIKE 'P%'"
            );

            System.out.println("\nAfter Delete");
            rs = st.executeQuery("SELECT * FROM MenuItem");
            printResult(rs);


            con.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}