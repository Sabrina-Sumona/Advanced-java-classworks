import java.io.*;
import java.nio.file.*;
import java.util.*;

class Assignment2_c {
    public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your option:\n1. Search\n2. Delete\n3. Sort");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    try {
                        FileReader fileReader;
                        BufferedReader bufferedReader;
                        fileReader = new FileReader("citystudents.txt");
                        bufferedReader = new BufferedReader(fileReader);
                        System.out.println("Please enter the element which you want to search: ");
                        String element1 = scanner.nextLine();
                        String str1;
                        while ((str1 = bufferedReader.readLine()) != null) {
                            if (str1.contains(element1)) {
                                System.out.println(str1.replace(", ", "\n"));
                            }
                        }
                        fileReader.close();
                    } catch(NoSuchFileException e) {
                        System.out.println("No such file/directory exists");
                    }
                    catch(DirectoryNotEmptyException e) {
                        System.out.println("Directory is not empty.");
                    }
                    catch(IOException e) {
                        System.out.println("Invalid permissions.");
                    }
                    System.out.println("Searching successful.");
                    break;
                case 2:
                    try {
                        Files.deleteIfExists(Paths.get("citystudents.txt"));
                    }
                    catch(NoSuchFileException e) {
                        System.out.println("No such file/directory exists");
                    }
                    catch(DirectoryNotEmptyException e) {
                        System.out.println("Directory is not empty.");
                    }
                    catch(IOException e) {
                        System.out.println("Invalid permissions.");
                    }
                    System.out.println("Deletion successful.");
                break;
            case 3:
                try {
                    BufferedReader reader = new BufferedReader(new FileReader("citystudents.txt"));
                    ArrayList<String> str = new ArrayList<>();
                    String line;
                    while((line=reader.readLine())!=null) {
                        str.add(line);
                    }
                    reader.close();
                    Collections.sort(str);
                    FileWriter writer = new FileWriter("newfile.txt");
                    for(String s: str) {
                        writer.write(s);
                        writer.write("\r\n");
                    }
                    writer.close();
                }
                catch(NoSuchFileException e) {
                    System.out.println("No such file/directory exists");
                }
                catch(DirectoryNotEmptyException e) {
                    System.out.println("Directory is not empty.");
                }
                catch(IOException e) {
                    System.out.println("Invalid permissions.");
                }
                System.out.println("Sorting successful.");
                break;
            }
        }
    }