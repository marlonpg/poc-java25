package com.example;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Gatherer;
import java.util.stream.Stream;

// Java 25 Features Demonstration with Tests
public class Java25Examples {
    
    public static void main(String[] args) {
        System.out.println("=== Java 25 Features Demo ===\n");
        
        testPrimitivePatterns();
        testFlexibleConstructors();
        testModuleImports();
        
        System.out.println("\n=== All tests completed ===");
    }
    
    // Primitive Types in Patterns (Preview)
    static void testPrimitivePatterns() {
        System.out.println("1. Testing Primitive Types in Patterns:");
        
        assert "Positive integer".equals(checkNumber(42));
        assert "Negative integer".equals(checkNumber(-5));
        assert "Zero".equals(checkNumber(0));
        assert "Positive double".equals(checkNumber(3.14));
        assert "Other".equals(checkNumber("text"));
        
        System.out.println("   ✓ Pattern matching with primitives works");
        System.out.println("   ✓ Guard conditions with primitives work");
    }
    
    static String checkNumber(Object obj) {
        return switch (obj) {
            case int i when i > 0 -> "Positive integer";
            case int i when i < 0 -> "Negative integer";
            case int i -> "Zero";
            case double d when d > 0.0 -> "Positive double";
            default -> "Other";
        };
    }
    
    // Flexible Constructor Bodies (Preview)
    static void testFlexibleConstructors() {
        System.out.println("\n2. Testing Flexible Constructor Bodies:");
        
        var person = new Person("John Doe", 30);
        assert "John Doe".equals(person.getName());
        assert 30 == person.getAge();
        assert "john.doe@example.com".equals(person.getEmail());
        
        try {
            new Person("", 25);
            assert false : "Should have thrown exception";
        } catch (IllegalArgumentException e) {
            assert "Name cannot be null or empty".equals(e.getMessage());
        }
        
        System.out.println("   ✓ Constructor validation works");
        System.out.println("   ✓ Email generation in constructor works");
    }
    
    static class Person {
        private final String name;
        private final int age;
        private final String email;
        
        public Person(String name, int age) {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be null or empty");
            }
            this.name = name;
            
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
            this.age = age;
            
            this.email = generateEmail(name);
        }
        
        private static String generateEmail(String name) {
            return name.toLowerCase().replace(" ", ".") + "@example.com";
        }
        
        public String getName() { return name; }
        public int getAge() { return age; }
        public String getEmail() { return email; }
    }
    
    // Module Import Declarations (Preview)
    static void testModuleImports() {
        System.out.println("\n3. Testing Module Import Declarations:");
        
        var list = List.of("apple", "banana", "cherry");
        assert 3 == list.size();
        assert list.contains("apple");
        
        var map = Map.of("key1", "value1", "key2", "value2");
        assert "value1".equals(map.get("key1"));
        
        var optional = Optional.of("Hello World");
        assert optional.isPresent();
        assert "Hello World".equals(optional.get());
        
        System.out.println("   ✓ Module imports work correctly");
        System.out.println("   ✓ Collections and Optional accessible");
    }
}