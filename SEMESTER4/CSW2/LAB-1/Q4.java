class SIM {
    private String provider;
    private String number;

    public SIM(String provider, String number) {
        this.provider = provider;
        this.number = number;
    }

    public String getProvider() {
        return provider;
    }

    public String getNumber() {
        return number;
    }
}

class Mobile {
    private SIM sim;

    public void insertSIM(SIM sim) {
        this.sim = sim;
    }

    public void displaySIMInfo() {
        if (sim != null) {
            System.out.println("SIM Provider: " + sim.getProvider());
            System.out.println("SIM Number: " + sim.getNumber());
        } else {
            System.out.println("No SIM inserted.");
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        // Creating a SIM object
        SIM sim = new SIM("XYZ Telecom", "1234567890");

        // Creating a Mobile object
        Mobile mobile = new Mobile();

        // Inserting the SIM into the mobile
        mobile.insertSIM(sim);

        // Displaying SIM information
        mobile.displaySIMInfo();
    }
}
