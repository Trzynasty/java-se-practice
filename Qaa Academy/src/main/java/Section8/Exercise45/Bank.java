package Section8.Exercise45;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name){
        Branch branch = findBranch(name);
        if(branch==null) return branches.add(new Branch(name));
        else return false;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction){
        Branch branch = findBranch(name);
        if (branch!=null){
            branch.newCustomer(customerName,transaction);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if (branch!=null){
            branch.addCustomerTransaction(customerName, transaction);
            return true;
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean doPrintTransactions){
        Branch branch = findBranch(branchName);
        if (branch!=null){
            System.out.println("Customer details for branch "+branchName);
            int i=1;
            for(Customer e: branch.getCustomers()){
                System.out.println("Customer: "+ e.getName()+"["+i+"]");
                i++;
                if(doPrintTransactions){
                    int j=1;
                    for (Double d: e.getTransactions()){
                        System.out.println("["+j+"] Amount "+d.toString());
                        j++;
                    }
                }
            }
            return true;
        }
        return false;
    }

    private Branch findBranch(String name){
        for(Branch e: branches){
            if(e.getName()==name){
                return e;
            }
        }
        return null;
    }
}
