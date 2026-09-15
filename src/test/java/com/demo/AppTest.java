package com.demo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void addsTwoNumbers() {
        assertEquals(6, App.add(2, 3));
    }
}
