import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new HashSet<>();
        List<String> words = Arrays.asList("Мчатся", "Мчатся", "Мчатся", "Мчатся", "тучи", "тучи", "одуванчик", "вьются", "тучи", "вьются", "солнце", "солнце");
        Set<String> res = new HashSet<>();

        printOddNumbers(nums);
        printEvenNumbers(nums, set);
        backUniqueWords(words, res);
        showNumberDuplicates(words);

    }

    public static void printOddNumbers(List<Integer> nums) {
        for (Integer i : nums)
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        System.out.println();
    }

    public static void printEvenNumbers(List<Integer> nums, Set<Integer> set) {
        for (Integer num : nums)
            if (num % 2 == 0) {
                set.add(num);
            }
        List<Integer> nums2 = new ArrayList<>();
        nums2.addAll(0, set);
        Collections.sort(nums2);
        System.out.println("\n" + nums2);
        System.out.println();
    }

    public static void backUniqueWords(List<String> words, Set<String> res) {
        Set<String> duplicateSet = new HashSet<String>();
        for (String w : words) {
            if (!res.add(w)) {
                duplicateSet.add(w);
            }
        }
        res.removeAll(duplicateSet);
        System.out.println(res.toString());
        System.out.println();

    }

    public static void showNumberDuplicates(List<String> words) {
        int count = 0;
        Set<String> copyWords = new HashSet<>();
        for (String word : words) {
            if (copyWords.contains(word)) {
                continue;
            }
            count = Collections.frequency(words, word);
            copyWords.add(word);
         if (count > 1)
                System.out.println("Слово - " + word + " - повторяется " + count + " раза.");
            }
        }
    }
















  /*  List<String> words = List.of("test", "test", "Test", "fdsfds", "TEST", "Test", "test");
    Map<String, Integer> frequency = words.stream().collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
        frequency.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(entry -> System.out.println("Слово - " + entry.getKey() + "- повторяется " + entry.getValue() + " раза."));
*/


















