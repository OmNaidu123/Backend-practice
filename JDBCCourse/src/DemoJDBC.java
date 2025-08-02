import java.sql.*; //importing package
public class DemoJDBC {
    public static void main(String[] args) throws Exception { //don't do this!! use try catch in actual code
        Class.forName("org.postgresql.Driver"); // loading and registering a driver
        String url = "jdbc:postgresql://localhost:5432/example";
        String username = "postgres";
        String password = "WASDkeys";
        Connection con = DriverManager.getConnection(url, username, password);//creating a connection
        System.out.println("connection established");
        Statement st = con.createStatement();//create statement
        String query1 = "select name from student_marks where student_id=1";//sql query for the db
        String query2 = "select * from student_marks";
        ResultSet rs1 = st.executeQuery(query1);//execute a statement
        rs1.next(); //returns boolean value, true if data present in this row and moves to the next, else false
        String name = rs1.getString("name");//getting the value of the row segment under the name column where student_id=1
        System.out.println(name);
        ResultSet rs2 = st.executeQuery(query2);
        while (rs2.next()) {
            System.out.println(rs2.getInt("Student_id") + " " + rs2.getString("name") + " " + rs2.getInt("Marks") );
        }
        con.close();// closing the connection
        System.out.println("connection closed");
    }
}
