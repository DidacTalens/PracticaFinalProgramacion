import javax.swing.*;
import java.awt.*;

public class PanelImprimir extends JPanel {
    JButton btn1;
    JButton btn2;
    public PanelImprimir(){
        setLayout(new FlowLayout());
        btn1=new JButton("Mostrar tíquet");
        btn2=new JButton("Numero de compras");


        add(btn1);
        add(btn2);
    }
}
