package GenericScale03;

public class Scale<T extends Comparable<T>> {
    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier() {
        int compare = left.compareTo(right);
        if (compare < 0) {
            return right;
        } else if (compare > 0) {
            return left;
        }
        return null;
    }
}
