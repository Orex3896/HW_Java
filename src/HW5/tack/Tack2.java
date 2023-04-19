package HW5.tack;

import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import static java.util.Collections.frequency;
public class Tack2 {
    public static void sortedName() {


//    String[] staffList = {"Иван Иванов", "Светлана Петрова", "Кристина Белова","Анна Мусина",
//            "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Иван Иванов",
//            "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Иван Иванов",
//            "Мария Рыкова", "Анна Крутова", "Марина Лугова", "Анна Владимирова", "Петр Лыков",
//            "Иван Мечников", "Петр Петин", "Петр Лыков", "Иван Ежов"};
        List<String> names = Arrays.asList("Иван Иванов", "Cветлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков",
                "Павел Чернов", "Иван Иванов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Иван Иванов", "Мария Рыкова", "Анна Крутова",
                "Марина Лугова", "Анна Владимирова", "Петр Лыков",
                "Иван Мечников", "Петр Петин", "Петр Лыков", "Иван Ежов");
        Map<String, Integer> nameCount = new HashMap<>();
        List<Integer> arrayCount = new ArrayList<>();
        Map<String, Integer> result = new LinkedHashMap<>();
        for (int i = 0; i < names.size(); i++) {
            int count = Collections.frequency(names, names.get(i));
            arrayCount.add(count);
            nameCount.put(names.get(i), count);
        }
        int maxCount = Collections.max(arrayCount);
        for (int i = maxCount; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
                if (entry.getValue().equals(i)) {
                    result.put(entry.getKey(), i);
                }
            }
        }
    }}