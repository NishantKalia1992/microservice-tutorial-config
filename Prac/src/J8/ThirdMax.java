package J8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ThirdMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 12, 35, 35, 28, 35, 28, 40, 50);

        Optional<Integer> thirdMax = numbers.stream()
            .distinct()                              // Remove duplicates
            .sorted(Comparator.reverseOrder())       // Sort in descending order
            .skip(4)                                 // Skip the first two (1st and 2nd max)
            .findFirst();                            // Find the 3rd max

        thirdMax.ifPresent(max -> 
            System.out.println("Third Maximum is: " + max)
        );
    }
}

