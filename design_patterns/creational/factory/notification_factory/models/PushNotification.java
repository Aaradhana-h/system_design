package design_patterns.creational.factory.notification_factory.models;

import design_patterns.creational.factory.notification_factory.interfaces.ISendNotification;
import design_patterns.creational.factory.notification_factory.interfaces.ITransportChannel;

public class PushNotification extends Notification {
    public PushNotification(ISendNotification iSendNotification, ITransportChannel iTransportChannel) {
        super(iSendNotification,iTransportChannel);
    }
}
