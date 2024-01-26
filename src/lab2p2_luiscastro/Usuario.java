/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_luiscastro;

/**
 *
 * @author lfern
 */
public class Usuario {
    String nombre_usuario;
    String contra;
    String tipo_usuario;

    public Usuario(String nombre_usuario, String contra, String tipo_usuario) {
        this.nombre_usuario = nombre_usuario;
        this.contra = contra;
        this.tipo_usuario = tipo_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre_usuario=" + nombre_usuario + ", contra=" + contra + ", tipo_usuario=" + tipo_usuario + '}';
    }
}
