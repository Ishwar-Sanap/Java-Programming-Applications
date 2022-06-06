// import is keyword to include external things in our application
// java is super package inside that lang package is there include all (*) from these packages
import java.lang.*;

// Java is the pure object oriented so every thing is written in  the class

// Demo.class file is loaded by class Loader

class Demo   // The main function is in such class whose name is same as  our Java File name
{
    //1     //2   //3   //4   //5   //6
    public static void main(String arg[])  // String is the class so 'S' is capital
    {
        //7     //8   //9      //10
        System.out.println("Jay Ganesh ....");
    }


}  // no semicolumn here at end of the class

/*  1) public : it is access specifier  our main function is called by the outsider entity i.e Intepretor so it shold be public 
    2) static : main function is the static function b'cause it is called by using class name without creating object
    3) void   : there is non any return value of main() function b'cze JVM is not intrested in the exit status of our application
    4) main() : entry point function
    5) String : commad line argument having data type string
    6) arg[]  :  it is Array name should be anything
    7) System : it is class name defined inside the java.lag package
    8) out    :    it is static member of  System class and out is object of printstream class
    9) println : method which display data on screen  (ln for new line)
    10) Jay Ganesh : it is the string that we want to display
*/


// command to execute java application 
// javac file_name.java    javac is compiler to compile 
// java file_name           java is interpretor