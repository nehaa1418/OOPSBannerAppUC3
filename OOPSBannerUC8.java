import java.util.HashMap;
import java.util.Map;
public class OOPSBannerUC8 {
    public static Map<Character, String[]> createPatternMap() {
        Map<Character, String[]> patternMap = new HashMap<>();
        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });
        patternMap.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });
        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return patternMap;
    }
    public static void renderBanner(String word,
                                    Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                line.append(pattern[row]).append("   ");
            }

            System.out.println(line);
        }
    }
    public static void main(String[] args) {

        System.out.println("OOPS Banner App - UC8\n");

        Map<Character, String[]> patternMap = createPatternMap();

        renderBanner("OOPS", patternMap);
    }
}