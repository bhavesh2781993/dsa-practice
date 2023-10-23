package java8;

import java.util.List;
import java.util.stream.Collectors;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        final Integer sum = nums.stream()
            .reduce(0, Integer::sum);
        System.out.println(sum);

        final Integer sum1 = nums
            .stream()
            .collect(Collectors.reducing(0, (a, b) -> a + b));
        System.out.println(sum1);
    }
}
