package pkg5.metodos.y.clases;

import java.util.Scanner;

//Definición de la clase, se realiza poniendo la privacidad, la palabra clave class, y el nombre que se dará a la clase (Debe ser el mismo nombre del archivo)
public class MetodosYClases {
    
    //Definición de una variable Global (Se realiza fuera de cualquier metodo y dentro de la clase)
        //Definición de una Clase, puede notarse que es lo mismo que la definición de una 
    public static Perfil yo;
    
    public static void main(String[] args) {
        System.out.println("Creación de Perfil");
        
        //Inicilización de una clase, esto invoca uno de los constructores de la clase, el cual se adapte a los perimetros enviados
        yo = new Perfil();
        
       
        editarPerfil();
        menu();
    } //Llamado a un Metodo de la misma clase
    
    //Definicion de un metodo de privacidad publica, static y con retorno void
    public static void menu(){
        int seleccion;
        System.out.println("1- Editar Perfil");
        System.out.println("2- Ver Perfil");
        System.out.println("3- Salir");
        seleccion = Integer.parseInt(escribir("Ingrese Su Selección"));
        
        switch(seleccion){
            case 1:
                editarPerfil();
                //Llamado recursivo
                menu();
                break;
                
            case 2:
                imprimirPerfil();
                //Llamado recursivo
                menu();
                break;
                
            case 3:
                break;
                
            default:
                System.out.println("Seleccion Invalida");
                menu();
        }
        
    }
    
    public static void editarPerfil(){
        //Llamado a un metodo del objeto yo, de su respectiva clase
        yo.setId(Integer.parseInt(escribir("Ingrese su ID")));
        yo.setNombre(escribir("Ingrese su Nombre"));
        yo.setEdad(Integer.parseInt(escribir("Ingrese su Edad")));
        yo.setTelefono(escribir("Ingrese su numero de telefono"));
        yo.setGenero(escribir("Ingrese su Genero(F/M)"));
    }
    
    public static void imprimirPerfil(){
        System.out.println("ID: " + yo.getId());
        System.out.println("Nombre: " + yo.getNombre());
        System.out.println("Edad: " + yo.getEdad());
        System.out.println("Telefono: " + yo.getTelefono());
        System.out.println("Genero: " + yo.getGenero());
    }
    
    public static String escribir(String message) {
        System.out.println(message);
        Scanner scn = new Scanner(System.in);
        return scn.next();
    }
    
}