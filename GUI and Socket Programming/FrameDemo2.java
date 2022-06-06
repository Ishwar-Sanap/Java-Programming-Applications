import java.lang.*;
import java.awt.*;

class  Marvellousframe
{
    public Frame fobj;   // creating reference of Frame class

    public Marvellousframe(String name)
    {
        fobj = new Frame(name);
        fobj.setSize(600,600);
        fobj.setVisible(true);  // frme create zaleli disnyasthi 
    }
}
public class FrameDemo2
{
    public static void main(String arg[])
    {
        System.out.println("Print data on console");

        Marvellousframe mobj = new Marvellousframe("PPA");
    }
}
