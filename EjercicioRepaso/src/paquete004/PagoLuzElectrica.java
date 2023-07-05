/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;


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
    
    public PagoLuzElectrica(double tB, double kC, double cK, Ciudad c){
    
        tarifaBase = tB;
        kilovatiosConsumidos = kC;
        costoKilovatio = cK;
        ciudad = c;
    
    
    }

    public void establecerTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public void establecervKilovatiosConsumidos(double kilovatiosConsumidos) {
        this.kilovatiosConsumidos = kilovatiosConsumidos;
    }

    public void establecerCostoKilovatio(double costoKilovatio) {
        this.costoKilovatio = costoKilovatio;
    }

    public void establecerCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    

    @Override

    public void calcularPago() {

        if (ciudad.obtenerNombreCiudad().equals("Loja")) {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {

            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }

    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    public double obtenerKilovatiosConsumidos() {
        return kilovatiosConsumidos;
    }

    public double obtenerCostoKilovatio() {
        return costoKilovatio;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }
    
    @Override
    public String toString() {

        String mensaje = String.format("Pago luz electrica:\n"
                + "Tarifa base: %.2f\n"
                + "Consumo kilovatios: %.2f\n"
                + "Costo kilovatios: %.2f\n"
                + "Ciudad: %s\n\n"
                + "Pago: %.2f\n\n",
                tarifaBase, 
                kilovatiosConsumidos, 
                costoKilovatio, 
                ciudad.obtenerNombreCiudad(),
                pago);

        return mensaje;
    }
    
}
