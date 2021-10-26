package Section8.Exercise45;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers= new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double transaction){
        Customer customer = findCustomer(name);
        if(customer==null && !name.isBlank()) return customers.add(new Customer(name, transaction));
        else return false;
    }

    public boolean addCustomerTransaction(String name, double transaction){
        Customer customer = findCustomer(name);
        if (customer!=null){
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name){
        for(Customer e: customers){
            if(e.getName()==name){
                return e;
            }
        }
        return null;
    }
}
