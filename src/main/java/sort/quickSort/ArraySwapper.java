package sort.quickSort;

import sort.bubble.Swapper;

public class ArraySwapper <E> implements Swapper {
    private final E[] array;

    public ArraySwapper(E[] array){
        this.array = array;
    }

    @Override
    public void swap(int k, int r){
        final E tmp = array[k];
        array[k] = array[r];
        array[r] = tmp;
    }
}
