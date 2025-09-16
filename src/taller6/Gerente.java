/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6;

/**
 *
 * @author marya
 */
public class Gerente extends Empleado {
 
 protected String departamento;

    public Gerente(String departamento, String nombre, double salario) {
        super(nombre, salario);
        this.departamento = departamento;
    }

 @Override
    protected void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Gerente-Departamento: " + departamento);
       
    }
}