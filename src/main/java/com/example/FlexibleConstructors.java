package com.example;

// Flexible Constructor Bodies (Preview)
public class FlexibleConstructors {
    
    private final String name;
    private final int age;
    private final String email;
    
    public FlexibleConstructors(String name, int age) {
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
    
    public static void main(String[] args) {
        var person1 = new FlexibleConstructors("John Doe", 30);
        var person2 = new FlexibleConstructors("Jane Smith", 25);
        
        System.out.println(person1);
        System.out.println(person2);
    }
    
    @Override
    public String toString() {
        return "Person{name='%s', age=%d, email='%s'}".formatted(name, age, email);
    }
}