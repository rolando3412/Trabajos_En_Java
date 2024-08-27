/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Nayeli Trejo
 */
public class Autobus extends Vehiculo {
    private int cantpasajeros;
    private String tamaniobus;
    private int cant_de_puertas;
    private int numero_de_asientos;


    public Autobus(String nombre, String modelo, String color, String chasis,
                    String anio, String motor, String transmision, String combustible,
                    int cantpasajeros, String tamaniobus, int cant_de_puertas, int numero_de_asientos) {
        super(nombre, modelo, color, chasis, anio, motor, transmision, combustible);
        this.cantpasajeros = cantpasajeros;
        this.tamaniobus = tamaniobus;
        this.cant_de_puertas = cant_de_puertas;
        this.numero_de_asientos = numero_de_asientos;
    }
    public int getCantpasajeros() {
        return cantpasajeros;
    }

    public String getTamaniobus() {
        return tamaniobus;
    }
    public int getCant_de_puertas() {
        return cant_de_puertas;
    }

    public int getNumero_de_asientos() {
        return numero_de_asientos;
    }

    public String mostrarDatos() {
        return super.mostrarDatos() +
                "\ncantpasajeros" + cantpasajeros +
                "\nTamaniobus" + tamaniobus+
                "\nCant_de_puertas: " + cant_de_puertas +
                "\nNumero_de_asientos: " + numero_de_asientos;
        }
   
}