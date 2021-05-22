import java.io.*;
import java.util.Scanner;

class Assignment1_a
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[][] students = new String[5][5];
        try (FileWriter fileWriter = new FileWriter("citystudent.txt")) {
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
                System.out.println("Enter student" + (i+1) + "'s phone no.:");
                fileWriter.write("Student" + (i+1) + "'s_phone_no.:" + (students[i][4] = sc.nextLine()) + ", ");
                i++;
                System.out.println();
                fileWriter.write("\n");
            }
            i = 0;
            while(i < students.length){
                System.out.println("Student" + (i+1) + "'s id: " + students[i][0]);
                System.out.println("Student" + (i+1) + "'s name: " + students[i][1]);
                System.out.println("Student" + (i+1) + "'s batch: " + students[i][2]);
                System.out.println("Student" + (i+1) + "'s semester: " + students[i][3]);
                System.out.println("Student" + (i+1) + "'s phone no.: " + students[i][4]);
                System.out.println();
                i++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}