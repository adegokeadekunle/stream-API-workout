
// TRADITIONAL METHOD OF CALLING INTERFACES
//public class O1CalculatorImplFunctionalInterface implements CalculatorInterface{
//
//    public static void main(String[] args) {
//        O1CalculatorImplFunctionalInterface calculator = new O1CalculatorImplFunctionalInterface();
//        calculator.switchOn();
//
//    }
//
//    @Override
//    public void switchOn() {
//        System.out.println("the calculator is on");
//    }
//}

public class O1CalculatorImplFunctionalInterface {

    public static void main(String[] args) {

//        CalculatorInterface classInterface = () -> {
//            System.out.println("the calculator is on");
//        };

        //since we have only one of statement to print, we don't need the bracket
        CalculatorInterface calculator = () -> System.out.println("The calculator is now on");
        calculator.switchOn();
        // we did not have to implement the interface to be able to access the methods.

      //  CalculatorAdd add = (int input) -> System.out.println(" the sum is : "+input);
        CalculatorAdd add = (input) -> System.out.println("The sum is : "+input); // we don't need to state the data type
        add.sum(56);

//        CalculatorSubtract subtract = (input1, input2) -> {
//            return input2 - input1;
//        };
        CalculatorSubtract subtract = (input1, input2) -> input2 - input1;  //since we are returning a single statement no need to use the return statement.
        System.out.println(subtract.subtract(67,87));

        CalculatorSubtract usingBusinessLogic = (input1, input2) -> {
            if (input2 >input1) {
                throw new RuntimeException("input2 should be less than input1");
            }

            return input1 - input2;
        };
        System.out.println(usingBusinessLogic.subtract(56,121));
    }
}
interface CalculatorInterface{
    void switchOn();
}
interface  CalculatorAdd{
    void sum(int input);
}
interface  CalculatorSubtract{
    int subtract(int input1, int input2);
}