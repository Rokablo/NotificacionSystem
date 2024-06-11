// NotificacionFactory.java
package com.empresa.notificaciones;

public class NotificacionFactory {
    public Notificacion crearNotificacion(String tipo) {
        switch (tipo) {
            case "EMAIL":
                return new EmailNotificacion();
            case "SMS":
                return new SMSNotificacion();
            case "APP":
                return new AppNotificacion();
            default:
                throw new IllegalArgumentException("Tipo de notificación no soportado.");
        }
    }
}
// NotificacionFactory.java
package com.empresa.notificaciones;

public interface NotificacionFactory {
    Notificacion crearEmailNotificacion();
    Notificacion crearSMSNotificacion();
    Notificacion crearAppNotificacion();
}
