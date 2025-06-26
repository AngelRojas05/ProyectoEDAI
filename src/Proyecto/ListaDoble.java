/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author leo
 */
public class ListaDoble {
    private NodoDoble primero,frente;

    public ListaDoble() {
        
    }

    public void insertarAlFinal(Expediente elemento) {
        NodoDoble nuevo = new NodoDoble(elemento);
        if (primero == null) {
            primero = nuevo;
            frente = nuevo;
        }
        else {
            frente.siguiente = nuevo;
            nuevo.previo = frente;
            frente = nuevo;
        }
    }

    public Expediente buscadorID(String id) {
        NodoDoble actual = primero;
        
        while (actual != null){
            if(actual.elemento.getId() == id) {
                return actual.elemento;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    public void recorrer() {
        NodoDoble actual = primero;
        
        while (actual != null) {
            System.out.println("ID: " + actual.elemento.getId() + " | Asunto: " + actual.elemento.getAsunto() + " | Fecha Fin: " + actual.elemento.getFechaFin());
            actual = actual.siguiente;
        }
    }
}
