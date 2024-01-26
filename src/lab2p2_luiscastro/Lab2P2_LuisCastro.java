/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_luiscastro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lfern
 */
public class Lab2P2_LuisCastro {
static Scanner leer = new Scanner(System.in);
static Scanner leerS = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario estudiante = new Usuario("Juan", "soyJuan123", "Estudiante");
        Usuario profesor = new Usuario("Rigoberto","cienciasdelasalud03","Profesor");
        Usuario bibliotecario = new Usuario("Luis","Bibliotecario789","Bibliotecario");
        
        String tipo = "";
        System.out.println("Inicio de sesion.");
        System.out.println("Ingrese su nombre: ");
        String nombre = leerS.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String contra = leerS.nextLine();
        
        
        if(nombre.equals(estudiante.getNombre_usuario())&& contra.equals(estudiante.getContra())){
            tipo = "Estudiante";
        }else if(nombre.equals(profesor.getNombre_usuario())&& contra.equals(profesor.getContra())){
            tipo = "Profesor";
        }else if(nombre.equals(bibliotecario.getNombre_usuario())&& contra.equals(bibliotecario.getContra())){
            tipo = "Bibliotecario";
        }else{
            System.out.println("Su nombre o contraseña no concuerda con ningun usuario.");
        }
        System.out.println("*****Menu*****");
        System.out.println("1. Listar Recursos.");
        System.out.println("2. Crear Recursos. (Profesores y Bibliotecarios)");
        System.out.println("3. Eliminar Recursos. (Bibliotecarios)");
        System.out.println("4. Modificar Recursos. (Bibliotecarios)");
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
