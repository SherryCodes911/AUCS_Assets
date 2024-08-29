package DSA_Lab02_Ahtisham;

import java.util.ArrayList;
import java.util.List;

public class Problem_02 {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] words = {"leet", "code"};
        char x = 'e';
        List<Integer> list;
        list = findWordsContaining(words, x);
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
