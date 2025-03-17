// TODO: package, any includes, class declaration, constructor
//       and the methods performAction and update.

package edu.ucalgary.oop

public class SmartThermostat extends SmartDevice<Integer> {
    public SmartThermostat(String name, int initialTemperature) {
        this.name = name;
        this.state = initialTemperature;
    }

    @Override
    public void update(String message) {
        if ("Sleep".equals(message)) {
            setState(18);
            System.out.println(name + " is set to 18°C. Adjusting temperature.");
        } else if ("Vacation".equals(message)) {
            setState(20);
            System.out.println(name + " is set to 20°C. Adjusting temperature.");
        }
    }

    @Override
    public void performAction(Integer newTemperature) {
        setState(newTemperature);
        System.out.println(name + " is set to " + newTemperature + "°C. Adjusting temperature.");
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
