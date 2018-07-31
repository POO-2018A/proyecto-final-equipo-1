/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.Serializable;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Maragarita
 */
public class ClsJuego implements Serializable{
    Jugador jugadores;
    Personaje personaje;

   
    public ClsJuego(Jugador jugadores, Personaje personaje) {
        this.jugadores = jugadores;
        this.personaje = personaje;
    }

    public Jugador getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador jugadores) {
        this.jugadores = jugadores;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }
       
}
