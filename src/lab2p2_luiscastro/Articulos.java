/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_luiscastro;

import java.util.Date;

/**
 *
 * @author lfern
 */
public class Articulos {
    String titulo;
    String autor;
    String tema;
    Date fecha_publicacion;
    String acceso_linea;

    public Articulos(String titulo, String autor, String tema, Date fecha_publicacion, String acceso_linea) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.fecha_publicacion = fecha_publicacion;
        this.acceso_linea = acceso_linea;
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

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Date getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(Date fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getAcceso_linea() {
        return acceso_linea;
    }

    public void setAcceso_linea(String acceso_linea) {
        this.acceso_linea = acceso_linea;
    }

    @Override
    public String toString() {
        return "Articulos: \n" + "Titulo= " + titulo + "\nAutor= " + autor + "\nTema= " + tema + "\nFecha_publicacion= " + fecha_publicacion + "\nAcceso_linea= " + acceso_linea + "\n";
    }
    
    
}
