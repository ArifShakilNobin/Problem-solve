import java.util.ArrayList;
import java.util.List;

public class FindWordsContaining {
    public List<Integer> findWords(String[] words, char x) {

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < words.length; i++) {
            for (char x1 : words[i].toCharArray()) {
                if (x1 == x) {
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

        FindWordsContaining findWordsContaining = new FindWordsContaining();
        findWordsContaining.findWords(new String[]{"leet","code"}, 'e');
    }
}
