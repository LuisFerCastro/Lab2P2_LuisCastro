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
        ArrayList recursos = new ArrayList();
        ArrayList<Usuario> usuarios = new ArrayList();
        Usuario estudiante = new Usuario("Juan", "soyJuan123", "Estudiante");
        Usuario profesor = new Usuario("Rigoberto","cienciasdelasalud03","Profesor");
        Usuario bibliotecario = new Usuario("Luis","Bibliotecario789","Bibliotecario");
        usuarios.add(estudiante);
        usuarios.add(profesor);
        usuarios.add(bibliotecario);
        
        String tipo = "";
        int cont = 0;
        while(cont == 0){
            System.out.println("Inicio de sesion.");
            System.out.println("Ingrese su nombre: ");
            String nombre = leerS.nextLine();
            System.out.println("Ingrese su contraseña: ");
            String contra = leerS.nextLine();
            for(int i = 0; i < usuarios.size();i++){
                if(nombre.equals(estudiante.getNombre_usuario())&& contra.equals(estudiante.getContra())){
                    tipo = "Estudiante";
                    cont++;
                    if(cont == 1){
                        break;
                    }
                }else if(nombre.equals(profesor.getNombre_usuario())&& contra.equals(profesor.getContra())){
                    tipo = "Profesor";
                    cont++;
                    if(cont == 1){
                        break;
                    }
                }else if(nombre.equals(bibliotecario.getNombre_usuario())&& contra.equals(bibliotecario.getContra())){
                    tipo = "Bibliotecario";
                    cont++;
                    if(cont == 1){
                        break;
                    }
                }else{
                    cont = 0;
                }
                if (cont == 0){
                    System.out.println("Usuario invalido! Ingrese de nuevo: ");
                }
            }
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
                    if(recursos.isEmpty()){
                        System.out.println("No hay ningun recurso para mostrar!");
                    }else{
                        System.out.println(recursos);
                    }
                    break;
                case 2:
                    if(tipo.equals(estudiante.getTipo_usuario())){
                        System.out.println("Solo los profesores y bibliotecarios pueden usar esta opcion!");
                        break;
                    }else{
                        System.out.println("****Menu de agregar****");
                        System.out.println("1. Libros.");
                        System.out.println("2. Articulos.");
                        System.out.println("3. Curso en Linea.");
                        System.out.println("4. Conferencias virtuales.");
                        System.out.println("Ingrese su opcion: ");
                        int opcion_agregar = leer.nextInt();
                        
                        while(opcion_agregar > 0 && opcion_agregar <5){
                            switch(opcion_agregar){
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                            }
                        }
                    }
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
