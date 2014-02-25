

package javaapplication1;


public class Validacion {
    
    public static void validaredad(int edad) throws EdadNegativaException{
        if (edad<18) throw new EdadNegativaException();
    }
    
}
