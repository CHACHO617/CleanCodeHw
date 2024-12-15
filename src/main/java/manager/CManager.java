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
        logger.info(String.format("Added customer: %s", n)); // Using String.format for formatting
    }

    // Adds an order to the list
    public void aO(String o) {
        oList.add(o);
        logger.info(String.format("Order added: %s", o)); // Using String.format for formatting
    }

    // Processes all orders for a specific customer
    public void pO(String c) {
        logger.info(String.format("Processing orders for: %s", c)); // Using String.format for formatting
        for (int i = 0; i < oList.size(); i++) {
            logger.info(String.format("Processing order: %s", oList.get(i))); // Using String.format for formatting
        }
    }

    // Generates a summary report for customers and orders
    public void gR() {
        logger.info("Customer Report");
        for (int i = 0; i < cList.size(); i++) {
            logger.info(String.format("Customer: %s", cList.get(i))); // Using String.format for formatting
        }
        logger.info("Order Report");
        for (int i = 0; i < oList.size(); i++) {
            logger.info(String.format("Order: %s", oList.get(i))); // Using String.format for formatting
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
