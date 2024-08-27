/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Nayeli Trejo
 */
public class Vehiculo {
    private String nombre;
    private String modelo ;
    private String color;
    private String chasis;
    private String motor;
    private String transmision;
    private String combustible;
     protected String  anio;
  

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
    public Vehiculo(String nombre, String modelo, String color, String chasis,
                    String motor, String transmision, String combustible) {
    }

    //generando los getters y setters de la clase vehiculo
        public String getNombre() {
            return nombre;
        }

        public String getmodelo() {
            return modelo ;
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

                //mostrando los datos
                public String mostrarDatos () {
                    return "Nombre: " + nombre +
                            "\nModelo: " + modelo +
                            "\nColor: " + color +
                            "\nChasis: " + chasis +
                            "\nAño: " + anio +
                            "\nMotor: " + motor +
                            "\nTransmision: " + transmision +
                            "\nCombustible: " + combustible;
                }
    
    
    }// fin class vehiculo