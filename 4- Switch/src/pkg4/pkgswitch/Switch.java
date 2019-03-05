package pkg4.pkgswitch;

import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        int dia = 0;
        String ropas = "";
        int selected;
        while(dia < 7){    
            dia++;
            System.out.println("Seleccione la vestimenta para el día " + dia);
            System.out.println("1- Casual");
            System.out.println("2- Formal");
            System.out.println("3- Deportiva");
            System.out.println("4- Para Baño");
            System.out.println("5- Reiniciar Orden");
            selected = Integer.parseInt(escribir("Ingrese el numero de su Seleccion"));
            
            //Un switch se define de esta manera, poniendo dentro del parentesis, el nombre de la variable a la cual se evaluaran los casos
                //Se puede interpretar como muchos condicionales if, pero para la misma variable
            switch(selected){
                
                //Si se cumple uno de los casos, es decir, si la variable == caso, se ejcutará lo que haya bajo el case hasta encontrar un break
                    //Cabe aclarar, que si no encuentra un case, hasta el siguiente case, también ejecutará el siguiente case, haciendo un efecto cascada
                case 1:
                    ropas += "Vestimenta para Dia " + dia + ": Casual \n";
                    System.out.println("Has agregado la vestimenta Casual para el dia " + dia);
                    break;
                    
                case 2:
                    ropas += "Vestimenta para Dia " + dia + ": Formal \n";
                    System.out.println("Has agregado la vestimenta Formal para el dia " + dia);
                    break;
                    
                case 3:
                    ropas += "Vestimenta para Dia " + dia + ": Deportiva \n";
                    System.out.println("Has agregado la vestimenta Deportiva para el dia " + dia);
                    break;
                    
                case 4:
                    ropas += "Vestimenta para Dia " + dia + ": Para Baño \n";
                    System.out.println("Has agregado la vestimenta Para Baño para el dia " + dia);
                    break;
                    
                case 5:
                    ropas = "";
                    dia = 0;
                    System.out.println("Se ha reiniciado la lista de Vestimentas y el Día");
                    break;
                    
                //Siempre se debe tener un caso default para situaciones en las que no se cumplan ninguno de los casos definidos
                default:
                    System.out.println("Opción no valida");
            }
        }
        System.out.println("\nVestimenta por Día de la Semana");
        System.out.println(ropas);
    }
    
    public static String escribir(String message) {
        System.out.println(message);
        Scanner scn = new Scanner(System.in);
        return scn.next();
    }
    
}
