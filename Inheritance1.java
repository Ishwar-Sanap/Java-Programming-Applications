 import java.lang.*;   
 
 class Base
 {
     public int i;
     public int j;

     public Base()
     {
         System.out.println("Inside base constructor");
         this.i =0;
         this.j =0;
     }

     public void fun()
     {
         System.out.println("Inside Base fun");
     }

     public void fun(int x)
     {
         System.out.println("Inside Base fun with integer argument");
     }

     public void gun()
     {
         System.out.println("Inside Base gun");
     }
 }


 class Derived extends Base   // class Derived : public Base  (in cpp)
 {
     public int x;
     public int y;

     public Derived()
     {
         System.out.println("Inside Derived constructor");
         this.i =0;
         this.j =0;
     }

     public void sun()
     {
         System.out.println("Inside Derived sun");
     }
 }

 /*======================== Main Class =========================*/ 
 class Inheritance1 
 {
     static 
     {
         System.out.println("Inside static block");
     }
    public static void main(String arr[])
    {   

        System.out.println("Inside  main");

        Derived dobj = new Derived();
        dobj.fun();
        dobj.fun(11);
        dobj.gun();
        dobj.sun();


    }
}
