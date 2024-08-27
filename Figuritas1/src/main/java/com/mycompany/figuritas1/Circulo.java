
package com.mycompany.figuritas1;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Circulo {
    private final int radio ;

    public Circulo (int radio ){
        this . radio = radio;

    }

    public void dibujar () {
        JFrame frame = new JFrame ("circulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel;
        panel = new JPanel(){
            @Override
            protected  void paintComponent(Graphics g) {
                super.paintComponent (g);
                g.setColor(Color.red);
                g.fillOval(150  - radio , 150 - radio , 2 * radio , 2 * radio);
            }

        };
        frame.add(panel);
        frame.setVisible(true);
    }

}