/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.asociacion;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Persona {
     private String nombre;
    private List<Juego> juegos = new ArrayList<>();

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void jugar(Juego j) {
        juegos.add(j);
        j.agregarJugador(this);
    }

    public List<Juego> getJuegos() {
        return juegos;
    }
}
