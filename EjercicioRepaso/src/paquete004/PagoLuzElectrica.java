/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete001.Persona;
import paquete002.Ciudad;

/**
 *
 * @author reroes
 */
public class PagoLuzElectrica extends Pagos {

    private double tarifaBase;
    private double kilovatiosConsumidos;
    private double costoKilovatio;
    private Ciudad ciudad;

    @Override

    public void calcularPago() {
        tarifaBase = 10.20;
        kilovatiosConsumidos = 80;
        costoKilovatio = 0.5;

        if (ciudad.obtenerNombreCiudad().equals("Loja")) {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {

            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }

    }
}
