/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_luiscastro;

/**
 *
 * @author lfern
 */
public class CursosenLinea {
    String titulo;
    String instructor;
    int semanas;
    String plataforma;

    public CursosenLinea(String titulo, String instructor, int semanas, String plataforma) {
        this.titulo = titulo;
        this.instructor = instructor;
        this.semanas = semanas;
        this.plataforma = plataforma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "CursosenLinea:\n" + "Titulo= " + titulo + "\nInstructor= " + instructor + "\nSemanas= " + semanas + "\nPlataforma= " + plataforma + "\n";
    }
    
    
}
