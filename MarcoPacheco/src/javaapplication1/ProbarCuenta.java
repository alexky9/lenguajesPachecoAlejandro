

package javaapplication1;

public class ProbarCuenta {

 
    public static void main(String[] args) {
        Cuenta_debito c1=new Cuenta_debito();
        
        c1.setId(1);
        c1.setnombre("Juan");
        c1.setsaldo(6000);
        c1.crearcuenta();
                
    }
    
}
