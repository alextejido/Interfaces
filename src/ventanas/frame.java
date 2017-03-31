/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author atejidosolla
 */
public class frame extends JFrame{
    
    public void frame(){
       JFrame fr=new JFrame();
       fr.setLayout(null);
       fr.setVisible(true);
        fr.setSize(800, 500);
        fr.setTitle("Prueba");
        fr.setLocationRelativeTo(null);
        JPanel pa1=new JPanel();
        JPanel pa2=new JPanel();
        fr.add(pa1);
        fr.add(pa2);
        pa1.setSize(800, 250);
        pa2.setSize(800, 250);
        pa1.setLocation(0, 0);
        pa2.setLocation(0,250);
        pa1.setBackground(Color.red);
        pa2.setBackground(Color.blue);
        pa1.setLayout(null);
        pa2.setLayout(null);
    }
    
}
