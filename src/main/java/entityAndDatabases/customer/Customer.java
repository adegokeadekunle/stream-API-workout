package entityAndDatabases.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private int id;
    private  String name;
    private String email;
    private List<String> phoneNumber;
    private double balance;
}
