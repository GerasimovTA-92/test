import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BalancedWordsCounterTest {
    private static BalancedWordsCounter balancedWordsCounter;

    @BeforeAll
    public static void setUp() {
        balancedWordsCounter = new BalancedWordsCounter();
    }

    @Test
    public void count_Ok() {
        assertEquals(28, balancedWordsCounter.count("aabbabcccba"));
        assertEquals(0, balancedWordsCounter.count(""));
        assertThrows(RuntimeException.class, () -> balancedWordsCounter.count(null));
        assertThrows(RuntimeException.class, () -> balancedWordsCounter.count("abababa1"));
    }
}