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

        var expectedResult = List.of("Abraham", "Dagobert",
                             "Johnson","Wilkinson","Wilson");

        var names = new ArrayListSortable(actualNames);
        var sort = new BublleSort();
        sort.setComparator(new StringComparator());
        sort.setSwapper(new ArrayListSwapper(actualNames));
        sort.sort(names);

        Assert.assertEquals(expectedResult, actualNames);

    }

}
