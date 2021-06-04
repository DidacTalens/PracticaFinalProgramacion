import javax.swing.*;
import java.awt.*;

public class PanelImprimir extends JPanel {
    JButton btn1;
    JButton btn2;
    PanelTexto panelTexto;
    public PanelImprimir(PanelTexto panelTexto){
        this.panelTexto=panelTexto;
        setLayout(new FlowLayout());
        btn1=new JButton("Imprimir tíquet");
        btn2=new JButton("Compras");

        btn1.addActionListener(e -> {
            String mostrar;
            mostrar=panelTexto.textArea.getText();
            panelTexto.textArea.setText("");
            panelTexto.cantidadTotal.setText("0");
            System.out.println(mostrar);
        });

        add(btn1);
        add(btn2);
    }
}
