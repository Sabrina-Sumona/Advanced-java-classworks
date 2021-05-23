//class A extends Thread
//{
//    public void run()
//    {
//        System.out.println("Start A");
//        for (int i=1; i<=5; i++)
//        {
//            System.out.println("\t From A : i = "+ i);
//        }
//
//
//        System.out.println("Exit A");
//    }
//}
//
//class B extends Thread
//{
//    public void run()
//    {
//        System.out.println("Start B");
//        for (int j=1; j<=5; j++)
//        {
//            System.out.println("\t From B : j = "+ j);
//        }
//
//        System.out.println("Exit B");
//    }
//}
//
//class C extends Thread
//{
//    public void run()
//    {
//        System.out.println("Start C");
//        for (int k=1; k<=5; k++)
//        {
//            System.out.println("\t From C : k = "+ k);
//        }
//
//        System.out.println("Exit C");
//    }
//}
//
//class D extends Thread
//{
//    public void run()
//    {
//        System.out.println("Start D");
//        for (int l=1; l<=5; l++)
//        {
//            System.out.println("\t From D : l = "+ l);
//        }
//
//
//        System.out.println("Exit D");
//    }
//}
//
//class E extends Thread
//{
//    public void run()
//    {
//        System.out.println("Start E");
//        for (int m=1; m<=5; m++)
//        {
//            System.out.println("\t From E : m = "+ m);
//        }
//
//        System.out.println("Exit E");
//    }
//}
//
//class MultiThreading
//{
//    public static void main(String[] args)
//    {
//        new A().start();
//        new B().start();
//        new C().start();
//        new D().start();
//        new E().start();
//    }
//}