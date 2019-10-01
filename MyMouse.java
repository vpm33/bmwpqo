import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyMouse extends JFrame implements MouseListener
{
    JLabel l;
    MyMouse()
    {
        l=new JLabel();
        l.setBounds(20,50,100,20);
        add(l);
        addMouseListener(this); 
        setLayout(null);
        setSize(300,300);
        setVisible(true);   
    }
    public void mouseClicked(MouseEvent e)
    {
        l.setText("Mouse clicked");
    }
    public void mouseEntered(MouseEvent e)
    {
        l.setText("Mouse entered");
    }
    public void mouseExited(MouseEvent e)
    {
        l.setText("Mouse exited");
    }
    public void mousePressed(MouseEvent e)
    {
        l.setText("Mouse pressed");
    }
    public void mouseReleased(MouseEvent e) 
    {
        l.setText("Mouse released");
    }
    public static void main(String[] args)
    {
        MyMouse mm=new MyMouse();
    }
}
