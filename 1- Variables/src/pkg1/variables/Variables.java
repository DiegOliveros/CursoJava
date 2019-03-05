//Aquí se define el paquete en el que se encuentra el archivo
package pkg1.variables;

//Aquí se definen las librerías importadas a utilizar
import java.util.Scanner;

//Esta es la definición de la Clase, viene con la privacidad de esta, luego el indicador de Clase y finalmente el nombre de la clase
public class Variables {

    //Esta es la definición del metodo main, solo debe existir una Clase con este metodo, y solo debe existir un metodo Main
    public static void main(String[] args) {
        //Variable Numerica byte (-128 a 127)
        byte cantObj1 = 10;
        cantObj1 = 5;

        byte cantX = cantObj1;

        //Variable Numerica short (2^16)
        short cantObj2;

        //Variable Numerica int (2^32)
        int cantObj3;

        //Variable Numérica
        long cantObj4;

        //Variable Numérica
        float cantObj5;

        //Variable Numérica
        double cantObj6;

        //Variable Caracter
        char Name1 = 'a';

        //Variable Booleana (Falso o Verdadero)
        boolean boolTrue = true;
        boolean boolFalse = false;

        //Variable Cadena (Grupo de Caracteres)
        String obj1;
        String obj2;
        String obj3;
        String obj4;
        String obj5;
        String obj6 = "Dinero";
        
        obj1 = escribir("Ingrese Nombre Objeto 1:");
        cantObj1 = Byte.parseByte(escribir("Cantidad:"));
        
        obj2 = escribir("Ingrese Nombre Objeto 2:");
        cantObj2 = Short.parseShort(escribir("Cantidad:"));
        
        obj3 = escribir("Ingrese Nombre Objeto 3:");
        cantObj3 = Integer.parseInt(escribir("Cantidad:"));
        
        obj4 = escribir("Ingrese Nombre Objeto 4:");
        cantObj4 = Long.parseLong(escribir("Cantidad:"));
        
        obj5 = escribir("Ingrese Nombre Objeto 5:");
        cantObj5 = Float.parseFloat(escribir("Cantidad:"));
        
        cantObj6 = Double.parseDouble(escribir("Ingrese Cantidad de Dinero en Posesión:"));
       
        //Concatenación de String con Numericos 
        System.out.println("-" + obj1 + " x" + cantObj1);
        System.out.println("-" + obj2 + " x" + cantObj2);
        System.out.println("-" + obj3 + " x" + cantObj3);
        System.out.println("-" + obj4 + " x" + cantObj4);
        System.out.println("-" + obj5 + " x" + cantObj5);
        System.out.println("-" + obj6 + ": $" + cantObj6);
    }

    public static String escribir(String message) {
        System.out.println(message);
        Scanner scn = new Scanner(System.in);
        return scn.next();
    }

}
