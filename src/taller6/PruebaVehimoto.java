/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6;

/**
 *
 * @author marya
 */
public class PruebaVehimoto {
    public static void main(String[] args) {
        
        Moto moto = new Moto(60000,"Deportiva","suzuki");
        
        moto.mostrarDetalles();
        
        Vehiculo vehiculo = new Vehiculo("Familiar", "Kia");
        
        vehiculo.tipo = "Carga";
        vehiculo.marca = "Renoult";
    }
}
