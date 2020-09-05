package Patern.StaticFactory;

public class Notification {
    private Boolean notification;
    private Boolean incomingPayment;
    private Boolean payOut;

    private Notification(Boolean notification, Boolean incomingPayment, Boolean payOut) {
        this.notification = notification;
        this.incomingPayment = incomingPayment;
        this.payOut = payOut;
    }

    public static Notification deafoult() {
        return new Notification(true, false, false);

    }
}
