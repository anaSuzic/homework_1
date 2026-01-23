package homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class homeworkTest {

    @Test
    void stringsNotEmpty() {
        String[] words = Main.getStrings();
        assertTrue(words.length > 0);
    }

    @Test
    void getStringsFirstWord() {
        String[] words = Main.getStrings();
        assertEquals("Two", words[0]);
    }

    @Test
    void getStringsLastWord() {
        String[] words = Main.getStrings();
        assertEquals("mend.", words[words.length - 1]);
    }
}