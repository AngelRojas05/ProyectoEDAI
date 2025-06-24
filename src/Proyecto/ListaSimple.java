/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author leo
 */
public class ListaSimple {
    private NodoSimple primero,frente;
    int contador = 0;

    public ListaSimple() {
        
    }

    public void agregarAlFinal(Seguimiento elemento) {
        NodoSimple nuevo = new NodoSimple(elemento);
        if (primero == null) {
            primero = nuevo;
            frente = nuevo;
        } 
        else {
            frente.siguiente = nuevo;
            frente = nuevo;
        }
    }

    public void imprimir() {
        NodoSimple actual = primero;
        while (actual != null) {
            System.out.println(actual.elemento.mostrarMovimiento());
            actual = actual.siguiente;
        }
    }
}
