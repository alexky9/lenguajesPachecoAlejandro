
package capitulo1;

public class Circulo {
    //paso 1
private float radio;
    //paso 2 creacion del metodo set(metodo mutador) set minuscula argumento siguiente con mayuscula
    // () va a ir el tipo de valor de la variable y el nombre que se le va asignar
  
public void setRadio(float radio){
    if (radio<0)radio=-radio;
    // this es para distingir la variable asignada con la usada anteriormente 
    this.radio=radio;
    } 
    //Creacion del metodo get (o accesorio)
public float getRadio(){
    return radio;
    }
}
