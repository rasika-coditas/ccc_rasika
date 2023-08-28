public class CryptocurrencyApplication {

    public static void main(String[] args) {
        try {
            Cryptocurrency cryptocurrency=new Cryptocurrency("Test",4354,"Test","Test");
            if(!cryptocurrency.getName().equals("Test")){
                throw new InvalidCurrencyNameException("Invalid name");
            }

            DailyPriceChangeDisplay dailyPriceChangeDisplay = new DailyPriceChangeDisplay();
            dailyPriceChangeDisplay.displayPriceChanges(cryptocurrency);

        }
        catch (InvalidCurrencyNameException invalidCurrencyNameException){
            System.out.println(invalidCurrencyNameException.getMessage());
        }

    }
}
