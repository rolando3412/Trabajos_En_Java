/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculo_de_salarios;

/**
 *
 * @author User
 */
public class Empleado_hora extends Persona {
 
  private double horastrabajo;
    private double sueldoporhora;
    public Empleado_hora(String nombre, String apellido, int id, double horastrabajo, double sueldoporhora) {
        super(nombre, apellido, id);
        this.horastrabajo = horastrabajo;
        this.sueldoporhora =  sueldoporhora;
    }

    public double getHorastrabajo() {
        return horastrabajo * sueldoporhora;
    }

    //mostrando datos del empleado por hora
    public String mostrarDatos() {
        return super.mostrarDatos() + "\nHoras de trabajo: " + horastrabajo + "" +
                "\n sueldo por hora : " + sueldoporhora +
                "\nSueldo: " +String.format("%.2f" , horastrabajo * sueldoporhora) +
                "\nSueldo total " + String.format("%.2f" ,   getHorastrabajo());
    }
     //! string.format("%.2f" , getHorastrabajo())  sirve para redondear a 2 decimales asi no sales ese
    //!chingo de numeros decimales
}
    
    
    
    
    
    
    
    
    
    
    
    

