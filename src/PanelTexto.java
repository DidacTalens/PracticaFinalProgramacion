import javax.swing.*;
import java.awt.*;

/**
 * @author Dídac Talens
 * @version 1.0
 */
public class PanelTexto extends JPanel {

    JScrollPane scrollPane;
    JTextArea textArea;
    JButton cantidadTotal;

    /**
     * Panel del JTextArea donde aparecen los productos que se añaden al ticket
     */
    public PanelTexto(){
        setLayout(new BorderLayout());
        textArea=new JTextArea();
        scrollPane=new JScrollPane(textArea);

        textArea.setEditable(false);

        scrollPane.setSize(500,800);
        add(scrollPane, BorderLayout.CENTER);

        cantidadTotal=new JButton("0");
        cantidadTotal.setEnabled(false);

        add(cantidadTotal, BorderLayout.NORTH);
    }

    /**
     * Anyade contenido al JTextArea
     * @param texto texto a introducir en el JTextArea
     */
    public void anyadirContenido(String texto){
        String salida=textArea.getText();
        salida+=texto+"\n";
        textArea.setText(salida);
    }

    /**
     * Suma la cantidad correspondiente al cómputo global
     * @param numero cantidad a añadir al cómputo global
     */
    public void sumarTotal(int numero){
        int total;
        int cantidad=Integer.parseInt(cantidadTotal.getText());
        total=cantidad+numero;
        cantidadTotal.setText(""+total);
    }
}


