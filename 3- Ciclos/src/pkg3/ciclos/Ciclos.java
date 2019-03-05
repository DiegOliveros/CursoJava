package pkg3.ciclos;

import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {

        double precioMesa = Double.parseDouble(escribir("Ingrese el valor por mesa:"));
        int cMesas;
        double total = 0;
        
        //Ciclo for ejecuta lo que haya dentro de él, mientras se cumpla la condición. Tiene la ventaja de poder definir una variable local y definir el incremento dentro de sí mismo.
            //Se define primero el nombre de la variable y su valor inicial, luego la condición de finalización y finalmente, la función de cambio.
        for (int i = 0; i < 7; i++) {
            System.out.println("Día " + (i + 1));
            cMesas = Integer.parseInt(escribir("Ingrese la cantidad de mesas atendidas hoy: "));
            total += cMesas * precioMesa;
            
            //Condicional if, lo que haya dentro de él, solo se ejecutará si la condición es Verdadera.
                //Operadores Lógicos como "Mayor Igual", "Or" y "Es Igual"
            if (cMesas >= 10 || i == 5) {
                System.out.println("Recibes Bonificación!");
                total += ((cMesas * precioMesa) / 100) * 20;
            }
            System.out.println("");
        }
        System.out.println("Te pagan $" + total);
        System.out.println();
        
        total = 0;
        double limite = Double.parseDouble(escribir("Ingrese el limite de dinero que busca: "));
        System.out.println("");
        
        int dia = 1;
        //El ciclo while, ejecuta lo que haya dentro mientras se cumpla la condición.
        while (total < limite) {
            System.out.println("Día " + dia);
            cMesas = Integer.parseInt(escribir("Ingrese la cantidad de mesas atendidas hoy: "));
            total += cMesas * precioMesa;
            if (cMesas >= 10 || dia == 5) {
                System.out.println("Recibes Bonificación!");
                total += ((cMesas * precioMesa) / 100) * 20;
            }
            System.out.println("");
            dia++;
        }
        System.out.println("Te pagan $" + total);
        System.out.println();
    }

    public static String escribir(String message) {
        System.out.println(message);
        Scanner scn = new Scanner(System.in);
        return scn.next();
    }

}
