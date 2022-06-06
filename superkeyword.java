import java.lang.*;   
 
// Base class cha parent class ha Object class asto
// jr super Base madhe use kela tr object class che members access hotil

/*
class Object 
{
    //contents
}
*/
class Base
{
    public int i;
    public int j;

    public Base()
    {
        System.out.println("Inside base constructor");
        this.i =10;
        this.j =20;
    }

    public Base(int a, int b)
    {
        this.i =a;
        this.j =b;
    }

    public void fun()
    {
        System.out.println("Inside Base fun");
        
    }

}


class Derived extends Base   // class Derived : public Base  (in cpp)
{
    public int x;
    public int y;

    public Derived()
    {
        
        super(11,21); //3   //  call to super must be first statement in constructor
        System.out.println("Inside Derived constructor");
        this.i =30;
        this.j =40;
        
    }

    public void sun()
    {
        System.out.println("Inside Derived sun");

        System.out.println(super.i);//1
        super.fun(); //2
       
        // super keyword ne imdentiate parent class che member Derived class madhun access hotat
        // super keyword used in only Derived class
    }
}

/*======================== Main Class =========================*/ 
class superkeyword 
{
   public static void main(String arr[])
   {   

       Derived dobj = new Derived();
        dobj.sun();
   }
}
