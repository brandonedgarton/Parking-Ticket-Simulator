public class PoliceOfficer {
    private String name;
    private String badgeNumber;

    public PoliceOfficer(String n, String badNum) {
        name = n;
        badgeNumber = badNum;
    }

    public PoliceOfficer(PoliceOfficer cop2) {
        name = cop2.name;
        badgeNumber = cop2.badgeNumber;
    }

    public void setName(String n) {
        name = n;
    }

    public void setBadgeNumber(String badNum) {
        badgeNumber = badNum;
    }

    public String getName() {
        return name;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public String toString() {
        String str = "Name: " + name +
                "\nBadge Number: " + badgeNumber;
        return str;
    }
}
