import java.sql.*;
public class CRUDops {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:postgresql://localhost:5432/example";
        String user = "postgres";
        String password = "WASDkeys";
        Connection con = DriverManager.getConnection(url,user,password);
        Statement st = con.createStatement();
        //creating new entries
        String q1 = "insert into student_marks values(6,'Akash',98)";
        st.execute(q1);
        //updating entries in a dp
        String q2 = "update student_marks set name = 'Shamish' where student_id = 6";
        st.execute(q2);
        //reading entries
        String q3 = "select * from student_marks";
        ResultSet rs = st.executeQuery(q3);
        while(rs.next())
            System.out.println(rs.getInt(1) +" "+ rs.getString(2)+" "+rs.getInt(3));
        //deleting data in db
        String q4 = "delete from student_marks where student_id=6";
        st.execute(q4);
        con.close();
    }
}
