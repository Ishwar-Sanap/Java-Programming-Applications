import java.lang.*;

class Array1 {
 
    public static void main(String[] args)
    {
        // int Arr[5];  C/C++
        int iCnt =0;
        int Arr[] = new int[5]; // Java

        Arr[0] =10;
        Arr[1] =20;
        Arr[2] =30;
        Arr[3] =40;
        Arr[4] =50;

        System.out.println("Size of Array is :"+Arr.length); //5
        // length is the property for array in java

        System.out.println("HAsh code :"+Arr); //

        System.out.print("Elements in array : ");
        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
           System.out.print(" "+Arr[iCnt]);
        }


        iCnt =0;
        System.out.print(" \nElements in array : ");
        while(iCnt<Arr.length)
        {
            System.out.print(" "+Arr[iCnt]);
            iCnt++;
        }


        System.out.println("\nFor each loop");

        /* 
         For each loop goes  from  start to end only
            we can't modify the for each loop

        */ 
        for(int no :Arr)
        {
            System.out.println(no);
        }
    }
}
