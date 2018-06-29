public class LCD {

    public String convert(String number) {
        String result1 = "", result2 = "", result3 = "", totalResult = "";
        String[] line1 = {" _ ", "   ", " _ ", " _ ", "   ", " _ ", " _ ", " _ ", " _ ", " _ "};
        String[] line2 = {"| |", "  |", " _|", " _|", "|_|", "|_ ", "|_ ", "  |", "|_|", "|_|"};
        String[] line3 = {"|_|", "  |", "|_ ", " _|", "  |", " _|", "|_|", "  |", "|_|", " _|"};

        try {
            for (int i = 0; i < number.length(); i++) {
                int indexNum = Integer.parseInt(number.substring(i, i + 1));
                result1 += line1[indexNum];
                result2 += line2[indexNum];
                result3 += line3[indexNum];
            }

            totalResult = result1 + "\n" + result2 + "\n" + result3;

            return totalResult;
        } catch(NumberFormatException ex) {
            return "Please enter Integer Number !!!";
        }
    }
}
