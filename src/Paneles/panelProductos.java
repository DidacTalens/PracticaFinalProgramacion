package Paneles;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class panelProductos {
    private final JPanel panel= new JPanel();
    private final JFrame frame= new JFrame();
    private JButton boton=new JButton();

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
        panel.add(boton);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);

        frame.add(panel);

        frame.setVisible(true);
    }

    public void creacionBotones(int cantidad){
        List<JButton> botones=new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            boton=new JButton();
            panel.add(this.boton);
        }
    }


    public static void main(String[] args) {

    }
}
