import java.lang.*;
import java.util.Scanner;

class Marvellous
{
    public int Arr[];

    public Marvellous(int Size)
    {
        Arr = new int[Size];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enters Numbers ");

        for(int i=0; i<this.Arr.length; i++)
        {
            this.Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println(" \n Data of array : ");

        for(int i=0; i<this.Arr.length; i++)
        {
            System.out.println( this.Arr[i] +" ");   
        }
    }

    synchronized public void DisplayEven()
    {   
        
        for(int i=0; i<this.Arr.length; i++)
        {
            if(this.Arr[i]%2==0)
            {
                System.out.println(this.Arr[i] +" ");
            }
        }
    }
}

class Demo extends Thread
{   
    public Marvellous mref;  // creating referenace of Marvellous

    public Demo(Marvellous obj)
    {   
        this.mref =obj;
    }

   public void run() 
    {   
        // both the threds paralally  displaying the Even Number 
        // side by side it not display on console 
        // it required Window to display side by side even number (GUI)
        this.mref.DisplayEven();
        
    }
}

class Mythred8
{
    public static void main(String a[]) throws Exception
    {
        Marvellous mobj1 = new Marvellous(2);
        Marvellous mobj2 = new Marvellous(4);

        mobj1.Accept();
        mobj1.Display();

        mobj2.Accept();
        mobj2.Display();

        Demo  dobj1 = new Demo(mobj1);
        Demo dobj2 = new Demo(mobj2);

        Thread t1 = new Thread(dobj1);
        Thread t2 = new Thread(dobj2);

        t1.start();
        t2.start();

        // t1 and t2 thred complete execute Hoiparyant main thread la thambvun thevalay 

        t1.join();
        t2.join();
        
        System.out.println("End of main thread ");
    }
}

