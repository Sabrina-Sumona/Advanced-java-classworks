//import MyPackage1.Class1;

public class PackageTesting1 {
    public static void main(String[] args) {
        MyPackage1.Class1 obj =new MyPackage1.Class1();
        obj.display("Sabrina Sumona");
        int num = 5;
        System.out.println("The number becomes " + num + " to " + obj.increment(num) + " after pre-increment.");
    }
}
