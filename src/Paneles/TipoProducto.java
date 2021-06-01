package Paneles;

import javax.swing.*;
import java.awt.*;

public class TipoProducto {
    public static void main(String[] args) {
        FrameTipoProducto frame=new FrameTipoProducto();
    }
}

class FrameTipoProducto extends JFrame {
    public FrameTipoProducto(){
        Toolkit tk= Toolkit.getDefaultToolkit();

        int altura=tk.getScreenSize().width;
        int anchura=tk.getScreenSize().height;

        setBounds(altura/4,anchura/4,200,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class PanelTipoProducto extends JPanel{
    public PanelTipoProducto(){

    }
}