import javax.swing.*;
import java.awt.*;

public class PanelTexto extends JPanel {

    JScrollPane scrollPane;
    JTextArea textArea;
    JButton cantidadTotal;
    public PanelTexto(){
        setLayout(new BorderLayout());
        textArea=new JTextArea();
        scrollPane=new JScrollPane(textArea);

        scrollPane.setSize(500,800);
        add(scrollPane, BorderLayout.CENTER);

        cantidadTotal=new JButton("0");
        cantidadTotal.setEnabled(false);

        add(cantidadTotal, BorderLayout.NORTH);
    }

    public void anyadirContenido(String texto){
        String salida=textArea.getText();
        salida+=texto+"\n";
        textArea.setText(salida);
    }

    public void sumarTotal(int numero){
        int total;
        int cantidad=Integer.parseInt(cantidadTotal.getText());
        total=cantidad+numero;
        cantidadTotal.setText(""+total);
    }
}


