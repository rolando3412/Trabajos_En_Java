
package com.mycompany.figuritas1;

import javax.swing.JOptionPane;

public class Figuritas1 {

     public static void main(String[] args) {

        String[] opciones = {"Rectangulo", "Circulo", "Triangulo"};
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione la forma geométrica", "Menú",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        switch (opcion) {

            case 0 -> {
                int largo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el largo del rectángulo"));
                int alto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el alto del rectángulo"));
                Rectangulo rectangulo = new Rectangulo(largo, alto);
                rectangulo.dibujar();
            }

            case 1 -> {
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio del círculo"));
                Circulo circulo = new Circulo(radio);
                circulo.dibujar();
            }

            case 2 -> {
                String tipo = JOptionPane.showInputDialog("Ingrese el tipo del triángulo: equilátero, isósceles, escaleno");
                Triangulo triangulo = new Triangulo(tipo);
                triangulo.dibujar();
            }

            default -> JOptionPane.showMessageDialog(null, "Opción no válida");
        }
    }
}

