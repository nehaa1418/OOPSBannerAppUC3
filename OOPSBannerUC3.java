public class OOPSBannerUC3 {

    public static void main(String[] args) {

        System.out.println("OOPS Banner App - UC3\n");

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

        // Print O O P S
        for (int i = 0; i < 7; i++) {
            String line = String.join("   ",
                    O[i],   // first O
                    O[i],   // second O
                    P[i],
                    S[i]
            );

            System.out.println(line);
        }
    }
}