# Swyply recruitment task

## CODING CHALLENGE:
A set with a specified capacity contains elements representing weight and value. Weight can have a value of 1 or 2, however, the value should be a non-negative integer. Select those elements from the set whose sum value will be the largest, but not exceeding the capacity of the set, and return them as a new data set.

## Solution:
The algorithm used in the provided solution is a dynamic programming approach to solve the 0/1 Knapsack Problem, where the goal is to select a subset of elements with maximum total value without exceeding a specified capacity. The solution iteratively fills a table to store the maximum value achievable for different sub problems. The time complexity is O(n * capacity), and the space complexity is also O(n * capacity).

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
