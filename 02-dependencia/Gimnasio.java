/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.dependencia;

/**
 *
 * @author Usuario
 */
public class Gimnasio {
    private String tipo;
    private String horario;
    
    public Gimnasio(String tipo, String horario){
        this.tipo=tipo;
        this.horario=horario;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public String getHorario() {
        return horario;
    }
    public void abrir(){
        System.out.println("Gimnasio " + tipo + ", abierto " + horario);
    }
}

