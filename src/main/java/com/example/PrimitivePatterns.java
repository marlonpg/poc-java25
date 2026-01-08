package com.example;

// Primitive Types in Patterns (Preview)
public class PrimitivePatterns {
    
    public static void main(String[] args) {
        processValue(42);
        processValue(3.14);
        processValue(true);
        processValue("hello");
    }
    
    static void processValue(Object obj) {
        switch (obj) {
            case int i -> System.out.println("Integer: " + i);
            case double d -> System.out.println("Double: " + d);
            case boolean b -> System.out.println("Boolean: " + b);
            case String s -> System.out.println("String: " + s);
            default -> System.out.println("Unknown type");
        }
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
}