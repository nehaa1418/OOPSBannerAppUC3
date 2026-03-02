public class OOPSUC4 {

    public static void main(String[] args) {

        System.out.println("\nOOPS Banner App - UC4\n");

        // Letter patterns
        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] P = {
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
        String[] banner = new String[7];
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("   ",
                    O[i],   // first O
                    O[i],   // second O
                    P[i],
                    S[i]
            );
        }
        for (String line : banner) {
            System.out.println(line);
        }
    }
}