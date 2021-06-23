import java.sql.SQLException;
import java.util.Scanner;

public class MainClass_JDBC {
    public static void main(String[] args) {
        JDBC dbApp = new JDBC();
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("-----------------------------------------------");
            System.out.println("INSERTION: Please enter the information to insert in the database");
            System.out.println("-----------------------------------------------");
            System.out.println("Student id:");
            int std_id = sc.nextInt();
            System.out.println("Student name:");
            String std_name = sc.next();
            System.out.println("Student department:");
            String department = sc.next();
            System.out.println("Student batch:");
            int batch = sc.nextInt();
            dbApp.insertStudent(std_id, std_name, department, batch);
            dbApp.viewStudent(std_id);

            System.out.println("-----------------------------------------------");
            System.out.println("SELECTION: Please enter the student id to select from the database");
            std_id = sc.nextInt();
            dbApp.viewStudent(std_id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
