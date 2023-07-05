package paquete001;
import paquete002.Ciudad;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author reroes
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private Ciudad ciudad;

    public Persona(String n, String a, int e, String c, Ciudad ci) {
        this.nombre = n;
        this.apellido = a;
        this.edad = e;
        this.cedula = c;
        this.ciudad = ci;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerEdad(int e) {
        edad = e;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerCiudad(Ciudad c) {
        ciudad = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public int obtenerEdad() {
        return edad;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }
    
    
    
    
    
    
    
    
}
