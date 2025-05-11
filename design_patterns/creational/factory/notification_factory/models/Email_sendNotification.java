package design_patterns.creational.factory.notification_factory.models;

import design_patterns.creational.factory.notification_factory.interfaces.ISendNotification;

public class Email_sendNotification implements ISendNotification {


    @Override
    public void sendNotification() {
        System.out.println("Email sendNotification");
    }
}
