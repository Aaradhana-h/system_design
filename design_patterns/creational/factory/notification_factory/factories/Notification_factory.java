package design_patterns.creational.factory.notification_factory.factories;

import design_patterns.creational.factory.notification_factory.enums.Notification_type;
import design_patterns.creational.factory.notification_factory.models.*;

public class Notification_factory {

    public static Notification createNotification(Notification_type type) {
        return switch (type) {
            case EMAIL -> new EmailNotification(new Email_sendNotification(), new Email_transportChannel());
            case SMS -> new SmsNotification(new Sms_sendNotification(), new Sms_transportChannel());
            case PUSH_NOTIFICATION ->
                    new PushNotification(new PushNotification_sendNotification(), new PushNotification_transportChannel());
            default -> throw new IllegalArgumentException("Unsupported notification type: " + type);
        };
    }
}
