import javax.swing.*;
import java.awt.*;

/**
 * @author Dídac Talens
 * @version 1.0
 */
public class ImprimirString {
    /**
     * Muestra una ventana que permite imprimir el ticket
     * @param s El String que se le pasa para imprimirlo
     */
    static void imprimirTicket(String s){
        JTextPane jtp = new JTextPane();
        jtp.setBackground(Color.white);
        jtp.setFont(new Font("Courier New",Font.BOLD,16));
        jtp.setText(s);
        boolean show = true;
        try {
            jtp.print(null, null, show, null, null, show);
        } catch (java.awt.print.PrinterException ex) {
            ex.printStackTrace();
        }
    }

}
