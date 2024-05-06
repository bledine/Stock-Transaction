import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

class Main {
  public static void main(String[] args) {
    //initialize company
    Stock appleStock = new Stock("Apple Inc", 13.5);
    Company apple = new Company("Apple", "California", appleStock, 1000);
    //initialize broker
    Broker vanguard = new Broker("12345", "Vanguard");
    //initialize customer
    Customer tom = new Customer("243", "Jerry Tom", vanguard, 10000.0);
    //Print out information befor transaction
    vanguard.printBrokerInfo();
    apple.printCompanyInfo();
    tom.printCustomerInfo();
    //buy stocks
    vanguard.purchase("01001", appleStock, 2000, tom.getCustomerName());
    //Print out Information for broker company and customer after transaction
    vanguard.printBrokerInfo();
    apple.printCompanyInfo();
    tom.printCustomerInfo();
  }
}