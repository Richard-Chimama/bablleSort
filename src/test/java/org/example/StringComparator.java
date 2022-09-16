package org.example;

import java.util.Comparator;

public class StringComparator implements Comparator {
    private String f, s;

    @Override
    public int compare(Object first, Object second){

        try {
            this.f = (String) first;
            this.s = (String) second;

            return f.compareTo(s);
        }catch (ClassCastException cce){
            throw new NonStringElementInCollectionException(
                    "There are mixed elements in the collection.", cce
            );
        }
    }//end of compare method
}
