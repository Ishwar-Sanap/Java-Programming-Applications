import java.io.*;
import java.lang.*;
import java.net.*;
import java.util.Scanner;

class Server
{
    public static void main(String arg[]) throws Exception
    {  
        System.out.println("server application is running...");
        String s1 = null, s2 = null;
        Socket s = null;
        ServerSocket ss=null;
        Scanner keyData = null;
        Scanner clientData  = null;
        PrintStream ps = null;

        try
        {

             ss = new ServerSocket(1100);
             s = ss.accept();
            System.out.println("Connection successful ..");
    
             keyData = new Scanner(System.in);
             clientData = new Scanner(s.getInputStream());  // it takes input from the client throgh the socket s
    
             ps = new PrintStream(s.getOutputStream()); // it send the data to client through the socket s
    
            while((s1 = clientData.nextLine())!=null)
            {
    
                
              //  s1 = clientData.nextLine();
                System.out.println("Client says :"+s1);
                
                System.out.println("Enter message for client :");
                s2=keyData.nextLine(); 
                ps.println(s2); // message you entered by keyborad (s2) is sending  to the client through socket
    
            }
        }

        catch (Exception obj){}

        try{


            s.close();
            ss.close();
            keyData.close();
            clientData.close();
            ps.close();
        }
        catch (Exception obj){}

    }
}