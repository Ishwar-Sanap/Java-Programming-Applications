import java.lang.*;
import java.io.*;

class input4
{
    public static void main(String args[])
     {
         
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

         try{
     
             System.out.println("Enter string:");
             String str = bobj.readLine();
     
             System.out.println("Enter Integer :");
             int no = Integer.parseInt(bobj.readLine());    // Integer is Wrapper Class 
                                                            // parseInt is static method
                                                            // parse --> means convert or typecaste

            System.out.println("Enter float :");
            float f = Float.parseFloat(bobj.readLine());

            System.out.println("Enter Double :");
            double d =  Double.parseDouble(bobj.readLine());

            System.out.println("String you Enter is :"+str);
            System.out.println("Integer you Entered is :"+no);
            System.out.println("Float you Entered is :"+f);
            System.out.println("Double you Entered is:"+d);

         }
        
         catch(IOException obj)
         {
             System.out.println("Exception occured ");
         }

         finally
         {
             // Realeases the resourse 

             iobj = null;   // null is keyword
             bobj = null;
         }
    }
}
