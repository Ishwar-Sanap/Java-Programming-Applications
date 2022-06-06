import java.lang.*;
import java.util.*;

class HashT 
{
    public static void main(String[] args) {
        
        //          key      value
        Hashtable <Integer,String>obj = new Hashtable<Integer,String>();

        //     key , Data 
        obj.put(11,"Amit");
        obj.put(21,"DON");
        obj.put(22,"Mayur");
        obj.put(30,"Sagar");
        obj.put(34,"Dinesh");

        System.out.println(obj.get(21));

        System.out.println("Data from hash table :");

        Enumeration  eobj = obj.keys();

        while(eobj.hasMoreElements())
        {
            System.out.println(obj.get(eobj.nextElement()));
            System.out.println(eobj.nextElement());
        }
    }
}
