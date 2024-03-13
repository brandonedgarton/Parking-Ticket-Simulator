public class ParkingMeter 
{
    private int minutesPurchased;

    public ParkingMeter()
    {
        minutesPurchased = 0;
    }

    public ParkingMeter(int min)
    {
        minutesPurchased = min;
    }

    public int getMinutesPurchased()
    {
        return minutesPurchased;
    }

}
