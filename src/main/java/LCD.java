public class LCD {

    public String convert(int number) {
        String result1 = "", result2 = "", result3 = "";
        String numString = number + "";
        String[] line1 = {" _ ", "   ", " _ ", " _ ", "   ", " _ ", " _ ", " _ ", " _ ", " _ "};
        String[] line2 = {"| |", "  |", " _|", " _|", "|_|", "|_ ", "|_ ", "  |", "|_|", "|_|"};
        String[] line3 = {"|_|", "  |", "|_ ", " _|", "  |", " _|", "|_|", "  |", "|_|", " _|"};

        for (int i = 0; i < numString.length(); i++) {
            int indexNum = Integer.parseInt(numString.substring(i, i + 1));
            result1 += line1[indexNum];
            result2 += line2[indexNum];
            result3 += line3[indexNum];
        }

        return result1 + "\n" + result2 + "\n" + result3;
    }
}
