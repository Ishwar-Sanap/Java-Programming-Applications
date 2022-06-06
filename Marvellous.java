import java.lang.*; // this is optional if you not imported then by it gets imported

class Demo
{
    public int i;
    public int j;

    // Default constructor
    public Demo()
    {   // this is not a pointer it is a Keyword in Java
        this.i =0;
        this.j =0;
    }

    // Parameterised constructor
    public Demo (int x, int y)
    {
        this.i =x;
        this.j =y;
    }

    public void fun()
    {
        System.out.println("Inside fun ");
    }

    public void gun()
    {
        System.out.println("Inside gun ");
    }
}

class Marvellous
{
    public static void main(String arr[])
    {
        System.out.println("Inside main ");

        // Demo obj;  not allowed in java b'cze it is not dynamic
        Demo obj = new Demo(); // Object creation

        obj.fun(); // fun(obj)
        obj.gun();  // gun(obj)

        System.out.println(obj.i);
        System.out.println(obj.j);

        Demo objx = new Demo(11,21); // Object creation

        objx.fun(); // fun(obj)
        objx.gun();  // gun(obj)
    
        System.out.println(objx.i);
        System.out.println(objx.j);

    }

    
}