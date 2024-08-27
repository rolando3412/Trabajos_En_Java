/*

`
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Nayeli Trejo
 */
public class Automovil extends Vehiculo {
  private int cant_de_puertas;
   private int numero_de_asientos;  
   public Automovil(String nombre, String modelo, String color, String chasis,
                     String anio, String motor, String transmision, String combustible,
                     int cant_de_puertas, int numero_de_asientos) {
        super(nombre, modelo, color, chasis, anio, motor, transmision, combustible);
        
        this.cant_de_puertas = cant_de_puertas;
        this.numero_de_asientos = numero_de_asientos;
    }
   public int getCant_de_puertas() {
        return cant_de_puertas;
    }

    public int getNumero_de_asientos() {
        return numero_de_asientos;
    }

    public String mostrarDatos() {
        return super.mostrarDatos() +
                "\nCant_de_puertas: " + cant_de_puertas +
                "\nNumero_de_asientos: " + numero_de_asientos;
    }
}
