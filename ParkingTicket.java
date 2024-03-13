import java.text.DecimalFormat;

public class ParkingTicket {
    private ParkedCar car;
    private PoliceOfficer officer;
    private double fine;
    private int minutes;

    public final double BASE_FINE = 25.00;
    public final double HOURLY_FINE = 10.00;

    public ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer, int min) {
        car = new ParkedCar(aCar);
        officer = new PoliceOfficer(anOfficer);
        minutes = min;

        calculateFine();
    }

    public ParkingTicket(ParkingTicket ticket2) {
        car = new ParkedCar(ticket2.car);
        officer = new PoliceOfficer(ticket2.officer);
        fine = ticket2.fine;
    }

    private void calculateFine() {
        double hours = minutes / 60;

        int hoursAsInt = (int) hours;

        if ((hours - hoursAsInt) > 0) {
            hoursAsInt++;
        }

        fine = BASE_FINE;
        fine += (hoursAsInt + 1) * HOURLY_FINE;
    }

    public void setCar(ParkedCar c) {
        car = new ParkedCar(c);
    }

    public void setOfficer(PoliceOfficer po) {
        officer = new PoliceOfficer(po);
    }

    public void setFine(double f) {
        fine = f;
    }

    public ParkedCar getCar() {
        return new ParkedCar(car);
    }

    public PoliceOfficer getOfficer() {
        return new PoliceOfficer(officer);
    }

    public double getFine() {
        return fine;
    }

    public String toString() {
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        String str = "Car Data: \n" + car +
                "\nOfficer Data: " + officer +
                "\nMinutes Illegally Parked: " + minutes +
                "\nFine: " + dollar.format(fine);
        return str;
    }
}
