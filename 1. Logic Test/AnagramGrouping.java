import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGrouping{
    public static void main(String[] args) {
        //String[] words = {"listen", "pot", "part", "opt", "trap", "silent", "top"};
        String[] words = {"listen", "potato", "tomato", "dog", "god", "taco", "cat", "act", "racecar"};

        List<List<String>> groupedAnagrams = groupAnagrams(words);
        System.out.println(groupedAnagrams);
    }

    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            int[] charCount = new int[26];

            for (char c : word.toCharArray()) {
                charCount[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int count : charCount) {
                sb.append(count).append("#");
            }

            String key = sb.toString();

            if (anagramMap.containsKey(key)) {
                anagramMap.get(key).add(word);
            } else {
                List<String> anagrams = new ArrayList<>();
                anagrams.add(word);
                anagramMap.put(key, anagrams);
            }
        }

        return new ArrayList<>(anagramMap.values());
    }
}