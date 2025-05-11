package design_patterns.creational.factory.notification_factory;

import design_patterns.creational.factory.notification_factory.enums.Notification_type;
import design_patterns.creational.factory.notification_factory.factories.Notification_factory;
import design_patterns.creational.factory.notification_factory.models.Notification;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creating notification factory");

        Notification n1= Notification_factory.createNotification(Notification_type.EMAIL);
        n1.sendNotification();
        n1.transportChannel();
        Notification n2= Notification_factory.createNotification(Notification_type.SMS);
        n2.sendNotification();
        n2.transportChannel();
        Notification n3= Notification_factory.createNotification(Notification_type.PUSH_NOTIFICATION);
        n3.sendNotification();
        n3.transportChannel();
        Notification n4= Notification_factory.createNotification(Notification_type.INVALID);
        n4.sendNotification();
        n4.transportChannel();


    }
}
