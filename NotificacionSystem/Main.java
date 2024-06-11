// Main.java
package com.empresa.notificaciones;

public class Main {
    public static void main(String[] args) {
        // Uso de Factory Method
        NotificacionFactory factoryMethod = new NotificacionFactory();
        Notificacion notificacionEmail = factoryMethod.crearNotificacion("EMAIL");
        notificacionEmail.enviarMensaje("Hola desde email!");

        // Uso de Abstract Factory
        NotificacionFactory urgenteFactory = new UrgenteNotificacionFactory();
        Notificacion notificacionUrgenteEmail = urgenteFactory.crearEmailNotificacion();
        notificacionUrgenteEmail.enviarMensaje("Mensaje urgente desde email!");

        NotificacionFactory regularFactory = new RegularNotificacionFactory();
        Notificacion notificacionRegularSMS = regularFactory.crearSMSNotificacion();
        notificacionRegularSMS.enviarMensaje("Mensaje regular desde SMS!");
    }
}
