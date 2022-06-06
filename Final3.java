import java.lang.*;
import java.security.PublicKey;

final class Base 
{
   public void fun()
   {
       System.out.println("Base fun");
   }

}

/*
    class Derived extends Base   Not allowed b'cause final class is not inherited
    {
    
    }
*/

class Derived
{
    public Base bobj = new Base();  // composition

    public void gun()
   {
       System.out.println("Base gun");
   }
}

class Final3 {
  public static void main(String[] args)
   {
      Derived dobj = new Derived();

      dobj.bobj.fun();
  } 
}
