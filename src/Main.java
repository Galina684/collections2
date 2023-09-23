import java.util.*;

public class Main {
    static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    static List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        oddNumbers(nums);
        evenNumbers(nums);
        uniqueWords(strings);
        duplicateWords(strings);

    }

    private static void oddNumbers(List<Integer> nums) {
        System.out.println("Задача 1. Нечетные числа");
        Set<Integer> numbers = new HashSet<>(nums);
        for (int num : nums) {
            if (num % 2 != 0) {
                numbers.add(num);
            }
        }
        System.out.println(numbers);
    }

    private static void evenNumbers(List<Integer> nums) {
        System.out.println("Задача 2. Четные числа");
        Set<Integer> numbers = new HashSet<>(nums);
        for (int num : nums) {
            if (num % 2 == 0) {
                numbers.add(num);
            }
        }
        System.out.println(numbers);
    }

    private static void uniqueWords(List<String> strings) {
        System.out.println("Задача 3. Уникальные слова");
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(uniqueWords);
    }

    private static void duplicateWords(List<String> strings) {
        System.out.println("Задача 4. Дубли слов");
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : strings) {
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.get(word) + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }
        System.out.println(wordsMap);
    }
}