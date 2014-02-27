
package tarea4;

public class cuenta {
    
    private int Id;
    private String nombre;
    private float saldo;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        
        Validacion.ValidarSaldo(saldo);
        this.saldo = saldo;
    }


}
