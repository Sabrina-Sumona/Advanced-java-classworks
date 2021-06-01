import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayout_LettersWords extends JFrame implements ActionListener{
    CardLayout card;
    JButton b1,b2,b3,b4;
    Container c;

    CardLayout_LettersWords(){

        c=getContentPane();
        card=new CardLayout(40,30);
//create CardLayout object with 40 hor space and 30 ver space  
        c.setLayout(card);

        b1=new JButton("A for Apple");
        b2=new JButton("B for Ball");
        b3=new JButton("C for Cat");
        b4=new JButton("D for Dog");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        c.add("a",b1);c.add("b",b2);c.add("c",b3);c.add("d",b4);

    }
    public void actionPerformed(ActionEvent e) {
        card.next(c);
    }

    public static void main(String[] args) {
        CardLayout_LettersWords cl=new CardLayout_LettersWords();
        cl.setSize(400,400);
        cl.setVisible(true);
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}  