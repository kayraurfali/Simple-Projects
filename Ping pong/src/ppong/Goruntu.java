/* 
 * Copyright (c) 2018, Kayra Urfalı
 * 
 * 
 * 
 * 
 * 
 * 
 */
package ppong;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author kayra
 */
public class Goruntu extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Pong.pong.render((Graphics2D)g);
    }
    
}
