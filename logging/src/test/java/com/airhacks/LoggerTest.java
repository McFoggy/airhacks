/*
 */
package com.airhacks;

import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class LoggerTest {

    @Test
    public void endOfLogging() {
        System.Logger LOG = System.getLogger(LoggerTest.class.getName());
        LOG.log(System.Logger.Level.INFO, "hello");
    }

}
