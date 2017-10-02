import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Race extends JFrame implements ActionListener {

    public Thread t;
    private int lengte = 250;
    private Paard h1, h2, h3, h4, h5;
    private JButton button;
    private JPanel panel;
    ImageIcon icon = new ImageIcon("C:\\Users\\ajare\\Dropbox\\school\\Informatica\\week 3\\Afvinkopdracht3\\src\\Naamloos.gif");

    public static void main(String[] args){
        Race frame = new Race();
        frame.setSize(400,600);
        frame.createGUI();
        frame.setVisible(true);

    }


    private void startRace(Graphics g){
        panel.setBackground(Color.white);
        g.setColor(Color.red);
        g.fillRect(lengte, 0, 3, 500);

        h1 = new Paard("Frank",Color.BLUE);
        h2 = new Paard("Herman",Color.RED);
        h3 = new Paard("Martha",Color.green);
        h4 = new Paard("Patricia",Color.pink);
        h5 = new Paard("Simon", Color.orange);

        h1.setAantal0();

        /** Loop tot een paard over de finish is*/
        while (h1.getAfstand() < lengte
                && h2.getAfstand() < lengte
                && h3.getAfstand() < lengte
                && h4.getAfstand() < lengte
                && h5.getAfstand() < lengte) {

            g.setColor(Color.white);
            g.fillRect(0,0,300,500);
            g.setColor(Color.red);
            g.fillRect(lengte, 0, 3, 500);

            h1.run();
            h2.run();
            h3.run();
            h4.run();
            h5.run();


            /* (8) Voeg hier code in om 4 paarden te tekenen die rennen
             * Dus een call van de methode tekenPaard
             */
            tekenPaard(g,h1);
            tekenPaard(g,h2);
            tekenPaard(g,h3);
            tekenPaard(g,h4);
            tekenPaard(g,h5);

            /* (7) Voeg hier een aanroep van de methode pauzeer toe zodanig
             * dat er 1 seconde pauze is. De methode pauzeer is onderdeel
             * van deze class
             */
            pauzeer(100);

        }
        /** Kijk welk paard gewonnen heeft
         */
        if (h1.getAfstand() > lengte) {
            JOptionPane.showMessageDialog(null, h1.getNaam() + " gewonnen!");
        }
        if (h2.getAfstand() > lengte) {
            JOptionPane.showMessageDialog(null, h2.getNaam() + " gewonnen!");
        }
        if (h3.getAfstand() > lengte) {
            JOptionPane.showMessageDialog(null, h3.getNaam() + " gewonnen!");
        }
        if (h4.getAfstand() > lengte) {
            JOptionPane.showMessageDialog(null, h4.getNaam() + " gewonnen!");
        }
        if (h5.getAfstand() > lengte) {
            JOptionPane.showMessageDialog(null, h5.getNaam() + " gewonnen!");
        }
    }


    /** Creatie van de GUI*/
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 500));
        panel.setBackground(Color.white);
        window.add(panel);
        /* (9) Zet hier de tekst Run! op de button */
        button = new JButton("Run!");
        window.add(button);
        button.addActionListener(this);
    }

    /** Teken het paard */
    private void tekenPaard(Graphics g, Paard h){
        g.setColor(h.getKleur());
        g.fillRect(10, 75 * h.getPaardNummer(), h.getAfstand(), 5);
        icon.paintIcon(this,g,h.getAfstand()-37,h.getPaardNummer()*75);

    }

    /** Actie indien de button geklikt is*/
    public void actionPerformed(ActionEvent event){
        Graphics paper = panel.getGraphics();
        /* (10) Roep hier de methode startrace aan met de juiste parameterisering */
        startRace(paper);


    }

    /** Pauzeer gedurende x millisecondes*/
    public void pauzeer(int msec) {
        try {
            Thread.sleep(msec);
        } catch (InterruptedException e) {
            System.out.println("Pauze interruptie");
        }
    }
    
    
}

