package manager;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CManager {
    private static final Logger logger = Logger.getLogger(CManager.class.getName()); // Logger instance

    private List<String> cList = new ArrayList<>();
    private List<String> oList = new ArrayList<>();

    // Adds a customer to the list
    public void aC(String n) {
        cList.add(n);
        if (logger.isLoggable(java.util.logging.Level.INFO)) { // Check if INFO level is enabled
            logger.info(String.format("Added customer: %s", n)); // Log only if INFO level is enabled
        }
    }

    // Adds an order to the list
    public void aO(String o) {
        oList.add(o);
        if (logger.isLoggable(java.util.logging.Level.INFO)) { // Check if INFO level is enabled
            logger.info(String.format("Order added: %s", o)); // Log only if INFO level is enabled
        }
    }

    // Processes all orders for a specific customer
    public void pO(String c) {
        if (logger.isLoggable(java.util.logging.Level.INFO)) { // Check if INFO level is enabled
            logger.info(String.format("Processing orders for: %s", c)); // Log only if INFO level is enabled
        }
        for (int i = 0; i < oList.size(); i++) {
            if (logger.isLoggable(java.util.logging.Level.INFO)) { // Check if INFO level is enabled
                logger.info(String.format("Processing order: %s", oList.get(i))); // Log only if INFO level is enabled
            }
        }
    }

    // Generates a summary report for customers and orders
    public void gR() {
        if (logger.isLoggable(java.util.logging.Level.INFO)) { // Check if INFO level is enabled
            logger.info("Customer Report"); // Log only if INFO level is enabled
        }
        for (int i = 0; i < cList.size(); i++) {
            if (logger.isLoggable(java.util.logging.Level.INFO)) { // Check if INFO level is enabled
                logger.info(String.format("Customer: %s", cList.get(i))); // Log only if INFO level is enabled
            }
        }
        if (logger.isLoggable(java.util.logging.Level.INFO)) { // Check if INFO level is enabled
            logger.info("Order Report"); // Log only if INFO level is enabled
        }
        for (int i = 0; i < oList.size(); i++) {
            if (logger.isLoggable(java.util.logging.Level.INFO)) { // Check if INFO level is enabled
                logger.info(String.format("Order: %s", oList.get(i))); // Log only if INFO level is enabled
            }
        }
    }

    public static void main(String[] args) {
        CManager m = new CManager();
        m.aC("John Doe");
        m.aC("Jane Smith");
        m.aO("Order1");
        m.aO("Order2");
        m.pO("John Doe");
        m.gR();
    }
}
