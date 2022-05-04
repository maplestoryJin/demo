package org.example;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATest {
    @Test
    public void name() {
        assertEquals(1, 1);
    }

    @Nested
    public class BTest {
        @Test
        public void name1() {
            assertEquals(1, 1);
        }

        @Nested
        public class CTest {
            @Test
            public void name2() {
                assertEquals(1, 1);
            }
        }

    }
}