/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lasalle.dependencia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Dependencia {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("--- Datos del gimnasio ---");
    System.out.println("tipo gimnasio:");
    String tipo=sc.nextLine();
    System.out.println("horario");
    String horario=sc.nextLine();
    
    Gimnasio g = new Gimnasio(tipo,horario);
    
    System.out.println("\n--- Datos de la persona ---");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        String edad = sc.nextLine();

        Persona p = new Persona(nombre, edad);

        System.out.println("\n--- Probando la dependencia ---");
        p.entrenar(g);
        p.pagarsuscripcion(g);

        sc.close();
    }
}
