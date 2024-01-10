import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int capacity = 10;
        Set<Element> inputSet = new HashSet<>();
        inputSet.add(new Element(1, 3));
        inputSet.add(new Element(2, 4));
        inputSet.add(new Element(1, 5));
        inputSet.add(new Element(2, 8));
        inputSet.add(new Element(1, 6));
        inputSet.add(new Element(1, 1));

        Set<Element> result = MaximumValueSelector.maximizeSubsetValue(inputSet, capacity);
        System.out.println("Selected elements: " + result);
    }
}