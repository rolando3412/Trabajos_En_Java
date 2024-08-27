/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculo_de_salarios;

/**
 *
 * @author User
 */
    //esta esta buena 
public class Empleado_Permanente extends Persona {
  

    private double sueldo;


    //generando el consturoctor
    public Empleado_Permanente(String nombre, String apellido, int id, double sueldo) {
        super(nombre, apellido, id);
        this.sueldo = sueldo;


    }
    public double getSueldo() {
        return sueldo * 30 ;
    }

    //mostrando datos del empleado permanente
    public String mostrarDatos() {
        return super.mostrarDatos() + "\nSueldo: " + sueldo * 30 ;
    }
}
