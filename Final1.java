 import java.lang.*;
 
 class Demo
 {
    public int i;
    public final int j=20;  // it is vaiid to initilize fianl characteristics in class
    public final int k;

    public Demo()
    {
        this.i =10;
        this.k =30;   // final characeristics can also initialize inside constructor
    }

    public Demo(int i, int k)
    {
        // this.j =100; NA
        this.i =i;
        this.k =k;
    }

    public void fun()
    {
        i++;
        // j++; not allowed
        // k++; not allowed
    }
 }
 
 class Final1 {
    public static void main(String arg[])
    {
        Demo obj = new Demo();
        obj.fun();

        Demo obj2 = new Demo(11,21);
        
        System.out.println(obj2.i +" "+obj2.j+" "+obj2.k+" ");
    }
}
