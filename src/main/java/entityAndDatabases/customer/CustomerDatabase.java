package entityAndDatabases.customer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CustomerDatabase {

    public static List<Customer> getAllCustomers(){
        return  Stream.of(new Customer(1,"Nelson","nelson@gmail.com", Arrays.asList("08023453455","080445556666"),25000),
                new Customer(1,"Nelson","nelson@gmail.com", Arrays.asList("080355737373"),10000),
                new Customer(2,"Samuel","samuel@gmail.com", Arrays.asList("08098893833","090998939393"),50000),
                new Customer(3,"Samson","samson@gmail.com", Arrays.asList("080989399355","0804956666"),200000),
                new Customer(4,"Kenneth","kenneth@gmail.com", Arrays.asList("0802389393455","08049006666"),89000),
                new Customer(5,"Joel","joel@gmail.com", Arrays.asList("080278923455","08040956666"),12000),
                new Customer(6,"Gabriel","gabrieln@gmail.com", Arrays.asList("0802900455","0804458066"),33000),
                new Customer(7,"Carl","carl@gmail.com", Arrays.asList("08023453872","080445556690"),32000),
                new Customer(8,"Harrison","harrison@gmail.com", Arrays.asList("0802543455","08089006666"),45000),
                new Customer(9,"Raquel","raquel@gmail.com", Arrays.asList("0808378325","08049096666"),19000),
                new Customer(10,"Jao","jaoson@gmail.com", Arrays.asList("080239003","080445509866"),76000)

        ).toList();
    }
}
