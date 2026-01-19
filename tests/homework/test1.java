package homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test1 {

    @Test
    void stringsNotEmpty() {
        String[] words = homework.getStrings();
        assertTrue(words.length > 0);
    }

    @Test
    void getStringsFirstWord() {
        String[] words = homework.getStrings();
        assertEquals("Two", words[0]);
    }

    @Test
    void getStringsLastWord() {
        String[] words = homework.getStrings();
        assertEquals("mend.", words[words.length - 1]);
    }
}