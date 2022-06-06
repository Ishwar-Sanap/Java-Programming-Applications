 import java.lang.*;
 class Base 
 {
    public void fun()
    {
        System.out.println("Base fun");
    }

    public final void gun()
    {
        System.out.println("Base gun");
    }
 }

 class Derived extends Base
 {
    public void fun()       // overriding
    {
        System.out.println("Derived fun");
    }

    /*
    public  void gun()     // Not allowed  b'caze fianal method can't override
    {
        System.out.println("Derived gun");
    }
    */
 }
 class Final2 {
   public static void main(String[] args) {
       
       
       Base obj = new Derived();

       Derived dobj = new Derived();

       dobj.fun();  // Derived fun

       dobj.gun();  // Base gun

   } 
}
