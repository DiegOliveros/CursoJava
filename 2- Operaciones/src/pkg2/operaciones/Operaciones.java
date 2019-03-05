/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.operaciones;

import java.util.Scanner;

/**
 *
 * @author natog
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte cantObj1 = Byte.parseByte(escribir("Ingrese Cantidad Objeto 1:"));
        double valObj1 = Double.parseDouble(escribir("Ingrese Precio Objeto 1:"));
        double totObj1;

        short cantObj2 = Short.parseShort(escribir("Ingrese Cantidad Objeto 2:"));
        double valObj2 = Double.parseDouble(escribir("Ingrese Precio Objeto 2:"));
        double totObj2;

        int cantObj3 = Integer.parseInt(escribir("Ingrese Cantidad Objeto 3:"));
        double valObj3 = Double.parseDouble(escribir("Ingrese Precio Objeto 3:"));
        double totObj3;

        long cantObj4 = Long.parseLong(escribir("Ingrese Cantidad Objeto 4:"));
        double valObj4 = Double.parseDouble(escribir("Ingrese Precio Objeto 4:"));
        double totObj4;

        float cantObj5 = Float.parseFloat(escribir("Ingrese Cantidad Objeto 5:"));
        double valObj5 = Double.parseDouble(escribir("Ingrese Precio Objeto 5:"));
        double totObj5;

        double dinero = Double.parseDouble(escribir("Ingrese Cantidad de Dinero en Posesión:"));

        double total = 0;

        //Función Multiplicación
        totObj1 = cantObj1 * valObj1;
        System.out.println("Costo Producto 1 x" + cantObj1 + ": $" + totObj1);
        
        totObj2 = cantObj2 * valObj2;
        System.out.println("Costo Producto 2 x" + cantObj2 + ": $" + totObj2);
        
        totObj3 = cantObj3 * valObj3;
        System.out.println("Costo Producto 3 x" + cantObj3 + ": $" + totObj3);
        
        totObj4 = cantObj4 * valObj4;
        System.out.println("Costo Producto 4 x" + cantObj4 + ": $" + totObj4);
        
        totObj5 = cantObj5 * valObj5;
        System.out.println("Costo Producto 5 x" + cantObj5 + ": $" + totObj5);

        //Función Suma (Suma inclusoria, Suma multiple)
        total = total + totObj1;
        total += totObj2;
        total += totObj3 + totObj4 + totObj5;
        System.out.println("Valor Total de la compra: $" + total);

        //Función Resta (Resta inclusoria)
        total -= dinero;
        System.out.println("Dinero faltante: $" + total);

    }

    public static String escribir(String message) {
        System.out.println(message);
        Scanner scn = new Scanner(System.in);
        return scn.next();
    }

}
