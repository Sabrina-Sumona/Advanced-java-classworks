import java.sql.*;

public class JDBC {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    private final String url = "jdbc:mysql://localhost:3306/students";
    private final String username = "sabrina_sumona";
    private final String password = "sns963147";

    public Connection getConnection() {
        Connection con = null;
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public void insertStudent(int std_id, String std_name, String department, int batch) throws SQLException {
        this.connection = this.getConnection();

//        this.preparedStatement = this.connection.prepareStatement(
//             "INSERT INTO `student_info` (`std_id`, `std_name`, `department`, `batch`) VALUES (1234570, 'Nabiha', 'CSE', '46')"
//        );

        //        here '?' is basically used as a placeholder to take input & set data
        this.preparedStatement = this.connection.prepareStatement(
                "INSERT INTO student_info (std_id, std_name, department, batch) VALUES (?,?,?,?)"
        );

        //        here 1st '?' will be replaced by value of index 1, then 2nd one by index 2 and so on....
        this.preparedStatement.setInt(1, std_id);
        this.preparedStatement.setString(2, std_name);
        this.preparedStatement.setString(3, department);
        this.preparedStatement.setInt(4, batch);

        int affectedRows = this.preparedStatement.executeUpdate();
        System.out.println("-----------------------------------------------");
        System.out.println(affectedRows + " student's data has inserted into students database...");

        this.connection.close();
        this.preparedStatement.close();
    }

    public void viewStudent(int std_id) throws SQLException {
        this.connection = this.getConnection();

        this.preparedStatement = this.connection.prepareStatement(
                "SELECT * FROM `student_info` WHERE std_id = ?"
        );

        this.preparedStatement.setInt(1, std_id);

        this.resultSet = this.preparedStatement.executeQuery();

        while (resultSet.next()) {
            System.out.println("-----------------------------------------------");
            System.out.println("ID: " + this.resultSet.getString("std_id") );
            System.out.println("Name: " + this.resultSet.getString("std_name") );
            System.out.println("Department: " + this.resultSet.getString("department") );
            System.out.println("Batch: " + this.resultSet.getString("batch") );
        }

        this.connection.close();
        this.preparedStatement.close();
    }
}
