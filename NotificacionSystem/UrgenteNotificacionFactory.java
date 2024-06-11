// UrgenteNotificacionFactory.java
package com.empresa.notificaciones;

public class UrgenteNotificacionFactory implements NotificacionFactory {
    @Override
    public Notificacion crearEmailNotificacion() {
        return new EmailNotificacion(); // Lógica específica para urgentes si es necesario
    }

    @Override
    public Notificacion crearSMSNotificacion() {
        return new SMSNotificacion(); // Lógica específica para urgentes si es necesario
    }

    @Override
    public Notificacion crearAppNotificacion() {
        return new AppNotificacion(); // Lógica específica para urgentes si es necesario
    }
}

