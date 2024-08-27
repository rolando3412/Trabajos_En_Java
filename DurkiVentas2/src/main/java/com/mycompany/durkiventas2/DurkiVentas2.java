/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.durkiventas2;

import javax.swing.JOptionPane;


public class DurkiVentas2 {

    public static void main(String[] args) {
        
      int notas;
        int nvendedor;
        int nproducto;
        double precio;
        //String resultado = "";
        double[][] totventa = new double[6][5];

        String resultado= " ";


        String[] nombresProductos= {"Producto 1","Producto 2","Producto 3","Producto 4","Producto 5"};
        String[] titulo= {"Producto "," V 1","V2 ","V3","V4","V5"};
        double [][] ventas= new double [5][4];
        notas =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese El numero de notas totales del dia  ","VENTA",
                JOptionPane.INFORMATION_MESSAGE)  );
        //llenar matriz
        for (int i = 0; i < notas; i++) {


            nvendedor=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese El numero del vendedor  ",
                    "VENTA",
                    JOptionPane.INFORMATION_MESSAGE)  )-1;

            nproducto =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese El numero del producto ",
                    "VENTA",
                    JOptionPane.INFORMATION_MESSAGE)  )-1;
            precio =Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese El precio del producto ",
                    "VENTA",
                    JOptionPane.INFORMATION_MESSAGE)  );
            ventas[nproducto][nvendedor]+= precio;



        }
        //mostrar
        for (int i = 0; i< 5; i++) {
            for (int j = 0; j < 4; j++) {
                totventa[i][j] = ventas[i][j];
                totventa[i][4] += ventas[i][j]; // Total por producto
                totventa[5][j] += ventas[i][j]; // Total por vendedor
                totventa[5][4] += ventas[i][j];

            }

        }


        for (int i = 0; i < 5; i++) {

            resultado += nombresProductos[i] + "        ";

            for (int j = 0; j < 5; j++) {

                resultado += totventa[i][j] + "        ";
            }
            resultado += "\n";
        }
        resultado += "Total      ";
        for (int j = 0; j < 5; j++) {
            resultado += totventa[5][j] + "        ";
        }

        // Mostrar la matriz en un JOptionPane
        JOptionPane.showMessageDialog(null, resultado, "Resultados de Ventas", JOptionPane.INFORMATION_MESSAGE);







    }
}