package Paneles;

import javax.swing.*;
import java.awt.*;

public class TipoProducto {
    public static void main(String[] args) {
        TipoProducto ventana=new TipoProducto();
    }
    public TipoProducto(){
        JFrame frame=new JFrame();
        JPanel panelPrincipal=new JPanel();
        JPanel prueba=new JPanel();
        JPanel prueba2=new JPanel();

        /*CONFIG DEL FRAME*/
        Toolkit mipantalla=Toolkit.getDefaultToolkit();
        Dimension tamanyo=mipantalla.getScreenSize();

        int alturaPantalla=tamanyo.height;
        int anchoPantalla=tamanyo.width;

        frame.setBounds(anchoPantalla/4,alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        frame.setTitle("Ventana 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.add(panelPrincipal, BorderLayout.WEST);

        /*CONFIG DEL JPANEL QUE CAMBIA ENTRE PRODUCTOS*/
        panelPrincipal.setLayout(new GridLayout(4,1));
        JButton boton=new JButton("Hamburguesa");
        JButton boton2=new JButton("Patatas");

        JButton btn=new JButton("Ejemplo");
        JButton btn2=new JButton("Ejemplo2");
        prueba.add(btn);
        prueba2.add(btn2);

        boton.addActionListener(e -> {
            btn.setBackground(Color.ORANGE);
            frame.add(prueba, BorderLayout.CENTER);
            prueba.updateUI();
        });
        boton2.addActionListener(e -> {
            btn2.setBackground(Color.GREEN);
            frame.add(prueba2, BorderLayout.CENTER);
            prueba2.updateUI();
        });

        panelPrincipal.add(boton);
        panelPrincipal.add(boton2);


    }

}
