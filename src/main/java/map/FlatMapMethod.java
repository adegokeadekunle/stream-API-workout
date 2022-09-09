package map;

import entityAndDatabases.customer.Customer;
import entityAndDatabases.customer.CustomerDatabase;

import java.util.List;

public class FlatMapMethod {

    public static void main(String[] args) {

        List<Customer> customer = CustomerDatabase.getAllCustomers();

        List<String> phoneNumbers = customer.stream().flatMap(c -> c.getPhoneNumber().stream()).toList();
        System.out.println(phoneNumbers);

        //performing filter operation on flatmap
        List<String> phoneNumbers2 = customer.stream()
                .filter(num -> num.getPhoneNumber().contains("08098893833"))
                .flatMap(c -> c.getPhoneNumber().stream()).toList();
        System.out.println(phoneNumbers2);

//        List<String> phoneNumbers3  = customer.stream().flatMap( e -> e.getPhoneNumber().stream()).toList();
    }
}
