import java.lang.*;

class Demo {
    public int i;
    public int j;
    public static int k;

    // static block ha .class file JVM vr load zalay zalya call hoto
    static
    {   
        
        System.out.println("Inside staic block");
        k=11;
    }
    
    public Demo() // Default constructor
    {
        // this is not a pointer it is a Keyword in Java

        System.out.println(" Inside Default constructor");
        this.i=0;
        this.j =0;
    }

    public void fun() 
    {
        // Non static method can access both static as well as non static Characteristics
        System.out.println("inside Non static fun ");
        System.out.println(this.i);
        System.out.println(this.j);
        System.out.println(this.k);
   
    }

    public static void gun()
    {
        // static method can access only static Characteristics
        System.out.println("inside static gun ");
        System.out.println(k);
    }
}

class StaticDemo 
{

    public static void main(String arr[]) 
    {
        
        Demo.gun(); // calling gun() method without creating the object
        
        // Demo obj = new Demo();
        Demo obj;    // reference
        obj = new Demo();
        obj.fun();

        System.out.println(obj.i);
        System.out.println(obj.j);
    }
}
