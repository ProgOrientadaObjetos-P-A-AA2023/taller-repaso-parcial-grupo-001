/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

/**
 *
 * @author reroes
 */
public class PagoTelefonoConvencional extends Pagos {

    private double tarifa;
    private double minutosConsumidos;
    private double costoMinuto;

    public PagoTelefonoConvencional(double t, double m, double c) {
        tarifa = t;
        minutosConsumidos = m;
        costoMinuto = c;
    }

    public void establecerTarifa(double t) {
        tarifa = t;
    }

    public void establecerMinutosConsumidos(double m) {
        minutosConsumidos = m;
    }

    public void establecerCostoMinuto(double c) {
        costoMinuto = c;
    }

    @Override
    public void calcularPago() {

        pago = tarifa + (minutosConsumidos * costoMinuto);
    }

    public double obtenerTarifa() {
        return tarifa;
    }

    public double obtenerMinutosConsumidos() {
        return minutosConsumidos;
    }

    public double obtenerCostoMinuto() {
        return costoMinuto;
    }

    @Override
    public String toString() {

        String mensaje = String.format("Pago telefono convencional:\n"
                + "Tarifa: %.2f\n"
                + "Minutos consumidos: %.2f\n"
                + "Costo minutos: %.2f\n"
                + "Pago: %.2f\n\n",
                tarifa,
                minutosConsumidos,
                costoMinuto,
                pago);

        return mensaje;
    }
}
