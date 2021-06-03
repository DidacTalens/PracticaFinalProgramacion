import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class Hamburguesa extends JPanel {
    public Hamburguesa(){
        setLayout(new GridLayout(0,3));
        try {
            List<String> lineas= Files.readAllLines(Paths.get("productos.csv"));
            for (String s :lineas) {
                String[] campos=s.split(":");
                Producto producto=new Producto(campos[0],campos[1],Integer.parseInt(campos[2]));
                if (campos[0].equals("hamburguesa")){
                    creacionBotones(campos[1]);
                }
            }
        } catch (IOException e){
            System.out.println("El fichero no existe");
        }
        ActionListener insertar=new insertarNumero();
    }

    public void creacionBotones(String nombre){
        JButton button=new JButton(nombre);
        button.setSize(30,20);
        button.addActionListener(e -> {
            try {
                List<String> lineas= Files.readAllLines(Paths.get("productos.csv"));
                for (String s :lineas) {
                    String[] campos=s.split(":");
                    Producto producto=new Producto(campos[0],campos[1],Integer.parseInt(campos[2]));
                    if (campos[1].equals(button.getText())){
                        PanelTexto texto=new PanelTexto();
                        texto.sumarTotal(Integer.parseInt(campos[2]));
                        texto.anyadirContenido("Pulsaste Wacho");

                    }
                }
            } catch (IOException y){
                System.out.println("El fichero no existe");
            }
        });
        add(button);
    }
}
class insertarNumero implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        PanelTexto panelTexto=new PanelTexto();
        panelTexto.anyadirContenido("Te he escuchado al fin");
    }
}
