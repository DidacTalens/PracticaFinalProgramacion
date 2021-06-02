import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class Postres extends JPanel {
    public Postres(){
        setLayout(new GridLayout(3,2));
        try {
            List<String> lineas= Files.readAllLines(Paths.get("productos.csv"));
            for (String s :lineas) {
                String[] campos=s.split(":");
                Producto producto=new Producto(campos[0],campos[1],Integer.parseInt(campos[2]));
                if (campos[0].equals("postre")){
                    creacionBotones(campos[1]);
                }
            }
        } catch (IOException e){
            System.out.println("El fichero no existe");
        }
    }

    public void creacionBotones(String nombre){
        JButton button=new JButton(nombre);
        add(button);
    }
}
