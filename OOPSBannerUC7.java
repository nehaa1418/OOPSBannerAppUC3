
public class OOPSBannerUC7 {
    static class CharacterPattern {
        private char character;
        private String[] pattern;
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public char getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
    public static CharacterPattern getOPattern() {
        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
        return new CharacterPattern('O', O);
    }

    public static CharacterPattern getPPattern() {
        String[] P = {
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
        return new CharacterPattern('P', P);
    }

    public static CharacterPattern getSPattern() {
        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
        return new CharacterPattern('S', S);
    }
    public static void main(String[] args) {

        System.out.println("OOPS Banner App - UC7\n");

        CharacterPattern[] letters = {
                getOPattern(),
                getOPattern(),
                getPPattern(),
                getSPattern()
        };

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPattern letter : letters) {
                line.append(letter.getPattern()[i]).append("   ");
            }

            System.out.println(line);
        }
    }
}