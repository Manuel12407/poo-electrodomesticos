/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.poli.edu.electrodomesticos;

/**
 *
 * @author SALON206
 */
public class ElectrodomesticosMain {

    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[3];
        electrodomesticos[0] = new Lavadora();
        electrodomesticos[1] = new Lavadora(150,50);
        electrodomesticos[2] = new Televisor(135, 10);
        
        for(Electrodomestico e : electrodomesticos){
            System.out.println("Electrodomestico; "+e.getPrecioBase()+
                   e.getPeso()+e.getConsumoEnergetico()+e.getColor()+"Electrodomestico: "+e.getPrecioBase()
                    +e.getPeso()+e.getConsumoEnergetico()+e.getColor());
        }
    }
}
