
package unipacifico.edu.tablahash.presentacion;

import java.util.ArrayList;
import unipacifico.edu.tablahash.logica.ControladorTrabajadores;
import javax.swing.JOptionPane;
import unipacifico.edu.tablahash.logica.Trabajador;


public class Menu {
    ControladorTrabajadores control;

    public Menu() {
     control = new ControladorTrabajadores();
     String opcionesMenu = " ******* M  E  N  U     T  R  A  B  A  J  A  D  O  R  E  S ****** \n\n"
             +"1- Cargar Trabajadores \n"
             +"2- Agregar Trabajador \n"
             +"3- Eliminar Trabajor\n"
             +"4- Buscar por Cedula Trabajador\n"
             +"5- Salir\n"
             +"Digite opcion << 1-5 >>:";
             
   
    int seleccion =0;
    do{
     seleccion = Integer.parseInt(JOptionPane.showInputDialog(opcionesMenu));
     
     switch(seleccion){
         case 1:{control.cargaTrabajadores(); break;}
         case 2:{agregarTrabajador();break;}
         case 3:{eliminarTrabajador();break;}
         case 4:{buscarTrabajador(); break;}
         case 5:{break;}
         default:{JOptionPane.showMessageDialog(null, "No es una opcion del menu");}
         
     }
    }while(seleccion !=5);
    }
    
    public void agregarTrabajador(){
        
    //Solicitud de Datos
    String cedula = JOptionPane.showInputDialog("Ingrese la Cedula");
    String nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
    float salario = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el Salario"));
    
    //Crear el Objeto Ttrabajador
    Trabajador trab = new Trabajador(cedula, nombre, salario);
    //Agregar por medio del Controlador un trabajador a la lista
    boolean resultado = control.agregarTrabajador(trab);
    //Notificacion del resultado al Usuario
    if(resultado){
        JOptionPane.showMessageDialog(null, "El trabajador fue registrado");
    }
    else{
        JOptionPane.showMessageDialog(null, "El trabajador NO fue registrado");
      }
    }
    
    public void eliminarTrabajador(){
        ArrayList<Trabajador> lista = control.getListaTrabajadores();
        String salidaFormateada="";
        if (lista.size()>0){
        salidaFormateada = "----Lista de Trabajadores----\n\n";
        int contador = 0;
        for(Trabajador trab: lista){
            contador++;
            salidaFormateada += contador + " -- " + trab.getCedula() + " -- " 
                    + trab.getNombre() + " -- " + trab.getSalario();
        }
        salidaFormateada = "\n Ingrese la posicion del trabajador que desea eliminar: ";
                int pos = Integer.parseInt(JOptionPane.showInputDialog(salidaFormateada));
        
        if(pos<= lista.size()){
            Trabajador trab = control.eliminarTrabajador(pos - 1);
            if(trab != null){
                JOptionPane.showMessageDialog(null, "El trabajador fue ELIMINADO CORRECTAMENTE");
            }
            else{
                JOptionPane.showMessageDialog(null, "El trabajador NO fue ELIMINADO","ERROR",JOptionPane.ERROR_MESSAGE);
                
            }
        }
            else{
                JOptionPane.showMessageDialog(null, "El numero NO esta en el rango de la lista", " ERROR",JOptionPane.ERROR);
        }   
       }
            else{
                JOptionPane.showMessageDialog(null,"ATENCION", "NO hay trabajadores en la lista",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
            
    
    public void buscarTrabajador(){
       String cedula = JOptionPane.showInputDialog("Ingrese la Cedula del Trabajador");
       Trabajador trab = control.buscarTrabajador(cedula);
    if(trab !=null){
        String salida = "Trabjador encontrado! \n\n" 
                +"cedula:" +trab.getCedula()+ "\n"
                +"nombre:" +trab.getNombre()+ "\n"
                +"salario:" +trab.getSalario()+ "\n";
        JOptionPane.showMessageDialog(null, salida);        
    }
    else{
        JOptionPane.showMessageDialog(null, "ERROR","EL TRABAJADOR NO EXISTE!", JOptionPane.ERROR_MESSAGE);
     }
    }
    

}
