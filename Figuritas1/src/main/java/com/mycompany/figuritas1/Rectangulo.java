package com.mycompany.figuritas1;

import java.awt.*;
import javax.swing.JFrame;
import  javax.swing.JPanel;

public class Rectangulo {
    private final int largo ;
    private final int alto ;

    public Rectangulo (int largo , int alto ){

        this . largo = largo ;
        this . alto = alto  ;

    }
    public void dibujar (){
        JFrame frame = new JFrame("rectangulo ") ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);


        JPanel panel;
        panel = new JPanel() {

            @Override
            protected void paintComponent(Graphics g ){
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.fillRect(50, 50, largo , alto);
            }

            // y que pasa aqui

        };
        frame.add(panel);
        frame.setVisible(true);
    };

};

