package org.example;

public class BublleSort {
    void sort(String[] names) {
        for (int j = 0; j < names.length -1; j++) {
            if (names[j].compareTo(names[j + 1]) > 0) {
                final var tmp = names[j + 1];
                names[j + 1] = names[j];
                names[j] = tmp;
            }
        }
    }//end of sort

}
