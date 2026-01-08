package com.example;

import module java.base;

// Module Import Declarations (Preview)
public class ModuleImports {
    
    public static void main(String[] args) {
        var list = List.of("apple", "banana", "cherry");
        var map = Map.of("key1", "value1", "key2", "value2");
        
        System.out.println("List: " + list);
        System.out.println("Map: " + map);
        
        var optional = Optional.of("Hello World");
        optional.ifPresent(System.out::println);
        
        var stream = Stream.of(1, 2, 3, 4, 5)
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();
        
        System.out.println("Processed stream: " + stream);
    }
}