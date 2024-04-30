/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unipacifico.edu.tablahash.logica;

/**
 *
 * @author ALUMNO-
 */
public class Trabajador {
    private String cedula;
    private String nombre;
    private float salario;
 
    public Trabajador(String cedula, String nombre, float salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
