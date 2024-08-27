/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuadrosdedilogo;

import javax.swing.JOptionPane;
public class CuadrosdeDilogo {

    public static void main(String[] args) {
    String nombre = JOptionPane.showInputDialog("Ingrese el nombre");  // ingressando nombre 
    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el edad")); //transformando el entero 
  
    JOptionPane.showMessageDialog(null, "Hola " + nombre + " " + edad, "Titulo", JOptionPane.WARNING_MESSAGE);
        // imprimiendo os datos en la cajita
        
        
        
        
        
        
        
    }
}
