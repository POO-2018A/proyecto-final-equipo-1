/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.Serializable;
import java.util.Objects;
public class Jugador implements Serializable{
    private String nombre;
    private String apellido;
    private String cedula;
    private String login;
            

        
    public Jugador(String cedula, String login) {
        this.cedula = cedula;
        this.login = login;
    }

    public Jugador(String nombre, String apellido, String cedula, String login) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.login = login;
       
    }

    public Jugador() {
    }

    
    

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return   login ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        
        return true;
    }
    
}
