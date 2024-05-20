/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class LoggerManager {
    private static String logger;

    public static void resetLogger() {
        logger = null;
    }

    public static String getLogger() {
        return logger;
    }

    public static void setLogger(String logger) {
        LoggerManager.logger = logger;
    }
}
