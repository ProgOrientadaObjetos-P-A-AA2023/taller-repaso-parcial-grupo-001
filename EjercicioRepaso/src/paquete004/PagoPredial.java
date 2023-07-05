/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete002.Propiedad;

/**
 *
 * @author reroes
 */
public class PagoPredial extends Pagos {

    private Propiedad propiedad;
    private double porcentaje;

    public PagoPredial(Propiedad p, double po) {
        propiedad = p;
        porcentaje = po;
    }

    public void establecerPropiedad(Propiedad p) {
        propiedad = p;
    }

    public void establecerPorcentaje(double p) {
        porcentaje = p;
    }

    @Override
    public void calcularPago() {

        pago = propiedad.obtenerCostoPropiedad() - ((propiedad.obtenerCostoPropiedad() * porcentaje) / 100);

    }

    public Propiedad obtenerPropiedad() {
        return propiedad;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }

    @Override
    public String toString() {

        String mensaje = String.format("Pago predial:\n"
                + "Valor Propiedad: %.2f\n"
                + "Porcentaje: %.2f\n"
                + "Pago: %.2f\n\n",
                propiedad.obtenerCostoPropiedad(),
                porcentaje,
                pago);

        return mensaje;
    }

}
