package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Unit tests for Primitive Types in Patterns (Preview)
class PrimitivePatternsTest {
    
    @Test
    void testPositiveInteger() {
        assertEquals("Positive integer", Java25Examples.checkNumber(42));
        assertEquals("Positive integer", Java25Examples.checkNumber(1));
        assertEquals("Positive integer", Java25Examples.checkNumber(100));
    }
    
    @Test
    void testNegativeInteger() {
        assertEquals("Negative integer", Java25Examples.checkNumber(-5));
        assertEquals("Negative integer", Java25Examples.checkNumber(-1));
        assertEquals("Negative integer", Java25Examples.checkNumber(-100));
    }
    
    @Test
    void testZero() {
        assertEquals("Zero", Java25Examples.checkNumber(0));
    }
    
    @Test
    void testPositiveDouble() {
        assertEquals("Positive double", Java25Examples.checkNumber(3.14));
        assertEquals("Positive double", Java25Examples.checkNumber(0.1));
        assertEquals("Positive double", Java25Examples.checkNumber(999.99));
    }
    
    @Test
    void testNegativeDouble() {
        assertEquals("Other", Java25Examples.checkNumber(-3.14));
    }
    
    @Test
    void testOtherTypes() {
        assertEquals("Other", Java25Examples.checkNumber("text"));
        assertEquals("Other", Java25Examples.checkNumber(true));
        assertEquals("Other", Java25Examples.checkNumber(null));
    }
}