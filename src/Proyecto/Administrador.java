/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author leo
 */
public class Administrador {
    private String usuario,clave;
    private ListaDoble listaExpedientes;

    public Administrador(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
        this.listaExpedientes = new ListaDoble();
    }
    
    public boolean login(String nombreU, String contra){
        return nombreU==usuario && contra==clave;
    }
    
    public void registrarExpediente(Expediente expe){
        
        listaExpedientes.insertarAlFinal(expe);
        System.out.println("Registro correcto de expediente");
    }
    
    public void movimientoAgregar(String id, Seguimiento seguimiento){
        
        Expediente expeEncontrar = listaExpedientes.buscadorID(id);
        if(expeEncontrar != null){
            expeEncontrar.agregarMovimiento(seguimiento);
            System.out.println("Seguimiento agregado");
        }
        else{
            System.out.println("Expediente no encontrado");
        }
    }
    
    public void movimientoImprimir(String id){
        
        Expediente expeEncontrar = listaExpedientes.buscadorID(id);
        if(expeEncontrar != null){
            expeEncontrar.mostrarSeguimiento();
        }
        else{
            System.out.println("Expediente no encontrado");
        }
    }
    
    public void finalizarTramite(String id){
        
        Expediente expeEncontrar = listaExpedientes.buscadorID(id);
        if(expeEncontrar != null){
            expeEncontrar.finalizarTramite();
            System.out.println("Tramite del Expediente: " + id + " finalizado correctamente");
        }
        else{
            System.out.println("Expediente no encontrado");
        }
    }
    
    public void imprimirExpedientes(){
        listaExpedientes.recorrer();
    }
    
}
