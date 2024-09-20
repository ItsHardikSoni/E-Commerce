public class Customer {
    int customerID;
    String customerName;
    String customerAddress;
    long customerPhone;
    String customerEmail;

    Customer(int customerID, String customerName, String customerAddress, long customerPhone, String customerEmail) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
    }

    void PrintCustomer() {
        System.out.println("Customer ID: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Customer Phone: " + customerPhone);
        System.out.println("Customer Email: " + customerEmail);
    }
}