package design_patterns.creational.factory.notification_factory.models;

import design_patterns.creational.factory.notification_factory.interfaces.ITransportChannel;

public class PushNotification_transportChannel implements ITransportChannel {


    @Override
    public void transportChannel() {
        System.out.println("Push transportChannel");
    }
}
