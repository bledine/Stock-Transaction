public class Company {
  // variables
  private String name;
  private String location;
  private Stock stock;
  int shares;
  static ArrayList<String> stockHolders = new ArrayList<>();

  // Constructor
  public Company(String name, String location, Stock stock, int shares) {
    this.name = name;
    this.location = location;
    this.stock = stock;
    this.shares = shares;
  }

  // setters
  public void setName(String name) {
    this.name = name;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public void setStock(Stock stock) {
    this.stock = stock;
  }

  public void setShares(int shares) {
    this.shares = shares;
  }

  public void updateStockHolders(String newHolder) {
    stockHolders.add(newHolder);
  }

  // getters
  public String getName() {
    return name;
  }

  public String getLocation() {
    return location;
  }

  public Stock getStock()
  {
   return stock;
  }
   
  public int getShares() {
    return shares;
  }

  public ArrayList<String> getStockHolders() {
    return stockHolders;
  }

  public static void updateStockHolders(String transactionType, String customerName)
  {
    if (transactionType.equals("purchase"))
    {
      stockHolders.add(customerName);
    }
    else
    {
      stockHolders.remove(customerName);
    }
  }
  public void printCompanyInfo()
  {
    System.out.println("\nCompany name: " + name + "\nLocation: " + location + "\nStock symbol: " + stock.getStockSymbol() + ", Price: " + stock.getStockPrice() + "\nStock Holders: ");
    for (String str : stockHolders)
      {
        System.out.print(str + ". ");
      }
    System.out.println();
  }
}