import java.lang.*;
import java.util.*; 

//import java.util.Scanner
 // in java package there is nested util package and in that package Scanner class is present 

class input 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter you name :");
        String name = sobj.nextLine();

        System.out.println("Enter you age :");
        int age = sobj.nextInt();

        System.out.println("Enter Percentage");
        float Percentage = sobj.nextFloat();

        
        System.out.println("\n\t Name : "+name);
        System.out.println("\t Age : "+age);
        System.out.println("\t Percentage : "+Percentage+"\n");

        sobj.close(); // just like free function to dealloacted the resources
    }
}
