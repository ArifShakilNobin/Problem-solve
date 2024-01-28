import java.util.Set;
import java.util.stream.Collectors;

public class numJewelsInStones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelsSet = jewels.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        return (int) stones.chars().mapToObj(c -> (char) c).filter(jewelsSet::contains).count();
    }

}
