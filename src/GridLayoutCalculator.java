import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayoutCalculator extends JFrame {
    private JPanel mainPanel;
    private JTextField input01;
    private JTextField input02;
    private JButton equal1;
    private JLabel ans01;
    private JTextField input03;
    private JTextField input04;
    private JButton equal2;
    private JLabel ans02;
    private JTextField input05;
    private JTextField input06;
    private JButton equal3;
    private JLabel ans03;
    private JTextField input07;
    private JTextField input08;
    private JButton equal4;
    private JLabel ans04;

    public GridLayoutCalculator(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        equal1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double sum = Double.parseDouble(input01.getText()) + Double.parseDouble(input02.getText());
                ans01.setText(String.valueOf(sum));
            }
        });
        equal2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double sub = Double.parseDouble(input03.getText()) - Double.parseDouble(input04.getText());
                ans02.setText(String.valueOf(sub));
            }
        });
        equal3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double mul = Double.parseDouble(input05.getText()) * Double.parseDouble(input06.getText());
                ans03.setText(String.valueOf(mul));
            }
        });
        equal4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double div = Double.parseDouble(input07.getText()) / Double.parseDouble(input08.getText());
                ans04.setText(String.valueOf(div));
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new GridLayoutCalculator("Basic Calculator");
        frame.setVisible(true);

    }
}
