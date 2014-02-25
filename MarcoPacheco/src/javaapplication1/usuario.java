
package javaapplication1;

public class usuario {
    
    String nombre;
    Integer edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadNegativaException{
        Validacion.validaredad(edad);
        this.edad = edad;
    }
    
    
            
    
}
