package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void greetReturnsHelloWorldForNull() {
        assertEquals("Hello, World!", App.greet(null));
    }

    @Test
    void greetReturnsHelloWorldForEmpty() {
        assertEquals("Hello, World!", App.greet("  "));
    }

    @Test
    void greetReturnsHelloName() {
        assertEquals("Hello, Gautham!", App.greet("Gautham"));
    }
}
