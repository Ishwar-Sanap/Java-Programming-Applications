import java.lang.*;

class Marvellous extends Thread
{
    public void run()
    {  
     
        System.out.println("Inside Thread:"+Thread.currentThread().getName());
        System.out.println(" Thread Priority: "+Thread.currentThread().getPriority());

    }
}
public class MyThred9_Priority
{
    public static void main(String[] args) {

        System.out.println("Main thread priority is :"+Thread.currentThread().getPriority());
     
        Marvellous mobj1 = new Marvellous();

        Thread t1 = new Thread(mobj1,"First");

        
        Marvellous mobj2 = new Marvellous();

        Thread t2 = new Thread(mobj2,"Second");

        t1.setPriority(5);
        t2.setPriority(10);

        t1.start();
        t2.start();

    }
}
