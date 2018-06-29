//import static org.junit.Assert.assertEquals;
//
//public class Test {
//    private LCD lcd = new LCD();
//    String expectedValue = "";
//
//    @org.junit.Test
//    public void LCD_8() {
//        expectedValue = " _ \n"+
//                        "|_|\n"+
//                        "|_|";
//        assertEquals(expectedValue, lcd.convert("8"));
//    }
//
//    @org.junit.Test
//    public void LCD_0() {
//        expectedValue = " _ \n"+
//                        "| |\n"+
//                        "|_|";
//        assertEquals(expectedValue, lcd.convert("0"));
//    }
//
//    @org.junit.Test
//    public void LCD_00() {
//        expectedValue  = " _  _ \n"+
//                         "| || |\n"+
//                         "|_||_|";
//        assertEquals(expectedValue, lcd.convert("00"));
//    }
//
//    @org.junit.Test
//    public void LCD_001234() {
//        expectedValue  = " _  _     _  _ \n"+
//                         "| || |  | _| _|\n"+
//                         "|_||_|  ||_  _|";
//        assertEquals(expectedValue, lcd.convert("00123"));
//    }
//
//    @org.junit.Test
//    public void LCD_88() {
//        expectedValue  = " _  _ \n"+
//                         "|_||_|\n"+
//                         "|_||_|";
//        assertEquals(expectedValue, lcd.convert("88"));
//    }
//
//    @org.junit.Test
//    public void LCD_320() {
//        expectedValue  = " _  _  _ \n"+
//                         " _| _|| |\n"+
//                         " _||_ |_|";
//        assertEquals(expectedValue, lcd.convert("320"));
//    }
//
//    @org.junit.Test
//    public void LCD_1234() {
//        expectedValue  = "     _  _    \n"+
//                         "  |  _| _||_|\n"+
//                         "  |,|_  _|  |";
//        assertEquals(expectedValue, lcd.convert("1234"));
//    }
//
//    @org.junit.Test
//    public void LCD_12345() {
//        expectedValue  = "Please enter amount less than 10,000";
//        assertEquals(expectedValue, lcd.convert("12345"));
//    }
//
//    @org.junit.Test
//    public void LCD_123456() {
//        expectedValue  = "Please enter amount less than 10,000";
//        assertEquals(expectedValue, lcd.convert("123456"));
//    }
//    @org.junit.Test
//    public void LCD_10DOT00() {
//        expectedValue  = "Please enter Integer Number !!!";
//        assertEquals(expectedValue, lcd.convert("10.00"));
//    }
//}