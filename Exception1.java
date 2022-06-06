import java.lang.*;
import java.util.*;

 class Exception1
{
    public static void main(String[] args)
     {
        int ans =0, no1 =0,no2 =0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter 1st Number :");
         no1 = sobj.nextInt();

        System.out.println("Enter 2nd Number :");
         no2 = sobj.nextInt();

        //  ans = no1/no2;

        try
        {
            // int ans=0;

            ans = no1/no2; // Exception Prone code

           // ans initialization in the this block is only available in this block only not outside
           System.out.println("In try block");
        }

        catch(ArithmeticException obj)
        {
            System.out.println("Expection occured as :"+obj);
        }

       // System.out.println("Division is : "+ans);

        finally()
        {
            sobj.close();
        }
    }
}
