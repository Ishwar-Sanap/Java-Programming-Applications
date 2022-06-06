import java.lang.*;

class Base
{
    public int i;
    public int j;

    /* Every methods in java inside the class is considered as a virtual method */

    public void fun()       // Defination
    {
        System.out.println("Base fun ");
    }

    public void sun()        // Defination
    {
        System.out.println("Base sun ");
    }

    public void gun()        // Defination
    {
        System.out.println("Base gun ");
    }
}

class Derived extends Base
{
    public int x,y;

    @Override
    public void fun()       //overriding
    {
        System.out.println("Derived fun ");
    }

    public void run()      // Defination
    {
        System.out.println("Derived run ");
    }

    public void gun()      // overriding
    {
        System.out.println("Derived gun ");
    }
}
class virtual {
    public static void main(String[] args) {
        
        // Base bobj = new Base(); no casting 

        Base obj= new Derived(); // upcasting  by taking the reference of  Base class we make object of Derived class
        obj.fun();  // first it check this method fun is present in Base or not if present then again check in derived class if present then call

        // Derived dobj= new Derived(); Downcasting
    }
}
