/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrodeautos;

/**
 *
 * @author User
 */
public class Vehiculo {
    
    
      private String nombre;
    private String modelo;
    private String color;
    private String chasis;
    private String motor;
    private String transmision;
    private String combustible;
    private String anio;

    public Vehiculo(String nombre, String modelo, String color, String chasis,
                    String anio, String motor, String transmision, String combustible) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.color = color;
        this.chasis = chasis;
        this.anio = anio;
        this.motor = motor;
        this.transmision = transmision;
        this.combustible = combustible;
    }


    // Getters y setters de la clase Vehiculo
    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getChasis() {
        return chasis;
    }

    public String getAnio() {
        return anio;
    }

    public String getMotor() {
        return motor;
    }

    private String getTransmision() {
        return transmision;
    }

    private String getCombustible() {
        return combustible;
    }

    // Mostrando los datos
    public String mostrarDatos() {
        return "Nombre: " + nombre +
                "\nModelo: " + modelo +
                "\nColor: " + color +
                "\nChasis: " + chasis +
                "\nAño: " + anio +
                "\nMotor: " + motor +
                "\nTransmision: " + transmision +
                "\nCombustible: " + combustible;
    }
}
    

