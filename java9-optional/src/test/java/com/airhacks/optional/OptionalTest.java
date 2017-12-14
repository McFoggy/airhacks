/*
 */
package com.airhacks.optional;

import java.util.Optional;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class OptionalTest {

    @Test
    public void or() {
        int message = this.answer().
                map(Integer::parseInt).
                or(this::defaultAnswer).
                get();
        assertThat(message, is(42));
    }

    public Optional<String> answer() {
        return Optional.ofNullable(null);
    }

    public Optional<Integer> defaultAnswer() {
        return Optional.of(42);
    }
}
