/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.Serializable;

/**
 *
 * @author Maragarita
 */
public class Personaje implements Serializable{
    
    private double vida;
    private double estamina;
    private String nombre;
    private String elemento;

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public Personaje(double vida, double estamina, String nombre, String elemento) {
        this.vida = vida;
        this.estamina = estamina;
        this.nombre = nombre;
        this.elemento = elemento;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getEstamina() {
        return estamina;
    }

    public void setEstamina(double estamina) {
        this.estamina = estamina;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
