import java.util.*;


class Array2 
{
    public static void main(String[] args) {
        
        int iCnt =0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number of elements in Array :");
        int size = sobj.nextInt();

        int Arr[]= new int[size];

        for(iCnt =0; iCnt<Arr.length; iCnt++)
        {
        
            System.out.print("Enter "+(iCnt+1)+" Element :");
           Arr[iCnt] = sobj.nextInt();
        }


        System.out.print("Elememts in Array : ");
        for(iCnt =0; iCnt<Arr.length;iCnt++)
        {
            System.out.print( " "+Arr[iCnt]);

    
        }
    }   
}
