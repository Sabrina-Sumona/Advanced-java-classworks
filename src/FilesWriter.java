import java.io.*;
import java.util.Scanner;

class FilesWriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine()+" ";
        System.out.println("Enter your dept. name:");
        String dept = sc.nextLine()+" ";
        System.out.println("Enter your id:");
        String id =  sc.nextLine();
        try (FileWriter fileWriter = new FileWriter("info.txt")) {
            fileWriter.write(name);
            fileWriter.write(dept);
            fileWriter.write(id);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}