public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;

    public ParkedCar() {
        make = "";
        model = "";
        color = "";
        licenseNumber = "";
        minutesParked = 0;
    }

    public ParkedCar(String mke, String modl, String clr, String licNum, int min) {
        make = mke;
        model = modl;
        color = clr;
        licenseNumber = licNum;
        minutesParked = min;
    }

    /*
     * public ParkedCar(ParkedCar car2) {
     * make = car2.make;
     * model = car2.model;
     * color = car2.color;
     * licenseNumber = car2.licenseNumber;
     * minutesParked = car2.minutesParked;
     * }
     */

    public ParkedCar copy() {
        return new ParkedCar(make, model, color, licenseNumber, minutesParked);
    }

    public void setMake(String mke) {
        make = mke;
    }

    public void setModel(String modl) {
        model = modl;
    }

    public void setColor(String clr) {
        color = clr;
    }

    public void setLicenseNumber(String licNum) {
        licenseNumber = licNum;
    }

    public void setMinutesParked(int min) {
        minutesParked = min;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getMinutesParked() {
        return minutesParked;
    }

    public String toString() {
        String str = "Make: " + make +
                "\nModel: " + model +
                "\nColor: " + color +
                "\nLicense Number: " + licenseNumber +
                "\nMinutes Parked: " + minutesParked;

        return str;
    }
}
