// TODO: package, any includes, class declaration, constructor
//       and the methods performAction and update.
package edu.ucalgary.oop;

class SmartLight extends SmartDevice {
    private boolean state; //use T?
    @Override
    public void update(String message) {
        switch (message) {
            case "Sleep":
                setState(false);
                break;
            case "Vacation":
                setState(Math.random() < 0.5); // Randomly turn ON/OFF
                break;
            default:
                System.out.println("SmartLight: Unknown message - " + message);
        }
    }

    public void dim(int percentage) {
        if (getState()) {
            System.out.println("Dimming the light to " + percentage + "%.");
        } else {
            System.out.println("Cannot dim the light. It is currently OFF.");
        }
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

}
