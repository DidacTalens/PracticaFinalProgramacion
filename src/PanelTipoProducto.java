import javax.swing.*;
import java.awt.*;

public class PanelTipoProducto {
    public static void main(String[] args) {
        PanelTipoProducto ventana=new PanelTipoProducto();
    }
    public PanelTipoProducto(){
        JFrame frame=new JFrame();
        JPanel panelPrincipal=new JPanel();

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
        JButton boton3=new JButton("Bebidas");
        JButton boton4=new JButton("Postres");

        boton.addActionListener(e -> {
            Hamburguesa h=new Hamburguesa();
            frame.add(h,BorderLayout.CENTER);
            h.updateUI();
        });
        boton2.addActionListener(e -> {
            Patatas p=new Patatas();
            frame.add(p,BorderLayout.CENTER);
            p.updateUI();
        });
        boton3.addActionListener(e -> {
            Bebidas b=new Bebidas();
            frame.add(b, BorderLayout.CENTER);
            b.updateUI();
        });
        boton4.addActionListener(e -> {
            Postres postres=new Postres();
            frame.add(postres, BorderLayout.CENTER);
            postres.updateUI();
        });

        panelPrincipal.add(boton);
        panelPrincipal.add(boton2);
        panelPrincipal.add(boton3);
        panelPrincipal.add(boton4);
    }

}
