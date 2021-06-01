import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayout_CelToFerGUI extends JFrame {
    private JPanel mainPanel;
    private JTextField CInput;
    private JLabel CLevel;
    private JButton convertButton;
    private JLabel FOutput;
    private JLabel FLevel;

    public FlowLayout_CelToFerGUI(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                Parse degrees Celsius as a double and convert to Fahrenheit.
                Double F = Double.parseDouble(CInput.getText()) * 1.8 + 32;
                FOutput.setText(F + " F");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new FlowLayout_CelToFerGUI("Celsius to Fahrenheit Converter");
        frame.setVisible(true);

    }
}
