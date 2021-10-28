package Controlador;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Controlador {

    public boolean enviarCorreo(Entidades c) {

        try {
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.port", "587"); //587
            props.put("mail.smtp.user", c.getUsuario());
            props.put("mail.smtp.auth", "true");

            Session s = Session.getDefaultInstance(props, null);
            BodyPart texto = new MimeBodyPart();
            texto.setText(c.getMensaje());
            BodyPart adjunto = new MimeBodyPart();

            if (!c.getRutaArchivo().equals("")) {
                adjunto.setDataHandler(new DataHandler(new FileDataSource(c.getRutaArchivo())));
                adjunto.setFileName(c.getNombreArchivo());
            }

            MimeMultipart m = new MimeMultipart();
            m.addBodyPart(texto);
            if (!c.getRutaArchivo().equals("")) {
                m.addBodyPart(adjunto);
            }

            MimeMessage mensaje = new MimeMessage(s);
            mensaje.setFrom(new InternetAddress(c.getUsuario()));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(c.getDestino()));
            mensaje.setSubject(c.getAsunto());
            mensaje.setContent(m);

            try (Transport t = s.getTransport("smtp")) {
                t.connect(c.getUsuario(), c.getContrasena());
                t.sendMessage(mensaje, mensaje.getAllRecipients());
            }
            return true;

        } catch (Exception e) {
            System.out.println("Error " + e);
            return false;
        }
    }
}
