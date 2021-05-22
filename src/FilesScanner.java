import java.io.*;
import java.util.Scanner;

class FilesScanner {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new BufferedReader(new FileReader("info.txt")))) {
            int count = 0;
            while (sc.hasNext()) {
                if (count == 0) {
                    System.out.print("Student name: ");
                } else if (count == 1) {
                    System.out.print("Student dept.: ");
                } else {
                    System.out.print("Student id: ");
                }
                count++;
                System.out.println(sc.next());
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}