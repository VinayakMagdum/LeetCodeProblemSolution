package examples.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemNumber1002 {
    public static void main(String[] args) {
        System.out.println(2/3);
        String[] arr = new String[] {
//                "bella","label","roller"
                "cool","lock","cook"
        };
        System.out.println(commonChars(arr));
    }

    public static List<String> commonChars(String[] words) {
        int len = words.length;
        List<String> list = new ArrayList<>();
        int[] freq = new int[26];
        Arrays.fill(freq, 0);
        for (String word : words) {
            for(char ch : word.toCharArray()) {
                freq[ch-97]++;
            }
        }

        for(int idx = 0; idx< freq.length; idx++) {
            if (freq[idx] % len == 0 || freq[idx] % len > 0) {
                char ch = (char) (idx + 97);
                for (int i = 0; i < freq[idx] / len; i++) {
                    list.add(ch+"");
                }
            }
        }
        return list;
    }
}
