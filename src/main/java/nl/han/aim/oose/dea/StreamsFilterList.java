package nl.han.aim.oose.dea;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterList {

    List<String> filterStringsShorterThanThreeCharacters(List<String> input) {
        input = input.stream()
                .filter(one -> one.length() <= 3 )
                .collect(Collectors.toList());

        return input;
    }

    List<String> filterStringsThatContainOnlyNumerals(List<String> input) {

        input = input.stream()
                .filter(s -> s.matches("\\d+"))
                .collect(Collectors.toList());

        return input;
    }
}
