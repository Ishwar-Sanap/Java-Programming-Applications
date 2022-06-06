import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class Demo
{   // Backend class 
    // Logic 
    public String datade()
    {
        return " Jay Ganesh .. ";
    }
}

class  Marvellousframe extends WindowAdapter implements ActionListener
{
    public Frame fobj;   // creating reference of Frame class
    public Button bobj;
    public TextField tobj;

    public Marvellousframe(String name)
    {
        fobj = new Frame(name);
        bobj = new Button("Marvellous");
        tobj = new TextField();

        tobj.setBounds(60,60,170,20);
        bobj.setBounds(110,130,100,40);

        fobj.add(bobj);
        fobj.add(tobj);

        fobj.setSize(600,600);
        fobj.setVisible(true);  // frme create zaleli disnyasthi 
        fobj.setLayout(null);

        bobj.addActionListener(this);
        fobj.addWindowListener(this);

    }

    public void windowClosing(WindowEvent obj)
     { 
        
        System.exit(0);
     }

     public void actionPerformed(ActionEvent obj)
     {
       // tobj.setText("Jay Ganesh ..");

        Demo dobj = new Demo();
        String str = dobj.datade();
        tobj.setText(str);

     }
}

public class FrameDemo5
{
    public static void main(String arg[])
    {
        System.out.println("Print data on console");

        Marvellousframe mobj = new Marvellousframe("PPA");
    }
}
