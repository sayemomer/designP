// Target interface for AC devices
interface ACDevice {
    void powerWithAC();
}

// Adaptee interface for DC devices
interface DCDevice {
    void powerWithDC();
}

// Concrete AC device
class ACDeviceImpl implements ACDevice {
    public void powerWithAC() {
        System.out.println("Powered with AC.");
    }
}

// Concrete DC device
class DCDeviceImpl implements DCDevice {
    public void powerWithDC() {
        System.out.println("Powered with DC.");
    }
}

// Two-Way Adapter
class PowerAdapter implements ACDevice, DCDevice {
    private ACDevice acDevice;
    private DCDevice dcDevice;

    public PowerAdapter(ACDevice acDevice) {
        this.acDevice = acDevice;
    }

    public PowerAdapter(DCDevice dcDevice) {
        this.dcDevice = dcDevice;
    }

    // Implementing ACDevice interface
    public void powerWithAC() {
        if (dcDevice != null) {
            // Convert DC to AC
            System.out.println("Converting DC to AC.");
            dcDevice.powerWithDC();
        } else {
            acDevice.powerWithAC();
        }
    }

    // Implementing DCDevice interface
    public void powerWithDC() {
        if (acDevice != null) {
            // Convert AC to DC
            System.out.println("Converting AC to DC.");
            acDevice.powerWithAC();
        } else {
            dcDevice.powerWithDC();
        }
    }
}

public class PowerAdapterDemo {
    public static void main(String[] args) {
        ACDevice acDevice = new ACDeviceImpl();
        DCDevice dcDevice = new DCDeviceImpl();

        PowerAdapter adapterForAC = new PowerAdapter(acDevice);
        adapterForAC.powerWithDC(); // Converting AC to DC

        PowerAdapter adapterForDC = new PowerAdapter(dcDevice);
        adapterForDC.powerWithAC(); // Converting DC to AC
    }
}
