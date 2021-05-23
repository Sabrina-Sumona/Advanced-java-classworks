public class MultiThreadMain2 {
    public static void main(String[] args)
    {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();
        D threadD = new D();
        E threadE = new E();

        threadE.setPriority(Thread.MAX_PRIORITY);
        threadD.setPriority(threadE.getPriority()-1);
        threadC.setPriority(threadE.getPriority()-2);
        threadB.setPriority(threadE.getPriority()-3);
        threadA.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Start E");
        threadE.start();

        System.out.println("Start D");
        threadD.start();

        System.out.println("Start C");
        threadC.start();

        System.out.println("Start B");
        threadB.start();

        System.out.println("Start A");
        threadA.start();

        System.out.println("END of Main Program");
    }

}
