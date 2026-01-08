package com.example;

import java.util.stream.Gatherer;
import java.util.stream.Stream;

// Stream Gatherers (Preview)
public class StreamGatherers {
    
    public static void main(String[] args) {
        // Using built-in gatherers
        var numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        var windowed = numbers
                .gather(Gatherer.windowFixed(3))
                .toList();
        
        System.out.println("Windowed (size 3): " + windowed);
        
        // Sliding window
        var sliding = Stream.of(1, 2, 3, 4, 5)
                .gather(Gatherer.windowSliding(2))
                .toList();
        
        System.out.println("Sliding window (size 2): " + sliding);
        
        // Scan operation
        var cumulative = Stream.of(1, 2, 3, 4, 5)
                .gather(Gatherer.scan(() -> 0, Integer::sum))
                .toList();
        
        System.out.println("Cumulative sum: " + cumulative);
    }
}