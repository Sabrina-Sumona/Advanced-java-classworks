import java.io.*;
import java.util.Scanner;

class mid_lab_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] students = new String[3][7];
        try (FileWriter fileWriter = new FileWriter("register.txt")) {
            int i = 0;
            while(i < students.length){
                System.out.println("Enter student" + (i+1) + "'s id:");
                fileWriter.write("Student" + (i+1) + "'s_id:" + (students[i][0] = sc.nextLine()) + ", ");
                System.out.println("Enter student" + (i+1) + "'s name:");
                fileWriter.write("Student" + (i+1) + "'s_name:" + (students[i][1] = sc.nextLine()) + ", ");
                System.out.println("Enter student" + (i+1) + "'s batch:");
                fileWriter.write("Student" + (i+1) + "'s_batch:" + (students[i][2] = sc.nextLine()) + ", ");
                System.out.println("Enter student" + (i+1) + "'s semester:");
                fileWriter.write("Student" + (i+1) + "'s_semester:" + (students[i][3] = sc.nextLine()) + ", ");
                System.out.println("Enter student" + (i+1) + "'s course codes:");
                fileWriter.write("Student" + (i+1) + "'s_course1_code.:" + (students[i][4] = sc.nextLine()) + ", ");
                fileWriter.write("Student" + (i+1) + "'s_course2_code.:" + (students[i][5] = sc.nextLine()) + ", ");
                fileWriter.write("Student" + (i+1) + "'s_course3_code.:" + (students[i][6] = sc.nextLine()) + ".\n ");
                i++;
                System.out.println();
                fileWriter.write("\n");
            }
            fileWriter.close();
            i = 0;
            while(i < students.length){
                System.out.println("Student" + (i+1) + "'s id: " + students[i][0]);
                System.out.println("Student" + (i+1) + "'s name: " + students[i][1]);
                System.out.println("Student" + (i+1) + "'s batch: " + students[i][2]);
                System.out.println("Student" + (i+1) + "'s semester: " + students[i][3]);
                System.out.println("Student" + (i+1) + "'s course1 code: " + students[i][4]);
                System.out.println("Student" + (i+1) + "'s course1 code: " + students[i][5]);
                System.out.println("Student" + (i+1) + "'s course1 code: " + students[i][6]);
                System.out.println();
                i++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}