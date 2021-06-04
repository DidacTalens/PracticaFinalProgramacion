import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class Hamburguesa extends JPanel {

    JButton button;
    PanelTexto panelTexto;

    public Hamburguesa(PanelTexto panelTexto){
        this.panelTexto=panelTexto;
        setLayout(new GridLayout(0,2));
        try {
            List<String> lineas= Files.readAllLines(Paths.get("productos.csv"));
            for (String s :lineas) {
                String[] campos=s.split(":");
                Producto producto=new Producto(campos[0],campos[1],Integer.parseInt(campos[2]));
                if (campos[0].equals("hamburguesa")){
                    creacionBotones(campos[1],Integer.parseInt(campos[2]));
                }
            }
        } catch (IOException e){
            System.out.println("El fichero no existe");
        }
    }
    public void creacionBotones(String nombre, int precio){
        button=new JButton(nombre);
        button.setSize(30,20);

        ImageIcon hamborguesa=new ImageIcon("src/Imagenes/hamburguesa-edit.jpg");
        button.setIcon(new ImageIcon(hamborguesa.getImage()));
        button.setMargin(new Insets(0,0,0,0));
        add(button);
        button.addActionListener(e -> {
            panelTexto.anyadirContenido(nombre+" : "+precio);
            panelTexto.sumarTotal(precio);
        });
    }

}
