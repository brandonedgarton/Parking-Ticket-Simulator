public class TicketIssuer {
    public ParkingTicket patrol(ParkedCar car, ParkingMeter meter, PoliceOfficer officer) {
        ParkingTicket ticket = null;
        int overtime = car.getMinutesParked() - meter.getMinutesPurchased();

        if (overtime > 0) {
            ticket = new ParkingTicket(car, officer, overtime);
        }
        return ticket;
    }
}
