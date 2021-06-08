import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class Bebidas extends JPanel {
    PanelTexto panelTexto;
    public Bebidas(PanelTexto panelTexto){
        this.panelTexto=panelTexto;
        setLayout(new GridLayout(0,2));
        setPreferredSize(new Dimension(300,200));
        try {
            List<String> lineas= Files.readAllLines(Paths.get("productos.csv"));
            for (String s :lineas) {
                String[] campos=s.split(":");
                Producto producto=new Producto(campos[0],campos[1],Integer.parseInt(campos[2]));
                if (campos[0].equals("bebida")){
                    creacionBotones(campos[1], Integer.parseInt(campos[2]));
                }
            }
        } catch (IOException e){
            System.out.println("El fichero no existe");
        }
    }

    public void creacionBotones(String nombre, int precio){
        JButton button=new JButton(nombre);
        add(button);
        button.addActionListener(e -> {
            panelTexto.anyadirContenido(" "+nombre+" : "+precio);
            panelTexto.sumarTotal(precio);
        });
    }
}