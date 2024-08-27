/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculo_de_salarios;

/**
 *
 * @author User
 * 
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Calculo_de_salarios {
    

    public static void main(String[] args) {
        
        String opStr = (JOptionPane.showInputDialog("Ingrese el número de empleados:"));
        //creando el arreglo 
        
                      if (opStr == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    int  op = Integer.parseInt(opStr);
                    
                    
                    
        String[][] dEmpleados = new String[op][5];
        
        
         //para recorrer el areglo 
        for (int i = 0; i < op; i++) {
            String[] opciones = {"Empleado_Permanente", "Empleado_Hora"};
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione su Puesto de Trabajo", "Menú",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0 -> {
                    String nombre = JOptionPane.showInputDialog("Ingrese El Primer Nombre:");
                    //si el usuario decide cancelar 
                    if (nombre == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String apellido = JOptionPane.showInputDialog("Ingrese El Primer Apellido:");
                    if (apellido == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String idStr = JOptionPane.showInputDialog("Ingrese El ID Del Empleado:");
                    if (idStr == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    int id = Integer.parseInt(idStr);
                    
                    String sueldoStr = JOptionPane.showInputDialog("Ingrese el sueldo del Empleado * Día:");
                    if (sueldoStr == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    double sueldo = Double.parseDouble(sueldoStr);
                      
                    Empleado_Permanente empleadoPermanente = new Empleado_Permanente(nombre, apellido, id, sueldo);
                    JOptionPane.showMessageDialog(null, empleadoPermanente.mostrarDatos());
                    dEmpleados[i][0] = String.valueOf(id);
                    dEmpleados[i][1] = nombre;
                    dEmpleados[i][2] = apellido;
                    dEmpleados[i][3] = String.format("%.2f", sueldo * 30);
                    dEmpleados[i][4] = "Permanente";
                }
                case 1 -> {
                    String nombre = JOptionPane.showInputDialog("Ingrese El Primer Nombre:");
                    if (nombre == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String apellido = JOptionPane.showInputDialog("Ingrese El Primer Apellido:");
                    if (apellido == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    String idStr = JOptionPane.showInputDialog("Ingrese el ID del empleado:");
                    if (idStr == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    int id = Integer.parseInt(idStr);
                    String horastrabajoStr = JOptionPane.showInputDialog("Ingrese las horas de trabajo:");
                    if (horastrabajoStr == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    double horastrabajo = Double.parseDouble(horastrabajoStr);
                    String sueldoporhoraStr = JOptionPane.showInputDialog("Ingrese el sueldo por hora:");
                    if (sueldoporhoraStr == null) {
                        JOptionPane.showMessageDialog(null, "Cerrando programa");
                        System.exit(0);
                    }
                    double sueldoporhora = Double.parseDouble(sueldoporhoraStr);

                    Empleado_hora empleadoHora = new Empleado_hora(nombre, apellido, id, horastrabajo, sueldoporhora);
                    JOptionPane.showMessageDialog(null, empleadoHora.mostrarDatos());
                    dEmpleados[i][0] = String.valueOf(id);
                    dEmpleados[i][1] = nombre;
                    dEmpleados[i][2] = apellido;
                    dEmpleados[i][3] = String.format("%.2f", horastrabajo * sueldoporhora);
                    dEmpleados[i][4] = "Por Hora";
                }
                default -> throw new IllegalStateException("Unexpected value: " + opcion);
            }
        }

        String[] columnNames = {"ID", "Nombre", "Apellido", "Salario", "Empleado"};
        // Crear la tabla
        JTable table = new JTable(new DefaultTableModel(dEmpleados, columnNames));
        // Ajustar la tabla en espacios de 30 
        table.setRowHeight(30); // Ajusta la altura de las filas
        // Ajustar el ancho de las columnas
        table.getColumnModel().getColumn(0).setPreferredWidth(100); // Ajusta el ancho de las columnas
        table.getColumnModel().getColumn(1).setPreferredWidth(100);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);
        table.getColumnModel().getColumn(3).setPreferredWidth(100);
        table.getColumnModel().getColumn(4).setPreferredWidth(100);

        JScrollPane scrollPane = new JScrollPane(table);
        JOptionPane.showMessageDialog(null, scrollPane, "Datos de Empleados", JOptionPane.PLAIN_MESSAGE);
    }
 }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
