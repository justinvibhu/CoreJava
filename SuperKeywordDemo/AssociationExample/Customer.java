package AssociationExample;

public class Customer {
    private String customerId;
    private  String customerName;
    private String location;

    public Customer(String customerId, String customerName, String location) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.location = location;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
