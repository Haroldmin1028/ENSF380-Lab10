package edu.ucalgary.oop;
import java.util.ArrayList;
import java.util.List;

public class SmartHome <T> {
    private List<SmartDevice<?>> devices = new ArrayList<>();
    private boolean isBuilt = false;

    // Add a device (allowed before build)
    public SmartHome addDevice(SmartDevice<?> device) {
        // TODO: Implement addDevice functionality
        if (!this.isBuilt) {
            devices.add(device);
        }

        return this; //devices?
    }

    // Build the SmartHome (finalizes the setup)
    public SmartHome build() {
        // TODO: Implement build functionality
        if (!this.isBuilt && !devices.isEmpty()) {
            this.isBuilt = true;
        }
        return this;
    }

    // Set device state (only allowed after build)
    public void setDeviceState(SmartDevice<T> device, T state) {
        // TODO: Implement setDeviceState functionality
        if (!this.isBuilt) {
            throw new IllegalArgumentException("Cannot set device state before build");
        }
        else {device.setState(state);}
    }

    // Send overarching messages (only allowed after build)
    public void sendMessage(String message) {
        // TODO: Implement sendMessage functionality
        for (SmartDevice<?> device : devices) {
            device.update(message);
        }
    }
}
