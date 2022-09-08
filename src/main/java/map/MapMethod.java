package map;

import entityAndDatabases.customer.Customer;
import entityAndDatabases.customer.CustomerDatabase;

import java.util.List;

public class MapMethod {

    public static void main(String[] args) {

        List<Customer> customer = CustomerDatabase.getAllCustomers();

        //the map is used to get the string of emails from the data
        List<String > emails = customer.stream().map(cust -> cust.getEmail()).toList();
        //List<String > emails = customer.stream().map(Customer::getEmail).toList();  //using method reference
        System.out.println(emails);

        //getting balances
        List<Double > balance = customer.stream().map(cust -> cust.getBalance()).toList();
        System.out.println(balance);

        //performing math operation on balance adding 10% interest on balance
        List<Double > balance2 = customer.stream().map(cust ->cust.getBalance() + (cust.getBalance()* 0.01)).toList();
        System.out.println(balance2);

        // to get this you will have to get List of list because is has a list of phone numbers.
        List<List<String>> phone = customer.stream().map(cust -> cust.getPhoneNumber()).toList();
        System.out.println(phone);

    }
}
