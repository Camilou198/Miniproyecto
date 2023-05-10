package geekOutMaster;

import javax.swing.*;
import java.awt.*;
/**
 * Clase Header
 * @autor David Camilo Ordoñez - david.camilo.ordonez@correounivalle.edu.co -2226057
 * @autor Esteban Camilo Martinez Urbano - esteban.urbano@correounivalle.edu.co - 202224043
 * @autor Diana Marcela Sarmiento - diana.sarmiento@correounivalle.edu.co - 2222811
 */

public class Header extends JLabel {
    /**
     * Constructor of the Header class
     */
    public Header(String title, Color colorBackground){
        this.setText(title);
        this.setBackground(colorBackground);
        this.setForeground(new Color(255,255,255));
        this.setFont(new Font(Font.DIALOG,Font.BOLD,20));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setOpaque(true);
    }
}
