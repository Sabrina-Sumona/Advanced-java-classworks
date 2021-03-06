class A extends Thread
{
    public void run()
    {
        System.out.println("A Started");
        for (int i=1; i<=5; i++)
        {
//            try{
//                sleep(5000);
//            }
//            catch(Exception e){System.out.println(e);}
            System.out.println("\t From A : i = "+ i);
        }


        System.out.println("Exit A");
    }
}

class B extends Thread
{
    public void run()
    {
        System.out.println("B Started");
        for (int j=1; j<=5; j++)
        {
            try{
                sleep(1000);
            }
            catch(Exception e){System.out.println(e);}
            System.out.println("\t From B : j = "+ j);
        }

        System.out.println("Exit B");
    }
}

class C extends Thread
{
    public void run()
    {
        System.out.println("C Started");
        for (int k=1; k<=5; k++)
        {
            try{
                sleep(2000);
            }
            catch(Exception e){System.out.println(e);}
            System.out.println("\t From C : k = "+ k);
        }

        System.out.println("Exit C");
    }
}

class D extends Thread
{
    public void run()
    {
        System.out.println("D Started");
        for (int l=1; l<=5; l++)
        {
            try{
                sleep(3000);
            }
            catch(Exception e){System.out.println(e);}
            System.out.println("\t From D : l = "+ l);
        }


        System.out.println("Exit D");
    }
}

class E extends Thread
{
    public void run()
    {
        System.out.println("E Started");
        for (int m=1; m<=5; m++)
        {
            try{
                sleep(4000);
            }
            catch(Exception e){System.out.println(e);}
            System.out.println("\t From E : m = "+ m);
        }

        System.out.println("Exit E");
    }
}

public class mid_lab_q3 {
    public static void main(String[] args)
    {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();
        D threadD = new D();
        E threadE = new E();

        threadE.setPriority(Thread.MAX_PRIORITY);
        threadD.setPriority(threadE.getPriority()-1);
        threadC.setPriority(threadD.getPriority()-1);
        threadB.setPriority(threadC.getPriority()-1);
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
