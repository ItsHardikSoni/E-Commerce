public class Order {
    int orderID;
    String orderByCustomer;
    String orderAddress;
    long orderPhone;
    String orderEmail;

    Order(int orderID, String orderByCustomer, String orderAddress, long orderPhone, String orderEmail) {
        this.orderID = orderID;
        this.orderByCustomer = orderByCustomer;
        this.orderAddress = orderAddress;
        this.orderPhone = orderPhone;
        this.orderEmail = orderEmail;
    }

    void OrderDetails() {
        System.out.println("Order Details");
        System.out.println("Order ID: " + orderID);
        System.out.println("Order Address: " + orderAddress);
        System.out.println("Order Phone: " + orderPhone);
        System.out.println("Order Email: " + orderEmail);
    }
}
