import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame implements ActionListener{

    private JButton button;
    private JPanel panel;
    Icon icon = new ImageIcon("C:\\Users\\ajare\\Dropbox\\school\\Informatica\\week 3\\Afvinkopdracht3\\src\\asd.gif");

    public static void main(String[] args) {

        Test frame = new Test();
        frame.setSize(400,300);
        frame.createGUI();
        frame.setVisible(true);

        double x=7.6;
        System.out.println((int) x);
    }

    private void createGUI(){

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,200));
        panel.setBackground(Color.white);
        window.add(panel);

        button = new JButton("Click me!");
        window.add(button);
        button.addActionListener(this);

    }

    public void actionPerformed(ActionEvent event){

        Graphics paper = panel.getGraphics();

        icon.paintIcon(this,paper,37,75);


    }
}