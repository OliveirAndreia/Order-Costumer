package com.example.yourproject;

public class Customer {
    private CustomerDetails customerDetails;

    public Customer(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public void displayCustomerDetails() {
        showBasicCustomerInfo();
        printContactInfo();
    }

    private void showBasicCustomerInfo() {
        System.out.println("Customer ID: " + customerDetails.getCustomerId());
        System.out.println("Name: " + customerDetails.getName());
    }

    private void printContactInfo() {
        System.out.println("Email: " + customerDetails.getEmail());
        System.out.println("Phone Number: " + customerDetails.getPhoneNumber());
    }

    public void applyDiscountToOrder(Order order, double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100) {
            double amount = order.getOrderDetails().getAmount();
            order.getOrderDetails().setAmount(amount - (amount * discountPercentage / 100));
        }
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }
}
