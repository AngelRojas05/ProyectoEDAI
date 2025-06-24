/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author leo
 */
public class Seguimiento {
    private String fecha;
    private Dependencia dependencia;

    public Seguimiento(String fecha, Dependencia dependencia) {
        this.fecha = fecha;
        this.dependencia = dependencia;
    }

    public String getFecha() {
        return fecha;
    }

    public Dependencia getDependencia() {
        return dependencia;
    }

    public String mostrarMovimiento(){
        return("Fecha del movimiento: " + fecha +
                "\nDependencia destino: " + dependencia.mostrarDependencia());
    }
    
}
