import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1,2,3,41,2,3,5,6,7,2);
       List<Integer> list1 = list.stream()
               .filter(x->x%2==0)
               .sorted()
               .collect(Collectors.toList());
        System.out.println(list1);

    }
}
