import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelTexto extends JPanel {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        PanelTexto texto=new PanelTexto();
        frame.setVisible(true);
        frame.setBounds(400,400,700,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(texto);
        texto.anyadirContenido("Te he escuchado porque si");
        texto.anyadirContenido("Te parece si sigo pasando de tu cara?");
        texto.sumarTotal(12);
        texto.sumarTotal(2);
        texto.sumarTotal(1);
    }

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
        int total=0;
        int cantidad=Integer.parseInt(cantidadTotal.getText());
        total=cantidad+numero;
        cantidadTotal.setText(""+total);
    }
}


