
package pkg5.metodos.y.clases;

//Definición de clase
public class Perfil {
    //Definición de variables globales
    String nombre;
    int id;
    int edad;
    String telefono;
    String genero;

    //Definicion del metodo constructor principal (Se inicializan todas las variables al crear un objeto de esta clase)
    public Perfil(String nombre, int id, int edad, String telefono, String genero) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.telefono = telefono;
        this.genero = genero;
    }
    
    //Definicion de metodo constructor alternativo
    public Perfil(){
        
    }

    //Getter de una variable de la clase propia
    public String getNombre() {
        return nombre;
    }

    //Setter de una variable de la clase propia
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
