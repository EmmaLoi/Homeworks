package HW10;

import java.util.HashSet;

public class Collection {

    public static <T> java.util.Collection<T> getUnique(java.util.Collection<T> col) {
        return new HashSet<>(col);
    }
}
