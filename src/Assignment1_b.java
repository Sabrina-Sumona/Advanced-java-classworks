import java.io.*;
import java.util.Scanner;

class Assignment1_b
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new BufferedReader(new FileReader("citystudent.txt")))) {
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}