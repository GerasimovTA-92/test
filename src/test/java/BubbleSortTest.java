import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BubbleSortTest {
    private static BubbleSort bubbleSort;

    @BeforeAll
    public static void setUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void sort_Ok() {
        assertEquals(List.of(1, 3, 4, 5, 6, 8, 8), bubbleSort.sort(List.of(1,4,5,6,8,3,8)));
        assertEquals(List.of(-9.3,0.1,0.2,4,5,9), bubbleSort.sort(List.of(-9.3,0.2,4,0.1,5,9)));
        assertEquals(List.of(), bubbleSort.sort(List.of()));
        List<Double> actual = new java.util.ArrayList<>();
        actual.add(null);
        actual.add(5.0001);
        assertEquals(List.of(5.0001), bubbleSort.sort(actual));
        assertThrows(RuntimeException.class, () -> bubbleSort.sort(null));
    }
}