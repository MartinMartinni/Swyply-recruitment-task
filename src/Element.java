import java.util.Objects;

class Element {
    private final int weight;
    private final int value;

    public Element(int weight, int value) {
        if (1 > weight || weight > 2) {
            throw new IllegalArgumentException("Weight can have a value of 1 or 2");
        }
        if (value < 0) {
            throw new IllegalArgumentException("The value should be a non-negative integer");
        }
        this.weight = weight;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return weight == element.weight && value == element.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, value);
    }

    @Override
    public String toString() {
        return "Element{" +
                "weight=" + weight +
                ", value=" + value +
                '}';
    }
}