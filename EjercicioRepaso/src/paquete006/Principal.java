/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete006;

import paquete001.Persona;
import paquete002.Ciudad;
import paquete003.BilleteraPagos;
import static paquete006.DatosAgua.*;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        Ciudad ciudad2 = new Ciudad("Quito");

        Persona persona1 = new Persona("Juan", "Andrade", 28, "1150631511", ciudad2);

        double [][] datosComerciales = datosComerciales();
        
        for (int i = 0; i < datosComerciales.length; i++) {
            
            double tarifa = datosComerciales[i][0];
            
            double metrosConsumo = datosComerciales[i][1];
            
            
            
            
        }
        
        BilleteraPagos pago = new BilleteraPagos(persona1, "11", lista);
        System.out.println(pago);
    }
}
