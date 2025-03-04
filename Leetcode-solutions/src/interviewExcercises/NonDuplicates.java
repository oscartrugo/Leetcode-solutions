package interviewExcercises;

import java.util.*;

public class NonDuplicates {
    public static void main(String[] args) {
        String input1 = "aabbc";
        String input2 = "ccbba";

        System.out.println(getNonDuplicateCharacter(input1));
        System.out.println(getNonDuplicateCharacter(input2));
    }

    private static String getNonDuplicateCharacter(String input) {
        char[] chars = input.toCharArray();
        Map<String, Integer> map = new HashMap<>();
        List<String> characters = new ArrayList<>();

        for (char c: chars){
            characters.add(String.valueOf(c));
        }

        characters.forEach(character -> {
            map.put(character, map.getOrDefault(character, 0) + 1);
        });

        List<String> result = characters.stream()
                .filter(c -> map.get(c) == 1)
                .toList();

        return result.getFirst();
    }
}
