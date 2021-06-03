import javax.swing.*;
import java.awt.*;
import java.io.File;

public class PanelTipoProducto extends JPanel{
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setBounds(200,200,500,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        PanelTipoProducto product=new PanelTipoProducto();

        frame.add(product);
    }
    PanelVacio panelVacio=new PanelVacio();

    public PanelTipoProducto(){
        setLayout(new BorderLayout());
        JPanel losBotones=new JPanel();
        losBotones.setLayout(new GridLayout(0,1));
        /*CONFIG DEL JPANEL QUE CAMBIA ENTRE PRODUCTOS*/
        JButton boton=new JButton("");
        JButton boton2=new JButton("");
        JButton boton3=new JButton("");
        JButton boton4=new JButton("");

        ImageIcon hamborguesa=new ImageIcon("src/Imagenes/hamburguesa-edit.jpg");
        ImageIcon patatas=new ImageIcon("src/Imagenes/patatas-edit.jpg");
        ImageIcon bebidas=new ImageIcon("src/Imagenes/bebidas-edit.png");
        ImageIcon postreses=new ImageIcon("src/Imagenes/postres-edit.jpg");

        boton.setMargin(new Insets(0,0,0,0));
        boton2.setMargin(new Insets(0,0,0,0));
        boton3.setMargin(new Insets(0,0,0,0));
        boton4.setMargin(new Insets(0,0,0,0));

        boton.setIcon(new ImageIcon(hamborguesa.getImage()));
        boton2.setIcon(new ImageIcon(patatas.getImage()));
        boton3.setIcon(new ImageIcon(bebidas.getImage()));
        boton4.setIcon(new ImageIcon(postreses.getImage()));

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

        add(losBotones, BorderLayout.WEST);
        add(panelVacio, BorderLayout.CENTER);

    }
    public void nuevoPanel(JPanel panelActual){
        panelVacio.removeAll();
        panelVacio.add(panelActual);
        panelVacio.repaint();
        panelVacio.revalidate();
    }

}
