import javax.swing.*;
import java.awt.*;

public class PanelVacio extends JPanel {
    public PanelVacio(){
        setLayout(new GridLayout(0,3));

        JLabel label=new JLabel("ME gustaria saber como funciona esta puta mierda");
        add(label);
    }
}
