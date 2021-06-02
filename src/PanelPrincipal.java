import javax.swing.*;
import java.awt.*;

public class PanelPrincipal {
    public static void main(String[] args) {
        PanelPrincipal principal=new PanelPrincipal();

    }

    public PanelPrincipal(){
        JFrame frame=new JFrame();

        /*CONFIG DEL FRAME*/
        Toolkit mipantalla=Toolkit.getDefaultToolkit();
        Dimension tamanyo=mipantalla.getScreenSize();

        int alturaPantalla=tamanyo.height;
        int anchoPantalla=tamanyo.width;

        frame.setBounds(anchoPantalla/4,alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        frame.setTitle("Ventana 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        /*AÑADIENDO LOS PANELES*/
        JPanel panelGeneral=new JPanel();
        panelGeneral.setLayout(new BorderLayout());
        frame.add(panelGeneral);

        /*PANEL IZQUIERDO*/
        PanelVacio vacio=new PanelVacio();
        PanelTipoProducto tipoProducto=new PanelTipoProducto();

        panelGeneral.add(tipoProducto, BorderLayout.WEST);
        panelGeneral.add(vacio, BorderLayout.CENTER);

        /*PANEL DERECHO*/
        JPanel panelIzquierdo=new JPanel();
        panelIzquierdo.setLayout(new BorderLayout());

        PanelTexto texto=new PanelTexto();
        panelIzquierdo.add(texto);

        panelGeneral.add(panelIzquierdo, BorderLayout.EAST);


    }
}
