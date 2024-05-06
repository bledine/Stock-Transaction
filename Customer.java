public class Customer
{
    private String customerId;
    private String customerName;
    private Broker broker;
    private static double availableCash;
    private static ArrayList<StockHolding> stockHolding = new ArrayList<>();
    //constructor
    public Customer(String customerId, String customerName, Broker broker, double availableCash)
    {
        this.customerId = customerId;
        this.customerName = customerName;
        this.broker = broker;
        this.availableCash = availableCash;
    }
    //setters
    public void setCutomerId(String customerId)
    {
        this.customerId = customerId; 
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    public void setBroker(Broker broker)
    {
        this.broker = broker; 
    }
    public void setAvailableCash(double availableCash)
    {
        this.availableCash = availableCash; 
    }
    //getters
    public String getCustomerId()
    {
        return customerId;
    }
    public String getCustomerName()
    {
        return customerName;
    }
    public double getAvailableCash()
    {
        return availableCash;
    }
    //update cashbalance
  public static void updateCustomerInfo(String transactionType, double transactionPrice, Stock stock)
  {
    if (transactionType.equals("purchase"))
    {
    availableCash -= (transactionPrice);
    StockHolding newStock = new StockHolding(stock.stockSymbol, (transactionPrice-transactionPrice*0.02)/stock.stockPrice); 
      stockHolding.add(newStock);
      }
    else 
    {
      availableCash += (transactionPrice*0.98);
    }
    
  }
  //customer stock and holding position class
  public static class StockHolding
    {
      private String stockName;
      private double numShares;
      public StockHolding(String stockSymbol, double numShares)
      {
        this.stockName = stockSymbol;
        this.numShares = numShares;
      }
      public void setStockName(String stockSymbol)
      {
        this.stockName = stockSymbol;
      }
      public void setNumShares(double numShares)
      {
        this.numShares = numShares;
      }
      public String getStockName()
      {
        return stockName;
      }
      public double getNumShares()
      {
        return numShares;
      }
      public void printInfo()
      {
        System.out.printf(stockName + ", %.2f shares.", numShares);
      }
    }
  public void printCustomerInfo()
  {
    System.out.println("\nCustomer name: " + customerName + "\nId: " + customerId + "\nBroker: " + broker.getBrokerName() + "\nCash balance: $" + availableCash + "\nStock holdings: ");
    for (StockHolding stock : stockHolding)
      {
        stock.printInfo();      }
    System.out.println();
  }
}