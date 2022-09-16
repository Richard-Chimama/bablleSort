package org.example;

import java.util.Comparator;

public interface SortSupport<E> {
    void setSwapper(Swapper swap);
    void setComparator(Comparator<E> compare);
}
