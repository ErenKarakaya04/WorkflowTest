import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void checkForEvenNegativeNum() {
        assertTrue(Main.isNumberEven(-4));
    }

    @org.junit.jupiter.api.Test
    void checkForUnevenNegativeNum() {
        assertFalse(Main.isNumberEven(-3));
    }

    @org.junit.jupiter.api.Test
    void checkForUnevenPositiveNum() {
        assertFalse(Main.isNumberEven(1));
    }

    @org.junit.jupiter.api.Test
    void checkForEvenPositiveNum() {
        assertTrue(Main.isNumberEven(2));
    }
}