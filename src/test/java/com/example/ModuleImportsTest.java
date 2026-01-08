package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

// Unit tests for Module Import Declarations (Preview)
class ModuleImportsTest {
    
    @Test
    void testListOperations() {
        var list = List.of("apple", "banana", "cherry");
        
        assertEquals(3, list.size());
        assertTrue(list.contains("apple"));
        assertTrue(list.contains("banana"));
        assertTrue(list.contains("cherry"));
        assertFalse(list.contains("orange"));
    }
    
    @Test
    void testMapOperations() {
        var map = Map.of("key1", "value1", "key2", "value2", "key3", "value3");
        
        assertEquals(3, map.size());
        assertEquals("value1", map.get("key1"));
        assertEquals("value2", map.get("key2"));
        assertEquals("value3", map.get("key3"));
        assertNull(map.get("nonexistent"));
    }
    
    @Test
    void testOptionalOperations() {
        var presentOptional = Optional.of("Hello World");
        assertTrue(presentOptional.isPresent());
        assertEquals("Hello World", presentOptional.get());
        
        var emptyOptional = Optional.<String>empty();
        assertFalse(emptyOptional.isPresent());
        assertTrue(emptyOptional.isEmpty());
    }
    
    @Test
    void testOptionalWithNull() {
        var nullOptional = Optional.ofNullable(null);
        assertTrue(nullOptional.isEmpty());
        assertFalse(nullOptional.isPresent());
    }
}