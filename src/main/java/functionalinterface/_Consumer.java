package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        // Normal Java Function
       Customer corey = new Customer("Corey", "(302) 555-5555");
       greetCustomer(corey);

       // Consumer Functional Interface
       greetCustomerConsumer.accept(corey);

       // BiConsumer Functional Interface
       greetCustomerConsumerV2.accept(corey, false);

       greetCustomerV2(corey, false);
    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) -> System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + (showPhoneNumber ? customer.customerPhoneNumber : "********"));

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber){
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + (showPhoneNumber ? customer.customerPhoneNumber : "********"));
    }










    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
