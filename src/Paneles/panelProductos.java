package Paneles;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class panelProductos {
    private final JPanel panel= new JPanel();
    private final JFrame frame= new JFrame();
    private JButton boton=new JButton();
    private Icon icon=new ImageIcon();
    private String ruta="C:/home/dam/Escritorio/TrabajoFinal/Imagenes/";
    private ImageIcon imagen;
    public int x=30;
    public int y=30;

    public panelProductos() {
        /*Damos formato al JFRAME*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);

        /*Creamos los diferentes botones*/
        JButton boton=new JButton("Producto1");
        JButton boton2=new JButton("Producto2");
        JButton boton3=new JButton("Producto3");
        JButton boton4=new JButton("Producto4");

        /*Añadimos los botones*/
        creacionBotones(5);

        frame.add(panel);

        frame.setVisible(true);
    }

    public void creacionBotones(int cantidad){
        List<JButton> botones=new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            boton=new JButton();
            boton.setBounds(x,y,100,100);
            x+=100;
            icon=new ImageIcon("src/Imagenes/pan"+i+".png");
            boton.setIcon(icon);
            panel.add(this.boton);
            botones.add(boton);
        }
    }


    public static void main(String[] args) {
        panelProductos p= new panelProductos();
    }
}
