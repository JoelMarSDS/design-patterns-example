package creational.singleton.pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class SingletonPatternsDatabase {

    private static final Logger logger = Logger.getLogger(SingletonPatternsDatabase.class.getName());

    private static HashMap<String, String> instance = null;

    static {
        toConnect();
    }

    private SingletonPatternsDatabase() {
        toConnect();
    }

    private static void toConnect() {
        try {
            if (instance == null) {
                instance = new HashMap<>();
            }
        } catch (Exception e) {
            e.fillInStackTrace();
            logger.throwing(SingletonPatternsDatabase.class.getSimpleName(), "toConnect", e);
        }
    }

    public static Map<String, String> getConnection() {
        return instance;
    }
}