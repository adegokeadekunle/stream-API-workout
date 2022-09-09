package optional;

import entityAndDatabases.customer.Customer;

import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        Customer customer = new Customer(100,"Mark",null, List.of("090877877"),20000);

        //empty
        Optional<Customer> emailEmptyOptional = Optional.empty();
        System.out.println(emailEmptyOptional);

        //ofNullable
        // this will return the object if it is present otherwise it will return empty
        Optional<String> emailOfNullableOptional = Optional.ofNullable(customer.getEmail());
        System.out.println(emailOfNullableOptional);

        //handling noSuchElementException
        if (emailOfNullableOptional.isPresent()){
            System.out.println(emailOfNullableOptional.get());
        }
        //using lambdas
        emailOfNullableOptional.ifPresent(System.out::println);

        //if you want to return some default values you can handle it like this.
        System.out.println(emailOfNullableOptional.orElse("default_email@gmail.com"));

        //using orElseGet
        System.out.println(emailOfNullableOptional.map(e -> e.toLowerCase()).orElseGet(() -> "unknown_user@gmail.com"));

        //throw an exception
        System.out.println(emailOfNullableOptional.orElseThrow(()-> new IllegalArgumentException("Field is null please enter a value")));

        //of
        //this will throw a null pointer exception if the object is not present or is null it works as both empty and of
        Optional<String> emailOfOptional = Optional.of(customer.getEmail());
        System.out.println(emailOfOptional);

    }
}
