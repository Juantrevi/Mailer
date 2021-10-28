/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailer;

import Controlador.Controlador;
import Controlador.Entidades;

public class Mailer {

    public static void main(String[] args) {

        Entidades c = new Entidades();

        c.setContrasena("");
        c.setUsuario("xxxxxxx@gmail.com");
        c.setAsunto("xxx");
        c.setMensaje("xxxx: ");
        c.setDestino("xxxxx@gmail.com");
        c.setNombreArchivo("");
        c.setRutaArchivo("");
        Controlador co = new Controlador();
        if (co.enviarCorreo(c)) {
            System.out.println("Se envio");
        } else {
            System.out.println("No se envio");

        }

    }

}
