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
        logger.info("Added customer: " + n); // Replaced System.out with logger
    }

    // Adds an order to the list
    public void aO(String o) {
        oList.add(o);
        logger.info("Order added: " + o); // Replaced System.out with logger
    }

    // Processes all orders for a specific customer
    public void pO(String c) {
        logger.info("Processing orders for: " + c); // Replaced System.out with logger
        for (int i = 0; i < oList.size(); i++) {
            logger.info("Processing order: " + oList.get(i)); // Replaced System.out with logger
        }
    }

    // Generates a summary report for customers and orders
    public void gR() {
        logger.info("Customer Report"); // Replaced System.out with logger
        for (int i = 0; i < cList.size(); i++) {
            logger.info("Customer: " + cList.get(i)); // Replaced System.out with logger
        }
        logger.info("Order Report"); // Replaced System.out with logger
        for (int i = 0; i < oList.size(); i++) {
            logger.info("Order: " + oList.get(i)); // Replaced System.out with logger
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