public class Transaction
{
    private String transactionId;
    private String transactionType;
    private Stock transaction;
    private double transactionPrice;
    private String transactionBroker;
    private String transactionCustomer;
  //constructor
  public Transaction(String transactionId, String transactionType, Stock transaction, double transactionPrice, String transactionBroker, String transactionCustomer)
  {
    this.transactionId = transactionId;
    this.transactionType = transactionType;
    this.transaction = transaction;
    this.transactionPrice = transactionPrice;
    this.transactionBroker = transactionBroker;
    this.transactionCustomer = transactionCustomer;
  }
  public void printTransactionInfo()
  {
    System.out.println("Transaction ID: " + transactionId + ", Transaction Type: " + transactionType + ", Transaction Price: $" + transactionPrice + ", Transaction Broker: " + transactionBroker + ", Transaction Customer: " + transactionCustomer);
  }
}