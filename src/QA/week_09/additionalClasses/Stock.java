package QA.week_09.additionalClasses;

public class Stock {
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    public Stock(String symbol,String name,double previousClosingPrice,double currentPrice) {
        this.symbol=symbol;
        this.name=name;
        this.previousClosingPrice=previousClosingPrice;
        this.currentPrice=currentPrice;
    }
    public double getChangePercent(){
        return 100*(currentPrice/previousClosingPrice-1);
    }
}
