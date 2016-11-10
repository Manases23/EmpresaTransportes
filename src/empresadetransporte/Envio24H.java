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
public class Envio24H extends Envio{
    
    private String prioridad;
    
    
    public void mostrar(){
        super.mostrar();
        System.out.println(this.prioridad);
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    
    
}
