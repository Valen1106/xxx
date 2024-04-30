
package unipacifico.edu.tablahash.logica;
import java.util.ArrayList;


public class ControladorTrabajadores {
    ArrayList<Trabajador> listaTrabajadores;

    public ControladorTrabajadores() {
      listaTrabajadores = new ArrayList<Trabajador>();
    }

    public ArrayList<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }
    
    public boolean agregarTrabajador(Trabajador empleado){
     return listaTrabajadores.add(empleado);
    }
    
    public boolean eliminarTrabajador(Trabajador empleado){
     return listaTrabajadores.remove(empleado);
    }
    
    public Trabajador eliminarTrabajador(int posicion){
        return listaTrabajadores.remove(posicion);
    }
    
    public Trabajador buscarTrabajador(String cedulaABuscar){
    Trabajador trabajadorEncontrado = null;
    
    for ( Trabajador trab: this.listaTrabajadores){
     if( trab.getCedula().equals(cedulaABuscar)){
       trabajadorEncontrado = trab;
       break;
     }
      
    }
    return trabajadorEncontrado;
    }
    
    public void cargaTrabajadores(){
    
        listaTrabajadores. add(new Trabajador("111111","Aisha Fontalvo", 5000000));
        listaTrabajadores. add(new Trabajador("222222","Jose Caicedo", 3000000));
        listaTrabajadores. add(new Trabajador("333333","Carlos Muñoz", 4000000));
        listaTrabajadores. add(new Trabajador("444444","Peter Hurtado", 5000000));
        listaTrabajadores. add(new Trabajador("555555","Camila Angulo", 7000000));
    
    }
}
