/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea4;

/**
 *
 * @author Ale
 */
public class Validacion {
    
    public static void ValidarSaldo(float saldo) throws SaldoNegativoExcepcion
            {
    if (saldo<0) throw new  SaldoNegativoExcepcion();
    
  }  
}
