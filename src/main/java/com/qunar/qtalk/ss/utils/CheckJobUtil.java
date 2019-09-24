package com.qunar.qtalk.ss.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.net.InetAddress;

public class CheckJobUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(CheckJobUtil.class);

    public static boolean checkRun() {
        try {
            InetAddress addr = InetAddress.getLocalHost();
            String hostname = addr.getHostAddress();
            LOGGER.info("checkRun hostName:{}", hostname);
            if ("100.80.129.108".equals(hostname)) {
                return true;
            }

        } catch (Exception e) {
            LOGGER.error("CheckJobUtil checkRun error", e);
        }
        return false;
    }
}
