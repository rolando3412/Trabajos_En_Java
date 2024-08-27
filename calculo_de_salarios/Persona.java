/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculo_de_salarios;

/**
 *
 * @author User
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int id;

    public Persona(String nombre, String apellido, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }
     //generando getters y setters


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getId() {
        return id;
    }

    // mostrando datos de la persona
    public String mostrarDatos() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nID: " + id;
    }
}

    

