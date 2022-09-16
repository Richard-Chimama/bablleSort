package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BubbleSortTest {

    @Test
    public  void canSortString(){
        var actualNames = new ArrayList(Arrays.asList("Johnson", "Wilson",
                "Wilkinson", "Abraham", "Dagobert"));

        var names = new Sortable(){
            @Override
            public Object get(int i){
                return actualNames.get(i);
            }

            @Override
            public int size(){
                return actualNames.size();
            }
        };//end os sortable

        class SwapActualNamesArrayElements implements Swapper{
            @Override
            public void swap(int i, int j){
                final Object tmp = actualNames.get(i);
                actualNames.set(i, actualNames.get(j));
                actualNames.set(j, tmp);
            }
        }//end of swapper

        Comparator stringCompare = new Comparator(){
            @Override
            public int compare(Object first, Object second){
                final String f = (String) first;
                final String s = (String) second;

                return f.compareTo(s);
            }
        };//end of comparator

        var sort = new BublleSort();
        sort.setComparator(stringCompare);
        sort.setSwapper(new SwapActualNamesArrayElements());
        sort.sort(names);

        Assert.assertEquals(List.of(
                "Abraham", "Dagobert",
                "Johnson", "Wilkinson", "Wilson"
        ), actualNames);

    }

}
