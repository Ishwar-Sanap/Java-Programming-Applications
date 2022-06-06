import java.io.*;
import java.lang.*;
import java.net.*;
import java.util.Scanner;


class Myclient
{
    String s1 ,s2;
    Socket s;
    ServerSocket ss;
    Scanner keyData ;
    Scanner  ServerData;
    PrintStream ps ;

    public Myclient()
    {
        try
        {

             s = new Socket("LocalHost",1100);

        }
        catch(Exception obj){}


    }

    public void Communicate() throws Exception
    {

        while(!(s1 =keyData.nextLine()).equals("End"))
        {
            keyData = new Scanner(System.in);
            ServerData = new Scanner(s.getInputStream()); // it takes data from the socket s ie from serever
   
            ps = new PrintStream(s.getOutputStream()); // it send data to the socket that is  to server  
            //s1 = keyData.nextLine();
            ps.println(s1);     // Message you enterd (s1) by keybored is send to the  server through socket  s

            s2 = ServerData.nextLine();  // stored server data into the String s2
            System.out.println("Server says : "+s2);

            System.out.println("Enter message for server: ");
            

        }
    }

    protected void finalize()
    {   
        try
        {
            s.close();
            ss.close();
            keyData.close();
            ServerData.close();
            ps.close();
        }
        catch(Exception obj){}
    }

}

class Client1 
{
    public static void main(String[] args) 
    {
    
        System.out.println("Client application is running...");

        Myclient mobj = new Myclient();
        try
        {

            mobj.Communicate();
        }
        catch(Exception obj){}

        System.gc();
    }
}
