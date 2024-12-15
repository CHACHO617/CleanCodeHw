package manager;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * The CustomerOrderManager class manages customers and orders, providing functionality
 * to add customers, add orders, process orders for a specific customer, and generate
 * reports for customers and orders. It uses a logger to log actions and errors.
 */
public class CustomerOrderManager {

    // Logger instance to log messages at different levels
    private static final Logger logger = Logger.getLogger(CustomerOrderManager.class.getName());

    // Private lists for customers and orders
    private List<String> customerList = new ArrayList<>();
    private List<String> orderList = new ArrayList<>();

    /**
     * Adds a customer to the customer list.
     * 
     * @param customerName The name of the customer to be added.
     */
    public void addCustomer(String customerName) {
        try {
            // Check for null or empty customer name
            if (customerName == null || customerName.trim().isEmpty()) {
                throw new IllegalArgumentException("Customer name cannot be null or empty.");
            }
            customerList.add(customerName);
            // Log the action if INFO level logging is enabled
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(String.format("Added customer: %s", customerName));
            }
        } catch (IllegalArgumentException e) {
            logger.severe("Error adding customer: " + e.getMessage());
        }
    }

    /**
     * Adds an order to the order list.
     * 
     * @param orderName The name of the order to be added.
     */
    public void addOrder(String orderName) {
        try {
            // Check for null or empty order name
            if (orderName == null || orderName.trim().isEmpty()) {
                throw new IllegalArgumentException("Order name cannot be null or empty.");
            }
            orderList.add(orderName);
            // Log the action if INFO level logging is enabled
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(String.format("Order added: %s", orderName));
            }
        } catch (IllegalArgumentException e) {
            logger.severe("Error adding order: " + e.getMessage());
        }
    }

    /**
     * Processes all orders for a specific customer.
     * 
     * @param customerName The name of the customer whose orders are to be processed.
     */
    public void processOrdersForCustomer(String customerName) {
        try {
            // Check for null or empty customer name
            if (customerName == null || customerName.trim().isEmpty()) {
                throw new IllegalArgumentException("Customer name cannot be null or empty.");
            }
            // Check if customer exists in the list
            if (!customerList.contains(customerName)) {
                throw new IllegalArgumentException("Customer does not exist.");
            }

            // Log the action if INFO level logging is enabled
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(String.format("Processing orders for: %s", customerName));
            }

            // Process all orders
            for (int i = 0; i < orderList.size(); i++) {
                // Log each order processing if INFO level logging is enabled
                if (logger.isLoggable(java.util.logging.Level.INFO)) {
                    logger.info(String.format("Processing order: %s", orderList.get(i)));
                }
            }
        } catch (IllegalArgumentException e) {
            logger.severe("Error processing orders for customer: " + e.getMessage());
        }
    }

    /**
     * Generates a report of all customers.
     */
    private void generateCustomerReport() {
        // Log the start of the customer report if INFO level logging is enabled
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info("Customer Report");
        }
        for (String customer : customerList) {
            // Log each customer in the report if INFO level logging is enabled
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(String.format("Customer: %s", customer));
            }
        }
    }

    /**
     * Generates a report of all orders.
     */
    private void generateOrderReport() {
        // Log the start of the order report if INFO level logging is enabled
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info("Order Report");
        }
        for (String order : orderList) {
            // Log each order in the report if INFO level logging is enabled
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(String.format("Order: %s", order));
            }
        }
    }

    /**
     * Generates a full report that includes both customer and order reports.
     * This method calls generateCustomerReport and generateOrderReport methods.
     */
    public void generateFullReport() {
        try {
            // Generate customer and order reports
            generateCustomerReport();
            generateOrderReport();
        } catch (Exception e) {
            logger.severe("Error generating full report: " + e.getMessage());
        }
    }

    /**
     * The main method where the CustomerOrderManager is executed with sample data.
     * 
     * @param args Command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        // Create an instance of CustomerOrderManager
        CustomerOrderManager manager = new CustomerOrderManager();
        // Add customers and orders
        manager.addCustomer("John Doe");
        manager.addCustomer("Jane Smith");
        manager.addOrder("Order1");
        manager.addOrder("Order2");
        // Process orders for a customer
        manager.processOrdersForCustomer("John Doe");
        // Generate the full report
        manager.generateFullReport();
    }
}