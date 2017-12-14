
package com.airhacks;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author airhacks.com
 */
public class OrderProcessor {

    public String order() {
        return this.payment();
    }

    public String payment() {
        System.out.println(".");
        StackWalker instance = StackWalker.getInstance();
        return instance.walk(this::stackVisitor);

    }

    String stackVisitor(Stream<StackWalker.StackFrame> frame) {
        return frame.map(f -> f.getMethodName()).collect(Collectors.joining(","));
    }


}
