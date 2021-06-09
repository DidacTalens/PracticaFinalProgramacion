import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Dídac Talens
 * @version 1.0
 */
class Postres extends JPanel {
    PanelTexto panelTexto;

    /**
     * Configuración de la ventana cuando pulsamos en los postres
     * @param panelTexto panel del que se recoge información y al que se le añade
     */
    public Postres(PanelTexto panelTexto){
        this.panelTexto=panelTexto;
        setLayout(new GridLayout(0,2));
        setPreferredSize(new Dimension(300,200));
        try {
            List<String> lineas= Files.readAllLines(Paths.get("productos.csv"));
            for (String s :lineas) {
                String[] campos=s.split(":");
                try {
                    Producto producto = new Producto(campos[0], campos[1], Integer.parseInt(campos[2]));
                } catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"El precio de los productos está mal","ERROR", JOptionPane.WARNING_MESSAGE);
                }
                if (campos[0].equals("postre")){
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
        add(button);
        button.addActionListener(e -> {
            panelTexto.anyadirContenido(" "+nombre+" : "+precio);
            panelTexto.sumarTotal(precio);
        });
    }
}
