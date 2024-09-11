package nl.han.aim.oose.dea;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFindShortestString {
    String findShortestString(List<String> input) {
        return input.stream()
                .min(Comparator.comparingInt(String::length))  // Find the shortest string
                .orElse(null);  // Provide a default value if the list is empty
    }
}
