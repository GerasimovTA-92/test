import java.util.List;
import java.util.Objects;

public class BubbleSort {
    public List<?> sort(List<?> input) {
        if (input == null) {
            throw new RuntimeException("Input list is null");
        }
        Number[] result = input.stream()
                .filter(Objects::nonNull)
                .toArray(Number[]::new);
        int length = result.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (result[j].doubleValue() > result[j + 1].doubleValue()) {
                    var t = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = t;
                }
            }
        }
        return List.of(result);
    }
}
