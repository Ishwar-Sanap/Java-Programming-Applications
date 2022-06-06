import java.io.*;
import java.lang.*;
import java.net.*;
import java.util.Scanner;

class Myserver 
{   
    String s1 ,s2;
    Socket s;
    ServerSocket ss;
    Scanner keyData ;
    Scanner clientData;
    PrintStream ps ;

    public Myserver() 
    {   
        try{

            ss = new ServerSocket(1100);
            s =ss.accept();
            System.out.println("Connection successful ..");
        }

        catch(Exception obj){}
    
    }

   public void Communicate() throws Exception
    {
        while((s1 = clientData.nextLine())!=null)
            {
                keyData = new Scanner(System.in);
                clientData = new Scanner(s.getInputStream());  // it takes input from the client throgh the socket s
            
                ps = new PrintStream(s.getOutputStream()); // it send the data to client through the socket s
                System.out.println("Client says :"+s1);
                
                System.out.println("Enter message for client :");
                s2=keyData.nextLine(); 
                ps.println(s2); // message you entered by keyborad (s2) is sending  to the client through socket
    
            }
    }

    protected void finalize()
    {   
        try
        {

            s.close();
            ss.close();
            keyData.close();
            clientData.close();
            ps.close();
        }
        catch(Exception obj){}
    }
}
class Server1
{
    public static void main(String arg[]) 
    {  
        System.out.println("server application is running...");
        
            Myserver msobj = new Myserver();
            try
            {

                msobj.Communicate();
            }

            catch(Exception obj){}
        
            System.gc();
        
    }
}