/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lasalle.interfase;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Interfase {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("--- Datos del músico ---");
        System.out.print("Nombre: ");
        String nombreMusico = sc.nextLine();
        System.out.print("Instrumento: ");
        String instrumento = sc.nextLine();
        Musico musico = new Musico(nombreMusico, instrumento);

        System.out.println("\n--- Datos del concierto ---");
        System.out.print("Nombre del evento: ");
        String nombreEvento = sc.nextLine();
        System.out.print("Lugar: ");
        String lugar = sc.nextLine();
        Concierto concierto = new Concierto(nombreEvento, lugar);

        System.out.println("\n--- Probando la interfaz TocaMusica ---");
        musico.tocar();
        concierto.tocar();

        sc.close();
    }
}
