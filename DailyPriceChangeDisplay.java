public class DailyPriceChangeDisplay implements PriceChange{

    @Override
    public void displayPriceChanges(Cryptocurrency cryptocurrency) {
        // Calculate and display daily price change
        System.out.println("Daily Price Change for " + cryptocurrency.getName());

    }

    private double calculateDailyChange(Cryptocurrency cryptocurrency) {
        // Mock calculation
        return Math.random();
    }


}
