import java.util.*;

public class RatingsDesk {
    static Map<String, String> catalog = Map.of("m1", "Dune", "m2", "Heat");

    static Optional<Double> average(int... stars) {
        if (stars.length == 0) return Optional.empty();
        int sum = 0;
        for (int s : stars) sum += s;
        return Optional.of((double) sum / stars.length);
    }

    static Optional<String> findTitle(String id) {
        return Optional.ofNullable(catalog.get(id));
    }

    public static void main(String[] args) {
        System.out.println(average(4, 5));
        System.out.println(average());
        average(4, 5).ifPresent(System.out::println);
        System.out.println(average().orElse(0.0));
        System.out.println(findTitle("m1").orElse("Unknown"));
        System.out.println(findTitle("x9").orElse("Unknown"));
    }
}
