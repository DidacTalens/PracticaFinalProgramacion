import javax.swing.*;
import java.awt.*;

/**
 * @author Dídac Talens
 * @version 1.0
 */
public class PanelVacio extends JPanel {
    /**
     * panel vacio sobre el que se van superponiendo los paneles que elija el usuario
     */
    public PanelVacio(){
        setLayout(new GridLayout(3,2));
    }
}
