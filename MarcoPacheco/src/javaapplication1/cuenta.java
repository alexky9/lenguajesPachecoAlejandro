
package javaapplication1;

public class cuenta {
    
    private int Id;
    private String nombre;
    private float saldo;
    
       public int getId(){
        return Id;
    }
    
    public void setId(int Id){
        this.Id=Id;
        
    }
  
     public void setnombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getnombre(){
        return nombre;
    }
     public void setsaldo(float saldo){
        this.saldo=saldo;
        
    }
    
    public float getsaldo(){
        return saldo;
    }
    
    public void crearcuenta(){
        System.out.println("cuenta creada con exito");
    }
    
}
