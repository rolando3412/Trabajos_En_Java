/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrodeautos;

import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import static javax.swing.JOptionPane.showInputDialog;
public class RegistrodeAutos {

    public static void main(String[] args) {
        
         String[][] autmovil = new String[100][10];  // Un tamaño suficientemente grande para almacenar los datos
        int contador = 0;  // Índice para la matriz de empleados
        int nuevo; // si se desea una nueva repeticion
        do {
            String[] opciones = {"AUTOMOVIL", "AUTOBUS", "MOTOCICLETA"};
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
                    String modelo = showInputDialog("Ingrese El Modelo Del Automovil :");
                    if (modelo == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String color = showInputDialog("Ingrese El color del Automovil :");
                    if (color == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String chasis = showInputDialog("Ingrese el modelo_del_chasis:");
                    if (chasis == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String motor = showInputDialog("Ingrese el motor el tipo de motor del automovil");
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
                    Automovil automovil = new Automovil(nombre, modelo, color, chasis, anio, motor, transmision, combustible, cant_de_puertas, numero_de_asientos);

                    // Guardar los datos en la matriz
                    autmovil[contador][0] = nombre;
                    autmovil[contador][1] = modelo;
                    autmovil[contador][2] = color;
                    autmovil[contador][3] = chasis;
                    autmovil[contador][4] = anio;
                    autmovil[contador][5] = motor;
                    autmovil[contador][6] = transmision;
                    autmovil[contador][7] = combustible;
                    autmovil[contador][8] = String.valueOf(cant_de_puertas);
                    autmovil[contador][9] = String.valueOf(numero_de_asientos);
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
                    String chasis = showInputDialog("Ingrese el modelo_del_chasis:");
                    if (chasis == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String motor = showInputDialog("Ingrese el motor el tipo de motor del automovil");
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
                    String anio = showInputDialog("Ingrese el año del autobus");
                    if (anio == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    int cantpasajeros = Integer.parseInt(showInputDialog("Ingrese la cantidad de pasajeros:"));
                    String tamaniobus = showInputDialog("Ingrese el tamaño del bus:");
                    if (tamaniobus == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    int cant_de_puertas = Integer.parseInt(showInputDialog("Ingrese El numero_de_puertas:"));
                    int numero_de_asientos = Integer.parseInt(showInputDialog("Ingrese el numero_de_asientos"));

                    Autobus autobus = new Autobus(nombre, modelo, color, chasis, anio, motor,
                            transmision, combustible, cantpasajeros, tamaniobus, cant_de_puertas, numero_de_asientos);

                    // Guardar los datos en la matriz
                    autmovil[contador][0] = nombre;
                    autmovil[contador][1] = modelo;
                    autmovil[contador][2] = color;
                    autmovil[contador][3] = chasis;
                    autmovil[contador][4] = anio;
                    autmovil[contador][5] = motor;
                    autmovil[contador][6] = transmision;
                    autmovil[contador][7] = combustible;
                    autmovil[contador][8] = String.valueOf(cant_de_puertas);
                    autmovil[contador][9] = String.valueOf(numero_de_asientos);
                    contador++;
                    break;
                }

                case 2 -> {
                    String nombre = showInputDialog(null, "Ingrese El Nombre De La marca de la Motocicleta :");
                    if (nombre == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String modelo = showInputDialog("Ingrese El Modelo De la Motocicleta :");
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
                    String motor = showInputDialog("Ingrese el nombtre del motor el tipo de motor del automovil");
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
                    String modelomoto = showInputDialog("introduzca el modelo de la moto NAKED , CHOPPER, TURISMO");
                    if (modelomoto == null) {
                        showInputDialog("cerrando el programa");
                    }
                    String anio = showInputDialog("Ingrese el año de la motocicleta");
                    if(anio == null){
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String cantllantas = showInputDialog("Ingrese la cantidad de llantas de la motocicleta");
                    if(cantllantas == null){
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }

                    Motocicleta motocicleta = new Motocicleta(nombre, modelo, color, chasis,anio, motor, transmision, combustible, modelomoto, cantllantas);

                    // Guardar los datos en la matriz
                    autmovil[contador][0] = nombre;
                    autmovil[contador][1] = modelo;
                    autmovil[contador][2] = color;
                    autmovil[contador][3] = chasis;
                    autmovil[contador][4] =  anio;
                    autmovil[contador][5] = motor;
                    autmovil[contador][6] = transmision;
                    autmovil[contador][7] = combustible;
                    autmovil[contador][8] = modelomoto;
                    autmovil[contador][9] = cantllantas;
                    contador++;
                    break;
                }
                default -> throw new IllegalStateException("Valor inesperado: " + opcion);
            }
            nuevo = JOptionPane.showConfirmDialog(null, "¿Desea realizar otro ingreso de auto ?", "Continuar",
                    JOptionPane.YES_NO_OPTION);
        }
        while (nuevo == JOptionPane.YES_OPTION);

        String[] columnas = {"Nombre", "Modelo", "Color", "Chasis", "Año", "Motor", "Transmision", "Combustible", "Cant_de_puertas", "Numero_de_asientos"};
        JTable datos = new JTable(new DefaultTableModel(autmovil, columnas));
        datos.setRowHeight(50);
        datos.getColumnModel().getColumn(0).setPreferredWidth(300); //nombre
        datos.getColumnModel().getColumn(1).setPreferredWidth(300); //modelo
        datos.getColumnModel().getColumn(2).setPreferredWidth(300); //color
        datos.getColumnModel().getColumn(3).setPreferredWidth(300); // chasis
        datos.getColumnModel().getColumn(4).setPreferredWidth(300); //anio
        datos.getColumnModel().getColumn(5).setPreferredWidth(300); //motor
        datos.getColumnModel().getColumn(6).setPreferredWidth(300); //transmision
        datos.getColumnModel().getColumn(7).setPreferredWidth(150); //combustible
        datos.getColumnModel().getColumn(8).setPreferredWidth(150); //cant_de_puertas
        datos.getColumnModel().getColumn(9).setPreferredWidth(150); //numero_de_asientos

        JScrollPane MostrarDatos = new JScrollPane(datos);
        JOptionPane.showMessageDialog(null, MostrarDatos, "REGISTRO_DE_AUTOS", JOptionPane.PLAIN_MESSAGE);
    }
}
        
        
        
   
