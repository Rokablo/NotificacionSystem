package com.empresa.notificaciones;

public class EmailNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando email: " + mensaje);
    }
}
