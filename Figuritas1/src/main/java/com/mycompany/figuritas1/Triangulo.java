/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuritas1;



import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class Triangulo {
    private String tipo ;

    public Triangulo (String tipo ){
        this.tipo=tipo;
    }
    public void dibujar (){
        JFrame frame = new JFrame("triangulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        JPanel panel ;
        panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                int [] xPoints;
                int [] yPoints;

                switch (tipo.toLowerCase()){
                    case "equilatero" -> {
                        xPoints = new int []{200 , 100 , 300};
                        yPoints = new int []{100, 300, 300};
                        g.setColor(Color.red);
                        g.fillPolygon(xPoints, yPoints, 3);
                    }

                    case "isosceles" -> {
                        xPoints = new int []{100 , 50 , 350};
                        yPoints = new int []{100, 300, 300};
                        g.setColor(Color.BLUE);
                        g.fillPolygon(xPoints, yPoints, 3);
                    }
                    case "escaleno " -> {
                        xPoints = new int []{10 , 150 , 350};
                        yPoints = new int []{200, 400, 250};
                        g.setColor(Color.GREEN);
                        g.fillPolygon(xPoints, yPoints, 3);
                    }

                    default -> JOptionPane.showMessageDialog(null, "tipo de triangulo no valido");


                }

            }
        };
        frame.add(panel);
            frame.setVisible(true); // se agrega para que se muestre la ventana
    }

}
