/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proyecto;

/**
 *
 * @author leo
 */
public class Sistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Administrador admin = new Administrador("leo","hola");
 
        if (!admin.login("leo", "hola")) {
            System.out.println("Error de autenticacion.");
            return;
        }
        Interesado i1 = new Interesado(12345678, 987654321,"Maria", "maria@gmail.com", "Externo");
        Interesado i2 = new Interesado(87654321, 933119156,"Leo", "leo@gmail.com", "Interno");
        Dependencia d1 = new Dependencia("Mesa de Partes", "D001");
        Expediente e1 = new Expediente("EXP001", "Solicitud de titulo", "DOC123", 1, i1);
        Seguimiento s1 = new Seguimiento("2025-06-24 08:00", d1);
        Expediente e2 = new Expediente("EXPO002","Solicitud cambiar carrera","DOC223",2,i2);
        // Registrar expediente
        System.out.println("Funcion 1 registrar expediente\n");
        admin.registrarExpediente(e1);
        admin.registrarExpediente(e2);

        // Agregar seguimiento
        System.out.println("Funcion 2 agregar seguimiento\n");
        admin.movimientoAgregar("EXP001", s1);

        // Consultar seguimiento
        System.out.println("Funcion 3 consultar seguimiento\n");
        admin.movimientoImprimir("EXP001");
        admin.movimientoImprimir("EXPO002");

        // Finalizar expediente
        System.out.println("Funcion 4 finalizar tramite expediente\n");
        admin.finalizarTramite("EXP001");

        // Ver todos los expedientes
        System.out.println("Funcion 5 imprimir TODOS expedientes\n");
        admin.imprimirExpedientes();
    }
    
}
