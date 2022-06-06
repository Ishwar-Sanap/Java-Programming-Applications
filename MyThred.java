public class MyThred 
{
    public static void main(String[] args) {
     
        System.out.println("inside main");

        Thread tobj = Thread.currentThread(); // return the reference of current exucating method

        System.out.println(" Name of Current thread is : "+tobj.getName());
    }
}
