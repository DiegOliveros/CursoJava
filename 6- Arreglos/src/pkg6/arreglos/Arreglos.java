
package pkg6.arreglos;

import java.util.Scanner;

public class Arreglos {
    static Contacto[] contactos;
    static int cContactos = 0;
    public static void main(String[] args) {
        contactos = new Contacto[10];
        menu();
    }
    
    public static void menu(){
        System.out.println("");
        System.out.println("1- Agregar Contacto");
        System.out.println("2- Editar Contacto");
        System.out.println("3- Eliminar Contacto");
        System.out.println("4- Ver Contactos");
        System.out.println("5- Salir");
        int seleccion = Integer.parseInt(escribir("Introduza su elección:"));
        System.out.println("");
        switch(seleccion){  
            case 1:
                agregarContacto();
                menu();
                break;
                
            case 2:
                editarContacto(buscarContacto());
                menu();
                break;
                
            case 3:
                eliminarContacto();
                menu();
                break;
                
            case 4:
                verContactos();
                menu();
                break;
                
            case 5:
                return;
                
            default:
                System.out.println("Opcion Invalida");
                menu();
        }
    }
    
    public static void agregarContacto(){
        if (cContactos == 10) {
            System.out.println("Lista de Contactos Llena");
            return;
        }
        contactos[cContactos] = new Contacto();
        editarContacto(contactos[cContactos]);
        cContactos++;
    }
    
    public static Contacto buscarContacto(){
        int i = Integer.parseInt(escribir("Ingrese el ID del contacto: "));
        if (contactos[i] != null) {
            return contactos[i];
        }
        else{
            System.out.println("No existe el contacto");
            return null;
        }
    }
    
    public static void editarContacto(Contacto contacto){   
        if (contacto != null) {
            contacto.setNombre(escribir("Ingrese Nombre"));
            contacto.setApellido(escribir("\nIngrese Apellido"));
            contacto.setTelefono(escribir("\nIngrese Numero de Teléfono"));
            contacto.setEdad(Integer.parseInt(escribir("\nIngrese Edad")));
            contacto.setRelacion(escribir("\nIngrese Relación"));
        }
    }
    
    public static void eliminarContacto(){
        int i = Integer.parseInt(escribir("Ingrese el ID del contacto: "));
        if (contactos[i] != null) {
            for (int j = i+1; j <= cContactos; j++) {
                contactos[j-1] = contactos[j];
                contactos[j] = null;
            }
            cContactos--;
            System.out.println("Contacto Eliminado Exitosamente");
        }
        else{
            System.out.println("No existe el contacto");
        }
    }
    
    public static void verContactos(){
        System.out.println("ID\tNomb.\tAp.\tTel.\tEdad\tRelacion");
        for (int i = 0; i < cContactos; i++) {
            System.out.println(i + "\t" + contactos[i].getNombre() + "\t" + contactos[i].getApellido() + "\t" + contactos[i].getTelefono() + "\t" + contactos[i].getEdad() + "\t" + contactos[i].getRelacion());
        }
    }
    
    
    
    public static String escribir(String message) {
        System.out.println(message);
        Scanner scn = new Scanner(System.in);
        return scn.next();
    }
    
}
