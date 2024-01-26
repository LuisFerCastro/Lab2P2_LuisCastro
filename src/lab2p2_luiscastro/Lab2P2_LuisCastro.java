/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_luiscastro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
    public static void main(String[] args) throws ParseException {
        ArrayList recursos = new ArrayList();
        ArrayList nombre_recursos = new ArrayList();
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
            }
            if (cont == 0){
                    System.out.println("Usuario o contraseña invalido! Ingrese de nuevo: ");
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
                        System.out.println("5. Salir del submenu.");
                        System.out.println("Ingrese su opcion: ");
                        int opcion_agregar = leer.nextInt();
                        
                        while(opcion_agregar != 5){
                            switch(opcion_agregar){
                                case 1:
                                    System.out.println("Agregar libro.");
                                    System.out.println("Ingrese el titulo del libro:");
                                    String titulo_libro = leerS.nextLine();
                                    nombre_recursos.add(titulo_libro);
                                    
                                    System.out.println("Ingrese el autor del libro: ");
                                    String autor_libro = leerS.nextLine();
                                    
                                    System.out.println("Ingrese el genero del libro: ");
                                    String genero_libro = leerS.nextLine();
                                    
                                    System.out.println("Ingrese el año de publicacion: ");
                                    String anno_libro = leerS.nextLine();
                                    
                                    System.out.println("Ingrese la disponibilidad del libro:(si/no):");
                                    String disponibilidad_libro = leerS.nextLine();
                                    
                                    Libros libro = new Libros(titulo_libro, autor_libro, genero_libro, anno_libro, disponibilidad_libro);
                                    recursos.add(libro);
                                    break;
                                case 2:
                                    System.out.println("Agregar Articulo.");
                                    System.out.println("Ingrese el titulo del articulo:");
                                    String nombre_articulo = leerS.nextLine();
                                    nombre_recursos.add(nombre_articulo);
                                    
                                    System.out.println("Ingrese el autor del articulo: ");
                                    String autor_articulo = leerS.nextLine();
                                    
                                    System.out.println("Ingrese el tema del articulo: ");
                                    String tema_articulo = leerS.nextLine();
                                    
                                    System.out.println("Ingrese la fecha de publicacion del articulo en formato(dd/MM/yyyy): ");
                                    String fecha_articulo = leerS.nextLine();
                                    SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
                                    Date fecha = sf.parse(fecha_articulo);
                                    
                                    System.out.println("Ingrese el acceso en linea del articulo:(si/no):");
                                    String acceso_articulo = leerS.nextLine();
                                    
                                    Articulos articulo = new Articulos(nombre_articulo, autor_articulo, tema_articulo, fecha, acceso_articulo);
                                    recursos.add(articulo);
                                    break;
                                case 3:
                                    System.out.println("Agregar Curso en linea.");
                                    System.out.println("Ingrese el titulo del Curso en linea: ");
                                    String titulo_curso = leerS.nextLine();
                                    nombre_recursos.add(titulo_curso);
                                    
                                    System.out.println("Ingrese el nombre del instructor del curso: ");
                                    String nombre_instructor = leerS.nextLine();
                                    
                                    System.out.println("Ingrese la duracion en semanas del curso (numero):");
                                    int duracion_curso = leer.nextInt();
                                    
                                    System.out.println("Ingrese la plataforma de enseñanza: ");
                                    String plataforma = leerS.nextLine();
                                    
                                    CursosenLinea cursos = new CursosenLinea(titulo_curso, nombre_instructor, duracion_curso, plataforma);
                                    recursos.add(cursos);
                                    break;
                                case 4:
                                    System.out.println("Agregar Conferencias Virtuales.");
                                    System.out.println("Ingrese el titulo de la conferencia: ");
                                    String titulo_conferencia = leerS.nextLine();
                                    nombre_recursos.add(titulo_conferencia);
                                    
                                    System.out.println("Ingrese el nombre del conferencista: ");
                                    String nombre_conferencista = leerS.nextLine();
                                    
                                    System.out.println("Ingrese la fecha de la conferencia en formato dd/MM/yyyy");
                                    String fecha_c = leerS.nextLine();
                                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                                    Date fecha_con = sdf.parse(fecha_c);
                                    
                                    System.out.println("Ingrese la duracion de la conferencia: ");
                                    String duracion_con = leerS.nextLine();
                                    
                                    System.out.println("Ingrese el enlace de acesso de la conferencia: ");
                                    String enlace = leerS.nextLine();
                                    
                                    ConferenciasVir conferencias = new ConferenciasVir(titulo_conferencia, nombre_conferencista, fecha_con, duracion_con, enlace);
                                    recursos.add(conferencias);
                                    break;
                            }//FIN SWITCH OPCION 2
                            System.out.println("****Menu de agregar****");
                            System.out.println("1. Libros.");
                            System.out.println("2. Articulos.");
                            System.out.println("3. Curso en Linea.");
                            System.out.println("4. Conferencias virtuales.");
                            System.out.println("5. Salir del submenu.");
                            System.out.println("Ingrese su opcion: ");
                            opcion_agregar = leer.nextInt();
                        }// FIN WHILE OPCION 2
                    }
                    break;
                case 3:
                    if(tipo.equals(estudiante.getTipo_usuario())){
                        System.out.println("Solo los bibliotecarios pueden usar esta opcion!");
                        break;
                    }else if (tipo.equals(profesor.getTipo_usuario())){
                        System.out.println("Solo los bibliotecarios pueden usar esta opcion!");
                        break;
                    }else{
                        if(nombre_recursos.isEmpty()){
                            System.out.println("La lista de recursos esta vacia!");
                        }else{
                            imprimirNombres(nombre_recursos);
                            System.out.println("Ingrese el indice del recurso a eliminar.");
                            int index_elim = leer.nextInt();
                            while(index_elim < 0 || index_elim >= nombre_recursos.size()){
                                System.out.println("Indice fuera de rango. Ingrese de nuevo:");
                                index_elim = leer.nextInt();
                            }
                            nombre_recursos.remove(index_elim);
                            recursos.remove(index_elim);
                            System.out.println("Se ha eliminado el recurso exitosamente.");
                        }
                    }
                    break;
                case 4:
                    if(tipo.equals(estudiante.getTipo_usuario())){
                        System.out.println("Solo los bibliotecarios pueden usar esta opcion!");
                        break;
                    }else if (tipo.equals(profesor.getTipo_usuario())){
                        System.out.println("Solo los bibliotecarios pueden usar esta opcion!");
                        break;
                    }else if(nombre_recursos.isEmpty()){
                        System.out.println("La lista de recursos esta vacia!");
                    }else{
                        imprimirNombres(nombre_recursos);
                        System.out.println("Ingrese el indice del recurso a modificar.");
                        int index_modif = leer.nextInt();
                        while(index_modif < 0 || index_modif >= nombre_recursos.size()){
                                System.out.println("Indice fuera de rango. Ingrese de nuevo:");
                                index_modif = leer.nextInt();
                            }
                        if(recursos.get(index_modif) instanceof Libros){
                            System.out.println("Modificar libro.");
                            System.out.println("Ingrese el nuevo titulo del libro:");
                            String titulo_libro = leerS.nextLine();
                            nombre_recursos.set(index_modif, titulo_libro);
                            
                            ((Libros)recursos.get(index_modif)).setTitulo(titulo_libro);
                            
                            System.out.println("Ingrese el nuevo autor del libro: ");
                            String autor_libro = leerS.nextLine();
                            
                            ((Libros)recursos.get(index_modif)).setAutor(autor_libro);
                            
                            System.out.println("Ingrese el nuevo genero del libro: ");
                            String genero_libro = leerS.nextLine();
                            
                            ((Libros)recursos.get(index_modif)).setGenero(genero_libro);
                            
                            System.out.println("Ingrese el nuevo año de publicacion: ");
                            String anno_libro = leerS.nextLine();
                            
                            ((Libros)recursos.get(index_modif)).setAño_publicacion(anno_libro);
                            
                            System.out.println("Ingrese la nueva disponibilidad del libro:(si/no):");
                            String disponibilidad_libro = leerS.nextLine();
                            
                            ((Libros)recursos.get(index_modif)).setDisponibilidad(disponibilidad_libro);
                            
                        }else if(recursos.get(index_modif)instanceof Articulos){
                            System.out.println("Modificar Articulo.");
                                    System.out.println("Ingrese el nuevo titulo del articulo:");
                                    String nombre_articulo = leerS.nextLine();
                                    nombre_recursos.set(index_modif, nombre_articulo);
                                    
                                    ((Articulos)recursos.get(index_modif)).setTitulo(nombre_articulo);
                                    
                                    System.out.println("Ingrese el nuevo autor del articulo: ");
                                    String autor_articulo = leerS.nextLine();
                                    
                                    ((Articulos)recursos.get(index_modif)).setAutor(autor_articulo);
                                    
                                    System.out.println("Ingrese el nuevo tema del articulo: ");
                                    String tema_articulo = leerS.nextLine();
                                    
                                    ((Articulos)recursos.get(index_modif)).setTema(tema_articulo);
                                    
                                    System.out.println("Ingrese la nueva fecha de publicacion del articulo en formato(dd/MM/yyyy): ");
                                    String fecha_articulo = leerS.nextLine();
                                    SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
                                    Date fecha = sf.parse(fecha_articulo);
                                    
                                    ((Articulos)recursos.get(index_modif)).setFecha_publicacion(fecha);
                                    
                                    System.out.println("Ingrese el nuevo acceso en linea del articulo:(si/no):");
                                    String acceso_articulo = leerS.nextLine();
                                    
                                    ((Articulos)recursos.get(index_modif)).setAcceso_linea(acceso_articulo);
                                    
                        }else if(recursos.get(index_modif) instanceof CursosenLinea){
                            System.out.println("Modificar Curso en linea.");
                                    System.out.println("Ingrese el nuevo titulo del Curso en linea: ");
                                    String titulo_curso = leerS.nextLine();
                                    
                                    nombre_recursos.set(index_modif, titulo_curso);
                                    
                                    ((CursosenLinea)recursos.get(index_modif)).setTitulo(titulo_curso);
                                    
                                    System.out.println("Ingrese el nuevo nombre del instructor del curso: ");
                                    String nombre_instructor = leerS.nextLine();
                                    
                                    ((CursosenLinea)recursos.get(index_modif)).setInstructor(nombre_instructor);
                                    
                                    System.out.println("Ingrese la duracion en semanas del curso (numero):");
                                    int duracion_curso = leer.nextInt();
                                    
                                    ((CursosenLinea)recursos.get(index_modif)).setSemanas(duracion_curso);
                                    
                                    System.out.println("Ingrese la plataforma de enseñanza: ");
                                    String plataforma = leerS.nextLine();
                                    
                                    ((CursosenLinea)recursos.get(index_modif)).setPlataforma(plataforma);
                        }else{
                            System.out.println("Modificar Conferencias Virtuales.");
                                    System.out.println("Ingrese el titulo de la conferencia: ");
                                    String titulo_conferencia = leerS.nextLine();
                                    
                                    nombre_recursos.set(index_modif,titulo_conferencia);
                                    
                                    ((ConferenciasVir)recursos.get(index_modif)).setTitulo(titulo_conferencia);
                                    
                                    System.out.println("Ingrese el nombre del conferencista: ");
                                    String nombre_conferencista = leerS.nextLine();
                                    
                                    ((ConferenciasVir)recursos.get(index_modif)).setConferencista(nombre_conferencista);
                                    
                                    System.out.println("Ingrese la fecha de la conferencia en formato dd/MM/yyyy");
                                    String fecha_c = leerS.nextLine();
                                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                                    Date fecha_con = sdf.parse(fecha_c);
                                    
                                    ((ConferenciasVir)recursos.get(index_modif)).setFecha(fecha_con);
                                    
                                    System.out.println("Ingrese la duracion de la conferencia: ");
                                    String duracion_con = leerS.nextLine();
                                    
                                    ((ConferenciasVir)recursos.get(index_modif)).setDuracion(duracion_con);
                                    
                                    System.out.println("Ingrese el enlace de acesso de la conferencia: ");
                                    String enlace = leerS.nextLine();
                                    
                                    ((ConferenciasVir)recursos.get(index_modif)).setEnlace(enlace);
                        }
                    }
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
    
    public static void imprimirNombres(ArrayList nombre){
        System.out.println("Listas: ");
        for (int i = 0; i < nombre.size(); i++) {
            System.out.println(i+". "+nombre.get(i));
        }
    }
}
