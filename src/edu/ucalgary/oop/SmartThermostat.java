// TODO: package, any includes, class declaration, constructor
//       and the methods performAction and update.

package edu.ucalgary.oop;


public class SmartThermostat extends SmartDevice<Integer> {

    public SmartThermostat() {
        setState(20);
    }

    @Override
    public void update(String message) {
        if ("Sleep".equals(message)) {
            setState(18);
            System.out.println(message);
        } else if ("Vacation".equals(message)) {
            setState(20);
            System.out.println(message);
        }
    }

    public void adjustTemperature(int desiredTemp) {
        int currentTemp = getState();
        int difference = desiredTemp - currentTemp;

        if (difference > 0) {
            System.out.println("Increasing temperature by " + difference + "°C.");
        } else if (difference < 0) {
            System.out.println("Decreasing temperature by " + Math.abs(difference) + "°C.");
        } else {
            System.out.println("Temperature is already at the desired level.");
        }

        setState(desiredTemp);
    }
}