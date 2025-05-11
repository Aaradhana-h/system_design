package design_patterns.creational.factory.notification_factory.models;

import design_patterns.creational.factory.notification_factory.interfaces.ISendNotification;
import design_patterns.creational.factory.notification_factory.interfaces.ITransportChannel;

public class EmailNotification extends Notification {
    public EmailNotification(ISendNotification iSendNotification, ITransportChannel iTransportChannel) {
        super(iSendNotification,iTransportChannel);

    }
}
