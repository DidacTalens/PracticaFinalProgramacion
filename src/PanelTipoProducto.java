import javax.swing.*;
import java.awt.*;

/**
 * @author Dídac Talens
 * @version 1.0
 */
public class PanelTipoProducto extends JPanel{
    PanelVacio panelVacio=new PanelVacio();
    PanelTexto panelTexto;

    /**
     * Panel de texto donde elegimos entre los diferentes tipos de productos
     * @param panelTexto panel sobre el que se aplican los cambios de texto
     */
    public PanelTipoProducto(PanelTexto panelTexto){
        this.panelTexto=panelTexto;
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
            Hamburguesa h=new Hamburguesa(panelTexto);

            nuevoPanel(h);
        });
        boton2.addActionListener(e -> {
            Patatas p=new Patatas(panelTexto);

            nuevoPanel(p);
        });
        boton3.addActionListener(e -> {
            Bebidas b=new Bebidas(panelTexto);

            nuevoPanel(b);
        });
        boton4.addActionListener(e -> {
            Postres postres=new Postres(panelTexto);

            nuevoPanel(postres);
        });

        losBotones.add(boton);
        losBotones.add(boton2);
        losBotones.add(boton3);
        losBotones.add(boton4);





        add(losBotones, BorderLayout.WEST);
        add(panelVacio, BorderLayout.CENTER);

    }

    /**
     * Cambia entre los diferentes paneles que se crean
     * @param panelActual panel en el que queremos implementar
     */
    public void nuevoPanel(JPanel panelActual){
        panelVacio.removeAll();
        panelVacio.add(panelActual);
        panelVacio.repaint();
        panelVacio.revalidate();
    }

}
