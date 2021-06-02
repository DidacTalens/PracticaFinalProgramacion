import javax.swing.*;
import java.awt.*;

public class PanelTexto extends JPanel {
    public PanelTexto(){
        JTextArea texto=new JTextArea(0,1);
        setLayout(new GridLayout(0,1));
        texto.setAlignmentX(CENTER_ALIGNMENT);
        add(texto);
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        PanelTexto texto=new PanelTexto();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(100,100,600,600);
        frame.add(texto);
    }
}
