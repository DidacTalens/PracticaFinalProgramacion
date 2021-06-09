import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class Patatas extends JPanel {
    PanelTexto panelTexto;

    /**
     * Configuración de la ventana cuando pulsamos en las patatas
     * @param panelTexto panel del que se recoge información y al que se le añade
     */
    public Patatas(PanelTexto panelTexto){
        this.panelTexto=panelTexto;
        setLayout(new GridLayout(0,2));
        setPreferredSize(new Dimension(300,200));
        try {
            List<String> lineas= Files.readAllLines(Paths.get("productos.csv"));
            for (String s :lineas) {
                String[] campos=s.split(":");
                Producto producto=new Producto(campos[0],campos[1],Integer.parseInt(campos[2]));
                if (campos[0].equals("patatas")){
                    creacionBotones(campos[1], Integer.parseInt(campos[2]));
                }
            }
        } catch (IOException e){
            System.out.println("El fichero no existe");
        }
    }

    /**
     * Crea los botones de las botellas cuando pulsamos el botón de las patatas
     * @param nombre nombre del botón a crear
     * @param precio precio del producto a crear
     */
    public void creacionBotones(String nombre, int precio){
        JButton button=new JButton(nombre);
        button.setMinimumSize(new Dimension(20,20));
        button.setMaximumSize(new Dimension(150,60));
        add(button);
        button.addActionListener(e -> {
            panelTexto.anyadirContenido(" "+nombre+" : "+precio);
            panelTexto.sumarTotal(precio);
        });
    }
}