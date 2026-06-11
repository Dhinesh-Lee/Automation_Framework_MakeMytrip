package utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtil {

    private static final Logger log =
            LogManager.getLogger(LogUtil.class);

    public static void info(String message) {

        // Log4j
        log.info(message);

        // Extent Report
        if (ExtentManager.test != null) {
            ExtentManager.test.info(message);
        }
    }

    public static void error(String message) {

        log.error(message);

        if (ExtentManager.test != null) {
            ExtentManager.test.fail(message);
        }
    }
}