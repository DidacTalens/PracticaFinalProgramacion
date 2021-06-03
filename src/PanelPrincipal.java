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
        JPanel panelIzq=new JPanel();
        PanelVacio vacio=new PanelVacio();
        PanelTipoProducto tipoProducto=new PanelTipoProducto();
        panelIzq.setLayout(new BorderLayout());

        panelIzq.add(tipoProducto, BorderLayout.WEST);
        panelIzq.add(vacio, BorderLayout.CENTER);
        panelGeneral.add(panelIzq, BorderLayout.WEST);

        /*PANEL DERECHO*/
        JPanel panelDer=new JPanel();
        panelDer.setLayout(new BorderLayout());
        PanelTexto texto=new PanelTexto();
        PanelImprimir imprimir=new PanelImprimir();

        texto.add(imprimir,BorderLayout.SOUTH);
        panelGeneral.add(texto, BorderLayout.CENTER);

    }
}
