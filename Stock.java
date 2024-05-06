public class Stock
{
    String stockSymbol;
    double stockPrice;
    //constructor
    public Stock(String stockSymbol, double stockPrice)
    {
        this.stockSymbol = stockSymbol;
        this.stockPrice = stockPrice;
    }
    //setters
    public void setStockSymbol(String stockSymbol)
    {
         this.stockSymbol = stockSymbol;
    }
    public void setStockPrice(double stockHolders)
    {
        this.stockPrice = stockPrice;
    }
    //getters
    public String getStockSymbol()
    {
        return stockSymbol;
    }
    public double getStockPrice()
    {
        return stockPrice;
    }
}