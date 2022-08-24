package AssociationExample;

import java.beans.Customizer;
import java.util.ArrayList;

public class ABXBank {
    private String IFSC_codw;
    private String location;
    private ArrayList<Customer> customers;

    public ABXBank(String iFSC_codw, String location, ArrayList<Customer> customers) {
      IFSC_codw = iFSC_codw;
        this.location = location;
        this.customers = customers;
    }

    public String getIFSC_codw() {
        return IFSC_codw;
    }

    public void setIFSC_codw(String IFSC_codw) {
        this.IFSC_codw = IFSC_codw;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }


    public String addCustomer(Customer cust){
        for(Customer c :customers){
            if(c.getCustomerId()==cust.getCustomerId()){
                return "Customer Not Added. Already Existing.";

            }

        }
        customers.add(cust);
        return "Customer Added";
    }

    public String searchCustomer( Customer cust){
        for( Customer c: customers){
            if(c.getCustomerId()==cust.getCustomerId()){
                return "Customer Found";
            }
        }
        return "customer not found.";

    }
}
