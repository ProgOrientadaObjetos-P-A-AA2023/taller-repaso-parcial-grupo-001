/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

/**
 *
 * @author reroes
 */
public class PagoAguaPotable extends Pagos {

    private double tarifaFija;
    private double metrosCubicosConsumo;
    private double costoConsumoCubicos;
    private String tipo;

    public PagoAguaPotable(double t, double m, double c, String a) {

        tarifaFija = t;
        metrosCubicosConsumo = m;
        costoConsumoCubicos = c;
        tipo = a;

    }

    public void establecerTarifaFija(double tarifaFija) {
        this.tarifaFija = tarifaFija;
    }

    public void establecerMetrosCubicosConsumo(double metrosCubicosConsumo) {
        this.metrosCubicosConsumo = metrosCubicosConsumo;
    }

    public void establecerCostoConsumoCubicos(double costoConsumoCubicos) {
        this.costoConsumoCubicos = costoConsumoCubicos;
    }

    public void establecerTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void calcularPago() {

        if (tipo.equals("comercial")) {

            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15;
        } else {

            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos);
        }

    }

    public double obtenerTarifaFija() {
        return tarifaFija;
    }

    public double obtenerMetrosCubicosConsumo() {
        return metrosCubicosConsumo;
    }

    public double obtenerCostoConsumoCubicos() {
        return costoConsumoCubicos;
    }

    public String obtenerTipo() {
        return tipo;
    }

    @Override
    public String toString() {

        String mensaje = String.format("Pago agua potable:\n"
                + "Tarifa fija: %.2f\n"
                + "Consumo metros cubicos: %.2f\n"
                + "Costo metros cubicos: %.2f\n"
                + "Tipo: %s\n"
                + "Pago: %.2f\n\n", 
                tarifaFija, 
                metrosCubicosConsumo, 
                costoConsumoCubicos, 
                tipo,
                pago);
        

        return mensaje;
    }
    
}
