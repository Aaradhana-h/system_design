package design_patterns.creational.factory.notification_factory.models;

import design_patterns.creational.factory.notification_factory.interfaces.ITransportChannel;

public class Sms_transportChannel implements ITransportChannel {

    @Override
    public void transportChannel() {
        System.out.println("SMS transportChannel");
    }
}
