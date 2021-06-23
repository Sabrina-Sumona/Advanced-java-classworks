import java.io.*;
import java.util.Scanner;

class mid_lab_q2_p2
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new BufferedReader(new FileReader("register.txt")))) {
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}