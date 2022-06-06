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
class MarvellousListener implements WindowListener
{
     public void windowDeactivated(WindowEvent obj){}
     public void windowActivated(WindowEvent obj){}
     public void windowDeiconified(WindowEvent obj){}
     public void windowIconified(WindowEvent obj){}
     public void windowClosed(WindowEvent obj){}
     public void windowClosing(WindowEvent obj)
     {
         System.exit(0);
     }
     public void windowOpened(WindowEvent obj){}
}
public class FrameDemo3
{
    public static void main(String arg[])
    {
        System.out.println("Print data on console");

        Marvellousframe mobj = new Marvellousframe("PPA");
    }
}
