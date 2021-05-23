import java.io.*;
import java.util.Scanner;

class Assignment2_b {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new BufferedReader(new FileReader("citystudents.txt")))) {
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}