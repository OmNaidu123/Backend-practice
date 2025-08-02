import java.sql.*;
public class PreS {
   public static void main(String[] args) throws Exception{
       String url = "jdbc:postgresql://localhost:5432/example";
       String username = "postgres";
       String pass = "WASDkeys";
       Connection con = DriverManager.getConnection(url,username,pass);
       String sql = "insert into student_marks values(?,?,?)";
       PreparedStatement pst = con.prepareStatement(sql);
       pst.setInt(1,6);
       pst.setString(2,"Akash");
       pst.setInt(3,98);
       pst.execute();
       System.out.println("data added");
       con.close();
   }
}
