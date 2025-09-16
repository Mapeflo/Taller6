/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6;

/**
 *
 * @author marya
 */
public class Moto extends Vehiculo {
    
    protected double cilindrada;

    public Moto(double cilindrada, String tipo, String marca) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    
    }  
    public void mostrarDetalles() {
        System.out.println("Tipo: " + tipo+ "Marca: " + marca+ "Cilindrada");
}
}
