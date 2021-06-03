import javax.swing.*;
import java.awt.*;

public class PanelImprimir extends JPanel {
    public PanelImprimir(){
        setLayout(new FlowLayout());
        JButton btn1=new JButton("Mostrar tíquet");
        JButton btn2=new JButton("Numero de compras");
        add(btn1);
        add(btn2);
    }
}
