package homework_37;

import java.util.*;

public class ListUtils {

    public List<Integer> deleteDuplicates(List<Integer> numbers) {

        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (Integer number : numbers) {
            if (!seen.contains(number)) {
                seen.add(number);
                result.add(number);
            }
        }

        return result;
    }

    public Map<String, Integer> joinMaps(Map<String, Integer> map1,
                                          Map<String, Integer> map2) {

        Map<String, Integer> result = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {

            String key = entry.getKey();
            Integer value = entry.getValue();

            if (result.containsKey(key)) {
                result.put(key, result.get(key) + value);
            } else {
                result.put(key, value);
            }
        }

        return result;
    }
}
