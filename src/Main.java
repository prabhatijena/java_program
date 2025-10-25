import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "banana", "apple", "Orange", "banana", "apple");
        int n = 2;
       List<String> count =  words.stream()
               .map(x->x.toLowerCase())
               .collect(Collectors.groupingBy(x->x,Collectors.counting()))
               .entrySet().stream()
               .filter(x->x.getValue()!=n)
               .map(x->x.getKey())
               .collect(Collectors.toList());
        System.out.println(count);

    }
}