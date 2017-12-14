/*
 */
package com.airhacks.flow;

import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SubmissionPublisher;
import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class FlowTest {

    @Test
    public void getSomeFlow() throws InterruptedException {

        ExecutorService threadPool = Executors.newFixedThreadPool(1);
        try (SubmissionPublisher<String> publisher = new SubmissionPublisher(threadPool, 1)) {
            AirhacksSubscriber subscriber = new AirhacksSubscriber();
            publisher.subscribe(subscriber);
            Set.of("duke", "chief", "james").forEach(publisher::submit);
        }

    }

}
