import java.lang.*;
import java.util.*;
// all collection is in the package util

class AL
{
    public static void main(String arg[])
    {
        ArrayList <String> obj = new ArrayList<String>();

        // Array list index starts from 0 
        obj.add("January");
        obj.add("February");
        obj.add(2,"New");
        obj.add("March");
        obj.add("April");
        obj.add("May");
        obj.add("Marvellous");
        obj.add("Marvellous");
        obj.add("Marvellous");
        obj.add("Marvellous");
       
        System.out.println("Array list contains : "+obj);
        System.out.println("Size is : "+obj.size()); // give the length of array lis

        int i =0;
        System.out.println("Elements are using for loop :");
        for(i=0; i<obj.size() ; i++)
        {
            System.out.println(obj.get(i));
        }

        String str;
        int iCnt=0;
        for(i=0; i<obj.size();i++)
        {
            str = obj.get(i);
            if(str.equals("Marvellous"))
                iCnt++;

        }
        System.out.println("Marvellous occurs at : "+iCnt+" times ");

        if(obj.contains("May"))
            System.out.println("Element is there ");

        int iret = obj.indexOf("April");
        System.out.println("Elememt is at index :"+iret);

        System.out.println("Element at index 3 is :"+obj.get(3));

        obj.remove(2);
        System.out.println("updated list is :"+obj);

        obj.remove("April");
        System.out.println("updated list is :"+obj);


        Collections.sort(obj);
        System.out.println("updated list in asending :"+obj);

        Collections.sort(obj,Collections.reverseOrder());
        System.out.println("updated list in Desending :"+obj);
        obj.clear();
        
        System.out.println("updated list is :"+obj);
    }
}
