import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class Hamburguesa extends JPanel {

    JButton button;
    PanelTexto panelTexto;

    /**
     * Configuración de la ventana cuando pulsamos en hamburguesas
     * @param panelTexto panel del que se recoge información y al que se le añade
     */
    public Hamburguesa(PanelTexto panelTexto){
        this.panelTexto=panelTexto;
        setLayout(new GridLayout(0,2));
        setPreferredSize(new Dimension(300,200));
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

    /**
     * Crea los botones de las botellas cuando pulsamos el botón de las hamburguesa
     * @param nombre nombre del botón a crear
     * @param precio precio del producto a crear
     */
    public void creacionBotones(String nombre, int precio){
        button=new JButton(nombre);
        button.setSize(30,20);

        button.setMargin(new Insets(0,0,0,0));
        add(button);
        button.addActionListener(e -> {
            panelTexto.anyadirContenido(" "+nombre+" : "+precio);
            panelTexto.sumarTotal(precio);
        });
    }

}
