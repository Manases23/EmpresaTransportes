/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresadetransporte;

import java.util.ArrayList;



public class EmpresaDeTransporte {

static ArrayList <Envio> envios = new ArrayList <Envio>();
static ArrayList <Empleado> empleados = new ArrayList <Empleado>();
static ArrayList <Vehiculo> vehiculos = new ArrayList <Vehiculo>();
    


    public static void rellenarDatos(){
        
        //Creo 10 envios azules y 10 envios 24horas
        EnvioAzul azul;
        Envio24H e24h;
        
        for (int i = 0; i < 10; i++) {
            azul = new EnvioAzul();
            azul.setFecha("23/11/2016");
            azul.setPeso(150+i);
            azul.setValor(100+i);
            envios.add(azul);
            
            e24h = new Envio24H();
            e24h.setFecha("31/11/2016");
            e24h.setPeso(80+i);
            e24h.setPrioridad("ALTA");
            envios.add(e24h);
        }
        
        //Creo 10 coches, 10 furgos y 10 camiones
        
        Coche c;
        Furgo f;
        Camion cam;
        
        for (int i = 0; i < 10; i++) {
            c = new Coche();
            c.setMarca("RENAULT "+i);
            c.setColor("Blanco");
            c.setMatricula("BA2463"+i);           
            vehiculos.add(c);
            
            f = new Furgo();
            f.setMarca("Mercedes "+i);
            f.setPmautorizado(200+i);
            f.setMatricula("BA2345"+i);
            vehiculos.add(f);
            
            cam = new Camion();
            cam.setMarca("Pegaso "+i);
            cam.setVolumen(500+i);
            cam.setMatricula("BA0005"+i);
            vehiculos.add(cam);
        }
        
        //Creo 10 empleados
        Empleado e;
        for (int i = 0; i < 10; i++) {
            e = new Empleado();
            e.setNombre("Empleado "+i);
            e.setEdad(18+i);
            empleados.add(e);
        }
    }

//-----1-----Mostrar todos los envios
    public static void mostrarTodosEnvios(){
        for (int i = 0; i < envios.size(); i++) {
            envios.get(i).mostrar();
            
        }
    }

//-----2-----Mostrar el envio 24 horas de más peso
    public static void mostrarEnvio24Hmayorpeso(){
        
        int pesomaximo = 0;
        
        for (int i = 0; i < envios.size(); i++) {
            if(envios.get(i) instanceof Envio24H){
               if(pesomaximo < envios.get(i).getPeso()){
                  pesomaximo = envios.get(i).getPeso();
               } 
            } 
        }    
        System.out.println(pesomaximo);
    }

    //-----3-----Mostrar la suma total del peso de los envios
    public static void mostrarSumaPesoEnvíos(){
        
        int suma24H = 0; 
        int sumaazul = 0;      
        int sumapesototal;
        
        
        for (int i = 0; i < envios.size(); i++) {
            if(envios.get(i) instanceof Envio24H){
                suma24H = suma24H + envios.get(i).getPeso();
            }
            
            if(envios.get(i) instanceof EnvioAzul){
                sumaazul = sumaazul + envios.get(i).getPeso();
            }
        }
        sumapesototal = suma24H + sumaazul;
        
        System.out.println("La suma total de envios 24 horas es " + suma24H);
        System.out.println("La suma total de envios azules es " + sumaazul);
        System.out.println("La suma total de todos los envios es de " + sumapesototal);
    }
    
    //-----4-----Asignar un empleado a un vehiculo
    public static void asignarEmpleadoAVehiculo(Vehiculo v, Empleado e){
        v.setConductor(e);
        
    }
    
    
    public static void main(String[] args) {

        rellenarDatos();
        
        //----1----
        //mostrarTodosEnvios();
        
        //----2----
        //mostrarEnvio24Hmayorpeso();
        
        //----3----
        //mostrarSumaPesoEnvíos();
        
        //----4----
        //asignarEmpleadoAVehiculo(vehiculos.get(2), empleados.get(4));
        
    }
    
}
