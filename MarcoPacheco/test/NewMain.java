


/** 
 * En este Ejemplo es la manera correcta de declarar las variable encapsuladas
 * fuera del archivo de ejecucion el programa si compila y ejecuta dando un 
 * resultado de 0 
 */
public class NewMain {

    public static void main(String[] args) {
        
        Test a= new Test();
        System.out.println(a.x);
    }
    
}
