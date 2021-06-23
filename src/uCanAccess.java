import java.sql.*;

public class uCanAccess {
    public static void main(String[] args) {
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://D:/Advanced java/ClassWorks/db/students_info.accdb");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from students");

            while(rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String dept = rs.getString(3);
                int btc = rs.getInt(4);
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Department: " + dept);
                System.out.println("Batch: " + btc);
                System.out.println("-----------------------------------------------");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
