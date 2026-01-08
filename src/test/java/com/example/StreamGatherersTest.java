package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.Gatherer;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

// Unit tests for Stream Gatherers (Preview)
class StreamGatherersTest {
    
    @Test
    void testFixedWindowGatherer() {
        var result = Stream.of(1, 2, 3, 4, 5, 6)
                .gather(Gatherer.windowFixed(3))
                .toList();
        
        assertEquals(2, result.size());
        assertEquals(List.of(1, 2, 3), result.get(0));
        assertEquals(List.of(4, 5, 6), result.get(1));
    }
    
    @Test
    void testFixedWindowWithRemainder() {
        var result = Stream.of(1, 2, 3, 4, 5)
                .gather(Gatherer.windowFixed(3))
                .toList();
        
        assertEquals(1, result.size());
        assertEquals(List.of(1, 2, 3), result.get(0));
    }
    
    @Test
    void testSlidingWindowGatherer() {
        var result = Stream.of(1, 2, 3, 4)
                .gather(Gatherer.windowSliding(2))
                .toList();
        
        assertEquals(3, result.size());
        assertEquals(List.of(1, 2), result.get(0));
        assertEquals(List.of(2, 3), result.get(1));
        assertEquals(List.of(3, 4), result.get(2));
    }
    
    @Test
    void testScanGatherer() {
        var result = Stream.of(1, 2, 3, 4)
                .gather(Gatherer.scan(() -> 0, Integer::sum))
                .toList();
        
        assertEquals(List.of(0, 1, 3, 6, 10), result);
    }
    
    @Test
    void testScanWithMultiplication() {
        var result = Stream.of(2, 3, 4)
                .gather(Gatherer.scan(() -> 1, (a, b) -> a * b))
                .toList();
        
        assertEquals(List.of(1, 2, 6, 24), result);
    }
    
    @Test
    void testEmptyStreamGatherers() {
        var fixedWindow = Stream.<Integer>empty()
                .gather(Gatherer.windowFixed(3))
                .toList();
        assertTrue(fixedWindow.isEmpty());
        
        var scan = Stream.<Integer>empty()
                .gather(Gatherer.scan(() -> 0, Integer::sum))
                .toList();
        assertEquals(List.of(0), scan);
    }
}