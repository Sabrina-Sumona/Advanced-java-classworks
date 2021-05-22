import java.io.*;

class ReadBytes {
    public static void main(String[] args) {
        FileInputStream infile;
        int b;
        try {
            infile = new FileInputStream("city.txt");
            while((b = infile.read()) != -1) {
                System.out.print((char)b);
                if(b == ','){
                    System.out.println();
                }
            }
            infile.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
