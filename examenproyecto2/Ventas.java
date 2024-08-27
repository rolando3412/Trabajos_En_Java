
package com.mycompany.examenproyecto2;
import java.util.Scanner;
/**
 * use un arreglo para resolver el siguiente problema una compania 
 * tuene 4 vendedores  (1 a 4 ) que venden 5 productos distintos 
 * (1 a 5 ) una vez al dia , cada vendedor pasa una nota por 
 * cada tipo de producto vendido . cada nota contiene  lo siguinte 
 * 1) el numero de vendedor 
 * 2) el numero del profucto 
 * 3) el valor en lempiras de ese producto vendido en ese dia 
 * 
 * si cada vendedor pasa entre 0 a 3 notas de venta por dia.
 * escriba una aplicacion que lea toda esta 
 * informacion de las ventas y que resuma las ventas totales por 
 * vendedor y por producto todos los totales deben guardarce en
 * el arreglo despues de processar toda la informacion del mes
 * muestre los resultados en formato tabular , donde cada columna 
 * reprecente a un vendedor especifico y cada fila simbolice un producto,
 * saque  el total de cada fila para odtener las ventas totales de cada 
 * producto durante el mes. calcule el total de cada columna 
 * para sacar las ventas totales de cada vendedor durante el mes,
 * su imprecion tabular debe incluir estos totales cruzados ala 
 * derecha de las filas totalizadas, y en la parte inferior 
 * de las columnas totalizadas 
 * 
 *
 *
 * 
 */
public class Ventas {

    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
        // Matriz original de 4x5 para las ventas
        int[][] ventas = new int[4][5];
        // Nueva matriz de 5x6 para incluir totales
        int[][] ventasConTotales = new int[5][6];
        String[] nombresVendedores = {"Vendedor 1", "Vendedor 2", "Vendedor 3", "Vendedor 4"};
        String[] nombresProductos = {"Producto 1", "Producto 2", "Producto 3", "Producto 4", "Producto 5"};
        
        // Llenar la matriz original con datos de ventas
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Ingrese el valor de la venta del " + nombresProductos[j] + " del " + nombresVendedores[i]);
                ventas[i][j] = leer.nextInt();
                // Sumar al total del vendedor
                ventasConTotales[i][5] += ventas[i][j];
                // Sumar al total del producto
                ventasConTotales[4][j] += ventas[i][j];
                // Copiar el valor a la nueva matriz
                ventasConTotales[i][j] = ventas[i][j];
            }
        }
        
        // Calcular el total general
        for (int i = 0; i < 4; i++) {
            ventasConTotales[4][5] += ventasConTotales[i][5];
        }
        
        // Imprimir la matriz con nombres y totales
        for (int i = 0; i < 5; i++) {
            if (i < 4) {
                System.out.print(nombresVendedores[i] + ": ");
            } else {
                System.out.print("Total: ");
            }
            for (int j = 0; j < 6; j++) {
                if (j < 5) {
                    System.out.print(ventasConTotales[i][j] + " ");
                } else if (i < 4) {
                    // Imprimir el total por vendedor
                    System.out.print("| Total Vendedor: " + ventasConTotales[i][j]);
                }
            }
            System.out.println();
        }
        
        // Imprimir los totales por producto
        System.out.print("Total Producto: ");
        for (int j = 0; j < 5; j++) {
            System.out.print(ventasConTotales[4][j] + " ");
        }
        System.out.println("| Total General: " + ventasConTotales[4][5]);

    }
 }  
    

