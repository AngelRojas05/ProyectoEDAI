/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author leo
 */
public class Interesado {
    private int dni,telefono;
    private String nombres,email,tipo;

    public Interesado(int dni, int telefono, String nombres, String email, String tipo) {
        this.dni = dni;
        this.telefono = telefono;
        this.nombres = nombres;
        this.email = email;
        this.tipo = tipo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String mostrarInteresado(){
        return nombres + " | Tipo: " + tipo + " | DNI : " + dni +
                " | Email: " + email + " | Telefono: " + telefono;
    }
}
