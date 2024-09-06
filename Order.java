// Order.java
public class Order {
    private OrderDetails orderDetails;

    public Order(OrderDetails orderDetails){
        this.orderDetails = orderDetails;
    }

    public void displayOrderDetails() {
        showOrderIdAndCustomerId();
        showOrderAmount();
    }

    private void showOrderIdAndCustomerId() {
        System.out.println("Order ID: " + orderDetails.getOrderId());
        System.out.println("Customer ID: " + orderDetails.getCustomerId());
    }

    private void showOrderAmount(){
        System.out.println("Amount: $" + orderDetails.getAmount());
    }


    public OrderDetails getOrderDetails() {
        return orderDetails;
    }
    public void setOrderDetails(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

}
