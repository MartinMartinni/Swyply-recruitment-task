# Swyply recruitment task

## CODING CHALLENGE:
A set with a specified capacity contains elements representing weight and value. Weight can have a value of 1 or 2, however, the value should be a non-negative integer. Select those elements from the set whose sum value will be the largest, but not exceeding the capacity of the set, and return them as a new data set.

## Key things:
### Validation:
"Weight can have a value of 1 or 2, however, the value should be a non-negative integer"

```java
if (1 > weight || weight > 2) {
    throw new IllegalArgumentException("Weight can have a value of 1 or 2");
}
if (value < 0) {
    throw new IllegalArgumentException("The value should be a non-negative integer");
}
```

### Weights:
Because there wasn't mentioned about do something with weights besides validation I did nothing.

## Result of function:
For this function call, the result will be as follows

### invocation:
```java
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
```
### result:
```bash
Selected elements: [Element{weight=1, value=1}, Element{weight=2, value=4}, Element{weight=1, value=5}
```
**[1, 4, 5] => 1 + 4 + 5 = 10**
