import javax.swing.*;
import java.awt.*;

public class PanelImprimir extends JPanel {
    PanelTexto texto=new PanelTexto();
    public PanelImprimir(){
        setLayout(new FlowLayout());
        JButton btn1=new JButton("Mostrar tíquet");
        JButton btn2=new JButton("Numero de compras");

        btn1.addActionListener(e -> {
            String contenido=texto.textArea.getText();
            texto.textArea.setText(contenido+"Añadiremos una linea si o q"+"\n");

        });
        add(btn1);
        add(btn2);
    }
}
