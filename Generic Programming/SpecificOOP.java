import java.lang.*;

class Arithmetic
{   
  public  int no1, no2;
  
  Arithmetic(int a, int b)
  {
      no1 = a;
      no2 =b;

  }

    public int Addition()
    {
        int Ans=0;
        Ans = no1+no2;
        return Ans;
    }
}
class SpecificOOP
{
    public static void main(String arg[])
    {   
        Arithmetic obj = new Arithmetic(10,11);
        int ret=0;
        ret=obj.Addition();
        System.out.println("Addition is :"+ret);

    }
    
}
