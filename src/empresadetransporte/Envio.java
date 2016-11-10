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
public abstract class Envio {
    
    
    private int peso;
    private String fecha;
    
    public void mostrar(){
        System.out.println(this.fecha);
        System.out.println(this.peso);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
