import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> lists = Arrays.asList("Prabhati","Bipin","Swetapadma","Lipi");
        List<String> sortedByLength = lists.stream()
                .sorted(Comparator.comparingInt(String::length))
                .distinct();
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(sortedByLength);

    }
}
