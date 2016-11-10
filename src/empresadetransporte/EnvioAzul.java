/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresadetransporte;

/**
 *
 * @author usuario
 */
public class EnvioAzul extends Envio{
    
    private int valor;
    
    public void mostrar(){
        super.mostrar();
        System.out.println(this.valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
