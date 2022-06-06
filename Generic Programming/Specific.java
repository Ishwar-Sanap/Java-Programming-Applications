import java.lang.*;

class Arithmetic
{
    public int Addition(int no1,int no2)
    {
        int Ans=0;
        Ans = no1+no2;
        return Ans;
    }
}
class Specific 
{
    public static void main(String arg[])
    {   
        Arithmetic obj = new Arithmetic();
        int ret=0;
        ret=obj.Addition(11,10);
        System.out.println("Addition is :"+ret);

    }
    
}
