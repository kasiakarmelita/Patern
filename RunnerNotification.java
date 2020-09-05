package Patern;

import Patern.StaticFactory.Notification;

public class RunnerNotification {
    public static void main(String[] args) {
        /*Notification notification = new Notification(false, false,true);*/
        Notification notification1 = Notification.deafoult();
    }
}
