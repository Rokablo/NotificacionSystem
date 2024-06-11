package com.empresa.notificaciones;

public class RegularNotificacionFactory implements NotificacionFactory {
    @Override
    public Notificacion crearEmailNotificacion() {
        return new EmailNotificacion(); // Lógica específica para regulares si es necesario
    }

    @Override
    public Notificacion crearSMSNotificacion() {
        return new SMSNotificacion(); // Lógica específica para regulares si es necesario
    }

    @Override
    public Notificacion crearAppNotificacion() {
        return new AppNotificacion(); // Lógica específica para regulares si es necesario
    }
}
