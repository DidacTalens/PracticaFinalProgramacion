import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class panelProductos {
    public void leerFichero(){
        try {
            List<String> lineas= Files.readAllLines(Paths.get("productos.csv"));
            for (String s :lineas) {
                String[] campos=s.split(":");
                Producto producto=new Producto(campos[0],campos[1],Integer.parseInt(campos[2]));
            }
        } catch (IOException e){
            System.out.println("El fichero no existe");
        }
    }


    public static void main(String[] args) {
        FrameProductos frameProductos=new FrameProductos();

    }
}

class FrameProductos extends JFrame{
    public FrameProductos(){
        Bebidas h=new Bebidas();
        /*CONFIG DEL FRAME*/
        Toolkit mipantalla=Toolkit.getDefaultToolkit();
        Dimension tamanyo=mipantalla.getScreenSize();

        int alturaPantalla=tamanyo.height;
        int anchoPantalla=tamanyo.width;

        setBounds(anchoPantalla/4,alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        setTitle("Ventana 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(h);
    }
}