// 2. Smart Notification System
// Scenario:
// A company sends notifications to users through different channels such as
// Email, SMS, and Push Notification.
// Create a superclass Notification with:
// ● Instance variables:
// ○ String recipientName
// ○ String message
// ● Method:
// ○ sendNotification()

// Create subclasses:
// ● EmailNotification
// ● SMSNotification
// ● PushNotification
// Each subclass should override sendNotification() and display
// channel-specific messages.
// Requirements:
// 1. Store multiple notification objects in a Notification[] array.
// 2. Take recipient names as strings.
// 3. Use dynamic method dispatch to send notifications.
// 4. Display all sent notifications.
public class ScenarioBased2 {
    public static void main(String[] args) {
        Notification[] notifications = new Notification[3];
        notifications[0] = new EmailNotification("Alice", "Your order has been shipped.");
        notifications[1] = new SMSNotification("Bob", "Your appointment is confirmed.");
        notifications[2] = new PushNotification("Charlie", "You have a new message.");

        for (Notification notification : notifications) {
            notification.sendNotification();
        }
    }
    
}

// Superclass
abstract class Notification {
    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    abstract void sendNotification();
}

// Subclasses
class EmailNotification extends Notification {
    EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("[Email] To: " + recipientName + " | Message: " + message);
    }
}

class SMSNotification extends Notification {
    SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("[SMS] To: " + recipientName + " | Message: " + message);
    }
}

class PushNotification extends Notification {
    PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("[Push] To: " + recipientName + " | Message: " + message);
    }
}
