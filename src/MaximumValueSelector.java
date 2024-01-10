import java.util.HashSet;
import java.util.Set;

public class MaximumValueSelector {

    private MaximumValueSelector() {}

    public static Set<Element> maximizeSubsetValue(Set<Element> input, int capacity) {
        if (input == null || input.isEmpty() || capacity <= 0) {
            return new HashSet<>();
        }

        int[][] matrix = buildMatrix(input, capacity);
        return calculateResult(input, capacity, matrix);
    }

    private static int[][] buildMatrix(Set<Element> input, int capacity) {
        int[][] matrix = new int[input.size() + 1][capacity + 1];

        int i = 1;
        for (Element element : input) {
            for (int wc = 0; wc <= capacity; wc++) {
                final int prevRowElement = matrix[i - 1][wc];
                if (element.getValue() <= wc) {
                    final int prevRowPrevElement = matrix[i - 1][wc - element.getValue()];
                    matrix[i][wc] = Math.max(prevRowElement, prevRowPrevElement + element.getValue());
                } else {
                    matrix[i][wc] = prevRowElement;
                }
            }
            i++;
        }
        return matrix;
    }

    private static Set<Element> calculateResult(Set<Element> input, int capacity, int[][] matrix) {
        Set<Element> selectedElements = new HashSet<>();
        int inputSize = input.size();
        while (inputSize > 0 && capacity > 0) {
            Element currentElement = (Element) input.toArray()[inputSize - 1];
            final int currVal = matrix[inputSize][capacity];
            final int prevVal = matrix[inputSize - 1][capacity];
            if (currVal != prevVal) {
                selectedElements.add(currentElement);
                capacity -= currentElement.getValue();
            }
            inputSize--;
        }

        return selectedElements;
    }
}