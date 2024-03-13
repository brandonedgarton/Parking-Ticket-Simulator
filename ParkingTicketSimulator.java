public class ParkingTicketSimulator {
    public static void main(String[] args) {
        ParkedCar car = new ParkedCar("Mercedes", "G Wagon", "Black", "CLNWHIP", 225);

        ParkingMeter meter = new ParkingMeter(60);

        PoliceOfficer officer = new PoliceOfficer("Rob Smith", "3322");

        TicketIssuer issuer = new TicketIssuer();
        ParkingTicket ticket = issuer.patrol(car, meter, officer);

        if (ticket != null) {
            System.out.print(ticket);
        } else {
            System.out.print("Law Abiding Citizen!");
        }
    }
}
