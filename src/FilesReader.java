import java.io.*;
import java.io.FileReader;

class FilesReader
{
    public static void main(String[] args)
    {
        FileReader infile;
        int b;
        int count = 0;

        try
        {
            infile = new FileReader("info.txt");
            while((b = infile.read()) != -1) {
                if (b == ' ') {
                    if (count == 1) {
                        System.out.print("\nStudent dept.: ");
                        count++;
                    } else {
                        System.out.print("\nStudent id: ");
                    }
                }
                else {
                    if (count == 0) {
                        System.out.print("Student name: ");
                        count++;
                    }
                    System.out.print((char) b);
                }
            }
            infile.close();
        }

        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
    }
}
