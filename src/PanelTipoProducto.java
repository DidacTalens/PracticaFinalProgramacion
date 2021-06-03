import javax.swing.*;
import java.awt.*;

public class PanelTipoProducto extends JPanel{
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setBounds(200,200,500,400);

        PanelTipoProducto product=new PanelTipoProducto();

        frame.add(product);
    }
    PanelVacio panelVacio=new PanelVacio();

    public PanelTipoProducto(){
        setLayout(new BorderLayout());
        JPanel losBotones=new JPanel();
        losBotones.setLayout(new GridLayout(0,1));
        /*CONFIG DEL JPANEL QUE CAMBIA ENTRE PRODUCTOS*/
        JButton boton=new JButton("Hamburguesa");
        JButton boton2=new JButton("Patatas");
        JButton boton3=new JButton("Bebidas");
        JButton boton4=new JButton("Postres");

        boton.addActionListener(e -> {
            Hamburguesa h=new Hamburguesa();

            nuevoPanel(h);
        });
        boton2.addActionListener(e -> {
            Patatas p=new Patatas();

            nuevoPanel(p);
        });
        boton3.addActionListener(e -> {
            Bebidas b=new Bebidas();

            nuevoPanel(b);
        });
        boton4.addActionListener(e -> {
            Postres postres=new Postres();

            nuevoPanel(postres);
        });

        losBotones.add(boton);
        losBotones.add(boton2);
        losBotones.add(boton3);
        losBotones.add(boton4);

        add(losBotones,BorderLayout.WEST);
        add(panelVacio, BorderLayout.CENTER);

    }
    public void nuevoPanel(JPanel panelActual){
        panelVacio.removeAll();
        panelVacio.add(panelActual);
        panelVacio.repaint();
        panelVacio.revalidate();
    }

}
