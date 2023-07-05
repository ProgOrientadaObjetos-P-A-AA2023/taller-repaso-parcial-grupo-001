/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import java.util.ArrayList;
import paquete001.Persona;
import paquete004.*;

/**
 *
 * @author reroes
 */
public class BilleteraPagos {

    private Persona persona;
    private double gastoPagos;
    private String mes;
    private ArrayList<Pagos> lista;

    public BilleteraPagos(Persona p, String m, ArrayList<Pagos> l) {
        persona = p;
        mes = m;
        lista = l;
    }

    public void establecerPersona(Persona p) {
        this.persona = p;
    }

    public void calcularGastoPagos() {

        double suma = 0;
        for (Pagos lista1 : lista) {
            suma = suma + lista1.obtenerPago();
        }
        gastoPagos = suma;
    }

    public void establecerMes(String m) {
        this.mes = m;
    }

    public void establecerLista(ArrayList<Pagos> l) {
        this.lista = l;
    }

    public Persona obtenerPersona() {
        return persona;
    }

    public double obtenerGastoPagos() {
        return gastoPagos;
    }

    public String obtenerMes() {
        return mes;
    }

    public ArrayList<Pagos> obtenerLista() {
        return lista;
    }

    @Override
    public String toString() {

        String mensaje = String.format("Persona:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Edad: %d\n"
                + "Cedula: %s\n"
                + "Ciudad: %s\n"
                + "Mes: %s\n\n", 
                persona.obtenerNombre(), 
                persona.obtenerApellido(), 
                persona.obtenerEdad(), 
                persona.obtenerCedula(), 
                persona.obtenerCiudad().obtenerNombreCiudad(),
                mes);

        for (Pagos lista1 : lista) {
            mensaje = String.format("%s%s\n",mensaje,lista1);
        }
        
        mensaje = String.format("%s\n"
                + "El gosto total es: %.2f\n\n",
                mensaje,
                gastoPagos);
        
        return mensaje;
    }

}
