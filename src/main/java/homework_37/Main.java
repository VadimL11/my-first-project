package homework_37;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main() {

        ListUtils utils = new ListUtils();


        List<Integer> numbers = List.of(3, 2, 4, 2, 3, 4, 5, 6);
        List<Integer> noDupes = utils.deleteDuplicates(numbers);
        System.out.println(noDupes);


        Map<String, Integer> map1 = Map.of("a", 3, "c", 4);
        Map<String, Integer> map2 = Map.of("b", 2, "c", 3);
        Map<String, Integer> merged = utils.joinMaps(map1, map2);
        System.out.println(merged);
    }
}

