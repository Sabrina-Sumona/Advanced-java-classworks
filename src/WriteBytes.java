import java.io.*;

class WriteBytes {
    public static void main(String[] args) {
        byte[] cities = {'D','H','A','K','A',',','K','H','U','L','N','A',',', 'R','A','J','S','H','A','H','I',',','S','A','V','A','R',',','B','O','G','R','A'};
        FileOutputStream outfile;
        try {
            outfile = new FileOutputStream("city.txt");
            outfile.write(cities);
            outfile.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}