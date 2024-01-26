/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_luiscastro;

/**
 *
 * @author lfern
 */
public class Libros {
    String titulo;
    String autor;
    String genero;
    String año_publicacion;
    String disponibilidad;

    public Libros(String titulo, String autor, String genero, String año_publicacion, String disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.año_publicacion = año_publicacion;
        this.disponibilidad = disponibilidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAño_publicacion() {
        return año_publicacion;
    }

    public void setAño_publicacion(String año_publicacion) {
        this.año_publicacion = año_publicacion;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Libros: \n" + "Titulo= " + titulo + "\nAutor= " + autor + "\nGenero= " + genero + ", \nA\u00f1o_publicacion= " + año_publicacion + "\nDisponibilidad=" + disponibilidad + "\n";
    }
      
}
