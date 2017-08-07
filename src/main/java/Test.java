import static org.junit.Assert.assertEquals;

public class Test {
    private LCD lcd = new LCD();
    String expectedValue = "";
    @org.junit.Test
    public void LCD_8() {
        expectedValue = " _ \n"+
                        "|_|\n"+
                        "|_|";
        assertEquals(expectedValue, lcd.convert(8));
    }
    @org.junit.Test
    public void LCD_0() {
        expectedValue = " _ \n"+
                        "| |\n"+
                        "|_|";
        assertEquals(expectedValue, lcd.convert(0));
    }

    @org.junit.Test
    public void LCD_88() {
        expectedValue  = " _  _ \n"+
                         "|_||_|\n"+
                         "|_||_|";
        assertEquals(expectedValue, lcd.convert(88));
    }

    @org.junit.Test
    public void LCD_320() {
        expectedValue  = " _  _  _ \n"+
                         " _| _|| |\n"+
                         " _||_ |_|";
        assertEquals(expectedValue, lcd.convert(320));
    }
    @org.junit.Test
    public void LCD_123456() {
        expectedValue  = "    _  _     _  _ \n"+
                         "  | _| _||_||_ |_ \n"+
                         "  ||_  _|  | _||_|";
        assertEquals(expectedValue, lcd.convert(123456));
    }
}