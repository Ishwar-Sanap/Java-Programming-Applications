import java.lang.*;
import java.awt.*;
import java.awt.event.*;


class  Marvellousframe
{
    public Frame fobj;   // creating reference of Frame class

    public Marvellousframe(String name)
    {
        fobj = new Frame(name);
        fobj.setSize(600,600);
        fobj.setVisible(true);  // frme create zaleli disnyasthi 

        fobj.addWindowListener(new MarvellousListener());
    }
}
class MarvellousListener  extends WindowAdapter  //implements WindowListener
{
     public void windowClosing(WindowEvent obj)
     { 
        
        System.exit(0);
     }
}
public class FrameDemo4
{
    public static void main(String arg[])
    {
        System.out.println("Print data on console");

        Marvellousframe mobj = new Marvellousframe("PPA");
    }
}
