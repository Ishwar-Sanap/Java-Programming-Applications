import java.lang.*;


class Demo extends Thread
{   
    // writhing running method is compulsory to run the thred
    
    public void run() // running state when thred is sheduled
    {

        for(int i=0; i<10; i++)
        {
            System.out.println("Value of i :"+i);
            try{

                Thread.sleep(1000); // 1000 =mls 
            }

            catch(Exception obj)
            {

            }
        }

    }
}

class Mythred5
{
    public static void main(String a[]) throws Exception
    {
        Demo obj1 = new Demo();

        Thread t1 = new Thread(obj1,"First"); // new state

        Demo obj2 = new Demo();

        Thread t2 = new Thread(obj2,"Second"); // new state

        t1.start();   // runnable state


        t1.join();   // execution stop hot jopoarynt t1 thred complete hot nahi

        t2.start();

         // dead state
    }
}

