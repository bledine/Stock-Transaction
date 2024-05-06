public class Broker
{
    private String licenseNum;
    private String brokerName;
    private double comission;
    private ArrayList<String> brokerCustomers = new ArrayList<>();
    private ArrayList<Transaction> brokerTransactions = new ArrayList<>();
  //constructor
  public Broker(String licenseNum, String brokerName)
  {
    this.licenseNum = licenseNum;
    this.brokerName = brokerName;
  }
  public void setLicenseNum(String licenseNum)
  {
    this.licenseNum = licenseNum;
  }
  public void setBrokerName(String brokerName)
  {
    this.brokerName = brokerName;
  }
  public String getLicenseNum()
  {
    return licenseNum;
  }
  public String getBrokerName()
  {
    return brokerName;
  }
  public void purchase(String transactionId, Stock stock, double price, String customerName)
  {
    String transactionType = "purchase";
    Transaction buy = new Transaction(transactionId, transactionType, stock, price, brokerName, customerName);
    //update transaction and customer list and cash balance
    brokerTransactions.add(buy);
    brokerCustomers.add(customerName);
    comission += (price*0.02); 
    Customer.updateCustomerInfo(transactionType, price, stock);
  
    //update company stock holders
    Company.updateStockHolders(transactionType, customerName);
  }
  
  public void sell(String transactionId, Stock stock, double price, String customerName)
  {
    String transactionType = "sell";
    Transaction sell = new Transaction(transactionId, transactionType, stock, price, brokerName, customerName);
    //update transaction and customer list and cash balance
    brokerTransactions.add(sell);
    brokerCustomers.add(customerName);
    comission += (price*0.02); 
    Customer.updateCustomerInfo(transactionType, price, stock);
  
    //update company stock holders
    Company.updateStockHolders(transactionType, customerName);
  }
  //print information
  public void printBrokerInfo()
  {
    System.out.print("Broker name: " +brokerName + "\nLicense #:"+ licenseNum + "\nTotal comission: $" + comission + "\nCustomer list: ");
    for (String str : brokerCustomers)
      {
        System.out.print(str + " ");
      }
    System.out.println("\nStock transaction: ");
    for (Transaction trans : brokerTransactions)
      {
        trans.printTransactionInfo();
      } 
  }
}