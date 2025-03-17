// TODO: package, any includes, class declaration, constructor
//       and the methods performAction and update.

package edu.ucalgary.oop

public class SmartLock extends SmartDevice<Boolean> {
    public SmartLock(String name) {
        this.name = name;
        this.state = true;
    }

    @Override
    public void update(String message) {
        switch (message.toLowerCase()) {
            case "sleep":
            case "vacation":
                setState(true); 
                System.out.println(name + " is LOCKED. Securing the door.");
                break;
            default:
                break;
        }
    }

    @Override
    public void performAction(String action) {
        switch (action.toLowerCase()) {
            case "lock":
                setState(true);
                System.out.println(name + " is LOCKED. Securing the door.");
                break;
            case "unlock":
                setState(false);
                System.out.println(name + " is UNLOCKED. Door is open.");
                break;
            case "auto lock":
                autoLock(10); 
                break;
            default:
                System.out.println("Invalid action for SmartLock.");
                break;
        }
    }

    public void autoLock(int delayInSeconds) {
        System.out.println("Auto-lock enabled. Door will lock in " + delayInSeconds + " seconds.");
        new Thread(() -> {
            try {
                Thread.sleep(delayInSeconds * 1000L);
                setState(true);
                System.out.println("Door auto-locked.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
