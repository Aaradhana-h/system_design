package design_patterns.creational.factory.notification_factory.models;

import design_patterns.creational.factory.notification_factory.interfaces.ISendNotification;

public class Sms_sendNotification implements ISendNotification {

    @Override
    public void sendNotification() {
        System.out.println("SMS sendNotification");
    }
}
