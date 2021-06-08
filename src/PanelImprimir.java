import Prueba.ImprimirString;

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
        btn2=new JButton("Generar tiquet");

        btn1.addActionListener(e -> {
            String mostrar;
            mostrar=panelTexto.textArea.getText();
            ImprimirString imprimir=new ImprimirString();
            imprimir.imprimirTicket(mostrar);
            panelTexto.textArea.setText("");
            panelTexto.cantidadTotal.setText("0");
            System.out.println(mostrar);
        });

        btn2.addActionListener(e -> {
            mostrarTiquet();
        });

        add(btn1);
        add(btn2);
    }

    /**
     *
     */
    private void mostrarTiquet() {
        String salida="<html><h1>TICKET:</h1>";
        salida+=panelTexto.textArea.getText();
        salida+="------------------------------------ \n";
        salida+="TOTAL: "+panelTexto.cantidadTotal.getText();

        JOptionPane.showMessageDialog(null,salida, "TICKET",JOptionPane.PLAIN_MESSAGE);
    }
}
