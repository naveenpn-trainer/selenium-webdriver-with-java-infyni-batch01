package infyni;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LoggingDemo {
    private static final Logger LOGGER = LogManager.getLogger(LoggingDemo.class);

    public static void main(String[] args) {
        LOGGER.trace("Trace Logs");
        LOGGER.debug("Debug message");
        LOGGER.info("Info log");
        LOGGER.warn("Warning message");
        LOGGER.error("Error message");
        LOGGER.fatal("Fatal message");
    }

}
