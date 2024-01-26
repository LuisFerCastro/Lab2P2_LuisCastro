/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_luiscastro;

import java.util.Scanner;

/**
 *
 * @author lfern
 */
public class Lab2P2_LuisCastro {
static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("*****Menu*****");
        System.out.println("1. Listar Recursos.");
        System.out.println("2. Crear Recursos. (Profesores y Bibliotecarios)");
        System.out.println("3. Eliminar Recursos. (Bibliotecarios)");
        System.out.println("4. Modificar Recursos.");
        System.out.println("5. Salir.");
        System.out.println("Ingrese su numero: ");
        int opcion = leer.nextInt();
        while(opcion !=5){
            switch(opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }//FIN DEL SWITCH
            System.out.println("*****Menu*****");
            System.out.println("1. Listar Recursos.");
            System.out.println("2. Crear Recursos. (Profesores y Bibliotecarios)");
            System.out.println("3. Eliminar Recursos. (Bibliotecarios)");
            System.out.println("4. Modificar Recursos.");
            System.out.println("5. Salir.");
            System.out.println("Ingrese su numero: ");
            opcion = leer.nextInt();
        }//FIN DEL WHILE
    }
    
}
