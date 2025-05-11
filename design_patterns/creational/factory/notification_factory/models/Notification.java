package design_patterns.creational.factory.notification_factory.models;

import design_patterns.creational.factory.notification_factory.interfaces.ISendNotification;
import design_patterns.creational.factory.notification_factory.interfaces.ITransportChannel;

public abstract class Notification {

    private ISendNotification iSendNotification;
    private ITransportChannel iTransportChannel;

    public Notification(ISendNotification iSendNotification, ITransportChannel iTransportChannel) {
        this.iSendNotification = iSendNotification;
        this.iTransportChannel = iTransportChannel;
    }

    public void sendNotification(){
        iSendNotification.sendNotification();
    }

    public void transportChannel(){
        iTransportChannel.transportChannel();
    }
}
