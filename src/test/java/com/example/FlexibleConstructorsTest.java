package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Unit tests for Flexible Constructor Bodies (Preview)
class FlexibleConstructorsTest {
    
    @Test
    void testValidPersonCreation() {
        var person = new Java25Examples.Person("John Doe", 30);
        
        assertEquals("John Doe", person.getName());
        assertEquals(30, person.getAge());
        assertEquals("john.doe@example.com", person.getEmail());
    }
    
    @Test
    void testEmailGeneration() {
        var person1 = new Java25Examples.Person("Jane Smith", 25);
        assertEquals("jane.smith@example.com", person1.getEmail());
        
        var person2 = new Java25Examples.Person("Bob Wilson", 40);
        assertEquals("bob.wilson@example.com", person2.getEmail());
    }
    
    @Test
    void testNullNameThrowsException() {
        var exception = assertThrows(IllegalArgumentException.class, 
            () -> new Java25Examples.Person(null, 25));
        assertEquals("Name cannot be null or empty", exception.getMessage());
    }
    
    @Test
    void testEmptyNameThrowsException() {
        var exception = assertThrows(IllegalArgumentException.class, 
            () -> new Java25Examples.Person("", 25));
        assertEquals("Name cannot be null or empty", exception.getMessage());
    }
    
    @Test
    void testNegativeAgeThrowsException() {
        var exception = assertThrows(IllegalArgumentException.class, 
            () -> new Java25Examples.Person("John", -1));
        assertEquals("Age cannot be negative", exception.getMessage());
    }
    
    @Test
    void testZeroAgeIsValid() {
        var person = new Java25Examples.Person("Baby", 0);
        assertEquals(0, person.getAge());
    }
}