/*
 */
package com.airhacks;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class StackWalkerTest {

    private OrderProcessor processor;

    @Before
    public void init() {
        this.processor = new OrderProcessor();
    }


    @Test
    public void walkTheStack() {
        String order = this.processor.order();
        System.out.println("order = " + order);
    }

    @Test
    public void process() {
        ProcessHandle.allProcesses().map(p -> p.info().command()).
                flatMap(cmd -> cmd.stream()).
                filter(cmd -> cmd.contains("java")).
                forEach(System.out::println);
    }


}
