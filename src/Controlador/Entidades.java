package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Manuel
 */
public class Entidades {
    
    private String usuario;
    private String nombreArchivo;
    private String contrasena;
    private String rutaArchivo;
    private String destino;
    private String asunto;
    private String mensaje;

    public Entidades() {
    }

    public Entidades(String usuario, String nombreArchivo, String contrasena, String rutaArchivo, String destino, String asunto, String mensaje) {
        this.usuario = usuario;
        this.nombreArchivo = nombreArchivo;
        this.contrasena = contrasena;
        this.rutaArchivo = rutaArchivo;
        this.destino = destino;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
