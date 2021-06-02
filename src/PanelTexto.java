import javax.swing.*;
import java.awt.*;

public class PanelTexto extends JPanel {
    public PanelTexto(){
        JTextArea texto=new JTextArea(0,1);
        setLayout(new GridLayout(0,1));
        setSize(new Dimension(300,100));
        texto.setMinimumSize(new Dimension(300,100));
        texto.setMaximumSize(new Dimension(500,200));

        texto.setBounds(10,10,300,200);
        texto.setAlignmentX(CENTER_ALIGNMENT);
        add(texto);
    }
}
