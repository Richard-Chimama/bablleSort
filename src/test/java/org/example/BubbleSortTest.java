package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortTest {

    @Test
    public  void canSortString(){
        var actualNames = new ArrayList(List.of("Johnson", "Wilson",
                "Wilkinson", "Abraham", "Dagobert"));

        var expectedResult = List.of("Abraham", "Dagobert",
                             "Johnson","Wilkinson","Wilson");

        Sortable<String> names = new ArrayListSortable(actualNames);
        var sort = new BublleSort();
        sort.setComparator(new StringComparator());
        sort.setSwapper(new ArrayListSwapper(actualNames));
        sort.sort(names);

        Assert.assertEquals(expectedResult, actualNames);

    }

    @Test
    public void throwsWhateverComparatorDoes(){
       final ArrayList<String> actualNames = new ArrayList<>(List.of("42", "Wilson"));

       final var names = new ArrayListSortable(actualNames);

       final var sort = new BublleSort<>();

       final var exception = new RuntimeException();

       sort.setComparator((a,b) ->{ throw exception; });

       final Swapper neverInvoked = null;

       sort.setSwapper(neverInvoked);

       try{
           sort.sort(names);
       }catch( Exception e) {
           Assert.assertSame(exception, e);
           return;
       }

       Assert.fail();

    }//end of the method

}
