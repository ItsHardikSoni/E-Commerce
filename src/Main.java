public class Main {
    public static void main(String[] args) {
        Product product = new Product(42323,"Charger",300);
        Order order = new Order(43443,"Hardik Soni","Patna",9661850789L,"hardiksoni019@gmail.com");
        Customer customer = new Customer(35533,"Hardik Soni","Patna",9661850789L,"hardiksoni019@gmail.com");

        customer.PrintCustomer();
        System.out.println();
        product.PrintProduct();
        System.out.println();
        order.OrderDetails();
    }
}