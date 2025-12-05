/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.poli.edu.electrodomesticos;

/**
 *
 * @author ASUS
 */
public class Televisor extends Electrodomestico{
    private double pulgadas;
    private boolean sintonizador;

    private static double PULGADAS_DEF = 20;
    private static boolean SINTONIZADOR_DEF = false;

    //constructor por defecto
    public Televisor() {
        super();
        this.pulgadas = PULGADAS_DEF;
        this.sintonizador = SINTONIZADOR_DEF;

    }

    public Televisor(double precioBase, double peso) {
        super(precioBase, peso);
        this.pulgadas = PULGADAS_DEF;
        this.sintonizador = SINTONIZADOR_DEF;
    }

    public Televisor(double precioBase, String color, char consumoEnergetico, double peso, double pulgadas, boolean sintonizador) {
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (pulgadas > 40) {
            precio += precio * 0.30;
        }
        if (this.sintonizador) {
            precio += 50;
        }
        return precio;
    }
}
