/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principal;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author 
 */
public class Principal {

    public static void main(String[] args) {
        String[][] autmovil = new String[100][14];  // Un tamaño suficientemente grande para almacenar los datos
        int contador = 0;  // Índice para la matriz de empleados
        int nuevo; // si se desea una nueva repeticion
        do {
            String[] opciones = {"Automovil", "AUTOBUS", "MOTOCICLETA"};//
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione el vehiculo a matricular", " ",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0 -> {
                    // Datos de Automovil para mostrar
                   
                    String nombre = showInputDialog(null, "Ingrese El Nombre De La Marca Del Automovil :");
                    if (nombre == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String modelo = showInputDialog("Ingrese El Modelo Del Automovil (turismo,camioneta,etc ) :");
                    if (modelo == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String color = showInputDialog("Ingrese El color del Automovil :");
                    if (color == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String chasis = showInputDialog("Ingrese el modelo_del_chasis(#_De_Serie):");
                    if (chasis == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String motor = showInputDialog("Ingrese el tipo de motor del automovil");
                    if (motor == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String transmision = showInputDialog("ingrese el tipo de transmision del automovil");
                    if (transmision == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String combustible = showInputDialog("Ingrese el tipo de combustible del automovil");
                    if (combustible == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String anio = showInputDialog("Ingrese el año del automovil");
                    if (anio == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    int cant_de_puertas = Integer.parseInt(showInputDialog("Ingrese El numero_de_puertas:"));
                    int numero_de_asientos = Integer.parseInt(showInputDialog("Ingrese el numero_de_asientos"));

                    // Constructor de la clase Automovil para mostrar los datos
                    Automovil automovil = new Automovil(nombre, modelo, color, chasis, anio, motor, transmision, combustible,  cant_de_puertas,  numero_de_asientos);

                    // Guardar los datos en la matriz
                    autmovil[contador][0] = "Automovil";
                    autmovil[contador][1] = nombre;
                    autmovil[contador][2] = modelo;
                    autmovil[contador][3] = color;
                    autmovil[contador][4] = chasis;
                    autmovil[contador][5] = anio;
                    autmovil[contador][6] = motor;
                    autmovil[contador][7] = transmision;
                    autmovil[contador][8] = combustible;
                    autmovil[contador][9] = String.valueOf(cant_de_puertas);
                    autmovil[contador][10] = String.valueOf(numero_de_asientos);
                    autmovil[contador][11] = " ";
                    autmovil[contador][12] = " ";
                    autmovil[contador][13] = " ";
                    contador++;
                    break;
                }

                case 1 -> {
                    // Datos de Autobus para mostrar
                    String nombre = showInputDialog(null, "Ingrese El Nombre De La Marca Del Autobus :");
                    if (nombre == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String modelo = showInputDialog("Ingrese El Modelo Del Autobus :");
                    if (modelo == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String color = showInputDialog("Ingrese El color del Autobus :");
                    if (color == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String chasis = showInputDialog("Ingrese el modelo_del_chasis(#_De_Serie):");
                    if (chasis == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String motor = showInputDialog("Ingrese el tipo de motor del autobus");
                    if (motor == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String transmision = showInputDialog("ingrese el tipo de transmision del autobus");
                    if (transmision == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String combustible = showInputDialog("Ingrese el tipo de combustible del autobus");
                    if (combustible == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String anio = showInputDialog("Ingrese el año del autobus");
                    if (anio == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    int cantpasajeros = Integer.parseInt(showInputDialog("Ingrese la cantidad de pasajeros:"));
                    String tamaniobus = showInputDialog("Ingrese el tamaño del bus(Pequeño,Mediano,Grande):");
                    if (tamaniobus == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    int cant_de_puertas = Integer.parseInt(showInputDialog("Ingrese El numero_de_puertas:"));
                    int numero_de_asientos = Integer.parseInt(showInputDialog("Ingrese el numero_de_asientos"));

                    Autobus autobus = new Autobus(nombre, modelo, color, chasis, anio, motor,
                            transmision, combustible, cantpasajeros, tamaniobus, cant_de_puertas, numero_de_asientos);

                    // Guardar los datos en la matriz
                    autmovil[contador][0] = "Autobus";
                    autmovil[contador][1] = nombre;
                    autmovil[contador][2] = modelo;
                    autmovil[contador][3] = color;
                    autmovil[contador][4] = chasis;
                    autmovil[contador][5] = anio;
                    autmovil[contador][6] = motor;
                    autmovil[contador][7] = transmision;
                    autmovil[contador][8] = combustible;
                    autmovil[contador][9] = String.valueOf(cant_de_puertas);
                    autmovil[contador][10] = String.valueOf(numero_de_asientos);
                    autmovil[contador][11] = String.valueOf(cantpasajeros);
                    autmovil[contador][12] = String.valueOf(tamaniobus);
                    autmovil[contador][13] = " ";
                    contador++;
                    break;
                }

                case 2 -> {
                    String nombre = showInputDialog(null, "Ingrese El Nombre De La marca de la motocicleta :");
                    if (nombre == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String modelo = showInputDialog("Ingrese El Modelo De la motocicleta (homologado o de serie):");
                    if (modelo == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String color = showInputDialog("Ingrese El color de la motocicleta :");
                    if (color == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String chasis = showInputDialog("Ingrese el modelo_del_chasis (Numero_De_Serie) :");
                    if (chasis == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String motor = showInputDialog("Ingrese el tipo de motor de la motocicleta ");
                    if (motor == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String transmision = showInputDialog("ingrese el tipo de transmision de la motocicleta");
                    if (transmision == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String combustible = showInputDialog("Ingrese el tipo de combustible de la motocicleta");
                    if (combustible == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    //String modelomoto = showInputDialog("introduzca el modelo de la moto NAKED , CHOPPER, TURISMO");
                   // if (modelomoto == null) {
                      //  showInputDialog("cerrando el programa");
                   // }
                    String anio = showInputDialog("Ingrese el año de la motocicleta");
                    if(anio == null){
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String cantllanta = showInputDialog("Ingrese la cantidad de llantas de la motocicleta");
                    if(cantllanta == null){
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }

                    Motocicleta motocicleta = new Motocicleta(nombre, modelo, color, chasis,anio, motor, transmision, combustible, cantllanta);

                    // Guardar los datos en la matriz
                    autmovil[contador][0] = "Motocicleta";
                    autmovil[contador][1] = nombre;
                    autmovil[contador][2] = modelo;
                    autmovil[contador][3] = color;
                    autmovil[contador][4] = chasis;
                    autmovil[contador][5] =  anio;
                    autmovil[contador][6] = motor;
                    autmovil[contador][7] = transmision;
                    autmovil[contador][8] = combustible;
                    autmovil[contador][9] = " ";
                    autmovil[contador][10] = " ";
                    autmovil[contador][11] = " ";
                    autmovil[contador][12] = " ";
                    //autmovil[contador][9] = modelomoto;
                    autmovil[contador][13] = cantllanta;
                    contador++;
                    break;
                }
                default -> throw new IllegalStateException("Valor inesperado: " + opcion);
            }
            nuevo = JOptionPane.showConfirmDialog(null, "¿Desea realizar otro ingreso de auto ?", "Continuar",
                    JOptionPane.YES_NO_OPTION);
        }
        while (nuevo == JOptionPane.YES_OPTION);
        
        
         String[] columna = {"Tipo", "Marca", "Modelo", "Color", "Chasis", "Año", "Motor", "Transmisión", 
             "Combustible"," # Puertas"," Asientos","  Pasajeros", " Tamaño","# llantas"};
        DefaultTableModel Datos = new DefaultTableModel(autmovil, columna) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return true;  // Todas las celdas son editables
            }
        };

        JTable tabla = new JTable(Datos);
        tabla.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(tabla);
        JFrame frame = new JFrame("Registro de Vehículos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(900, 200);
        frame.setVisible(true);
        
        
 
    }
}
