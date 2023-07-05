/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete006;

import java.util.ArrayList;
import paquete001.Persona;
import paquete002.Ciudad;
import paquete002.Propiedad;
import paquete003.BilleteraPagos;
import paquete004.PagoAguaPotable;
import paquete004.PagoLuzElectrica;
import paquete004.PagoPredial;
import paquete004.Pagos;
import static paquete006.DatosAgua.*;
import static paquete006.DatosLuz.datosGeneral;
import static paquete006.DatosLuz.datosLoja;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        ArrayList<Pagos> lista = new ArrayList();

        Ciudad ciudad2 = new Ciudad("Loja");
        Ciudad ciudad1 = new Ciudad("Quito");

        Persona persona1 = new Persona("Juan", "Andrade", 28, "1150631511", ciudad2);

        double[][] datosComerciales = datosComerciales();

        for (int i = 0; i < datosComerciales.length; i++) {

            double tarifa = datosComerciales[i][0];

            double metrosConsumo = datosComerciales[i][1];

            double costoConsumo = datosComerciales[i][2];

            String tipo = "comercial";

            Pagos p1 = new PagoAguaPotable(tarifa, metrosConsumo, costoConsumo, tipo);
            lista.add(p1);

        }

        double[][] datosCasas = datosCasas();

        for (int i = 0; i < datosCasas.length; i++) {

            double tarifa = datosCasas[i][0];

            double metrosConsumo = datosCasas[i][1];

            double costoConsumo = datosCasas[i][2];

            String tipo = "normal";

            Pagos p1 = new PagoAguaPotable(tarifa, metrosConsumo, costoConsumo, tipo);
            lista.add(p1);

        }

        double[][] datosLoja = datosLoja();

        for (int i = 0; i < datosLoja.length; i++) {

            double tarifa = datosLoja[i][0];

            double consumo = datosLoja[i][1];

            double costo = datosLoja[i][2];

            Pagos p1 = new PagoLuzElectrica(tarifa, consumo, costo, ciudad2);
            lista.add(p1);

        }

        double[][] datosGeneral = datosGeneral();

        for (int i = 0; i < datosGeneral.length; i++) {

            double tarifa = datosGeneral[i][0];

            double consumo = datosGeneral[i][1];

            double costo = datosGeneral[i][2];

            Pagos p1 = new PagoLuzElectrica(tarifa, consumo, costo, ciudad1);
            lista.add(p1);

        }
        
         double[][] datosPropiedades = datosPropiedades();
        
         for (int i = 0; i < datosPropiedades.length; i++) {
             

            double costoP = datosPropiedades[i][0];
            
            Propiedad propiedad1 = new Propiedad(costoP);
        

            double porcent = datosPropiedades[i][1];


            Pagos p1 = new PagoPredial(costoP, porcent);
            lista.add(p1);

        }

        BilleteraPagos pago = new BilleteraPagos(persona1, "11", lista);
        System.out.println(pago);
    }

    private static double[][] datosPropiedades() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
