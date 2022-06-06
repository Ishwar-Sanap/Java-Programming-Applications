import java.util.*;

class Exception2
{
    public static void main(String[] args) {
        
        // memory is allocated at Heap 
        int Arr[] = {10,20,30,40,50};

        System.out.print("Elements in Array :");
        for(int i:Arr)
        {
            System.out.print(" "+i);
        }

        Scanner sobj = new Scanner(System.in);

        System.out.println("\nEnter the index : ");
        int index = sobj.nextInt();

        try
        {
            
            System.out.println(" Element at that index : "+Arr[index]);
            System.out.println("Inside try ");   // this is not excute when exception is occured
        }

        catch(ArrayIndexOutOfBoundsException obj)  // specific Exception
        {
            System.out.println("Inside cath");
            System.out.println(obj);
        }

        catch(Exception obj)  // Generic Exception
        {
            System.out.println(obj);
         }

         finally
         {
             System.out.println("inside finally");
             sobj.close();
         }

         System.out.println("End of application");

        
    }    

}
