public class Cryptocurrency {

    private String name;
    private Integer currentPrice;
    private String marketCap;
    private String volume;

    public Integer getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Integer currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cryptocurrency(String name,Integer currentPrice, String marketCap, String volume) {
        this.name=name;
        this.currentPrice = currentPrice;
        this.marketCap = marketCap;
        this.volume = volume;
    }


}
