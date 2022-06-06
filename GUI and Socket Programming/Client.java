import java.io.*;
import java.lang.*;
import java.net.*;
import java.util.Scanner;

class Client
{
    public static void main(String[] args) 
    {
    
        System.out.println("Client application is running...");
        String s1 = null, s2 = null;
        Socket s = null;
        Scanner keyData = null;
        Scanner ServerData = null;
        PrintStream ps = null;

        try
        {

             s = new Socket("LocalHost",1100);
    
             keyData = new Scanner(System.in);
             ServerData = new Scanner(s.getInputStream()); // it takes data from the socket s ie from serever
    
             ps = new PrintStream(s.getOutputStream()); // it send data to the socket that is  to server  
    
           while(!(s1 =keyData.nextLine()).equals("End"))
            {
               
                //s1 = keyData.nextLine();
                ps.println(s1);     // Message you enterd (s1) by keybored is send to the  server through socket  s
    
                s2 = ServerData.nextLine();  // stored server data into the String s2
                System.out.println("Server says : "+s2);
    
                System.out.println("Enter message for server: ");
                
    
            }
        }

        catch(Exception obj)
        {}

        try
        {

            s.close();
            keyData.close();
            ServerData.close();
            ps.close();
        }

        catch(Exception obj)
        {}
    }
}
