/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrodeautos;

/**
 *
 * @author User
 */
public class Motocicleta extends Vehiculo{
    
    
      private String modelomoto;
    private String cantllanta;

    public Motocicleta(String nombre, String modelo, String color, String chasis,
                        String anio, String motor, String transmision, String combustible ,
                        String modelomoto, String cantllanta) {
        super(nombre, modelo, color, chasis, anio, motor, transmision, combustible);
        this.modelomoto = modelomoto;
        this.cantllanta = cantllanta;
    }

    public String getModelomoto() {
        return modelomoto;
    }

    public String getCantllanta() {
        return cantllanta;
    }

    public String mostrarDatos() {
        return super.mostrarDatos() +
                "\nModelomoto: " + modelomoto +
                "\nCantllanta: " + cantllanta;
    }
}
    
