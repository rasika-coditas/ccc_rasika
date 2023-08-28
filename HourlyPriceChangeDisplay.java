public class HourlyPriceChangeDisplay implements PriceChange{

    @Override
    public void displayPriceChanges(Cryptocurrency cryptocurrency) {
        // Calculate and display hourly price change
        System.out.println("Hourly Price Change for " +cryptocurrency.getName());
    }

    private double calculateHourlyChange(Cryptocurrency cryptocurrency) {
        // Mock calculation
        return Math.random();
    }
}
