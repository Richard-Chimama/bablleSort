package sort.quickSort;

import org.junit.Assert;
import org.junit.Test;

public class PartitionerTest {

    @Test
    public void partitionsIntArray(){
        final var partitionThis = new Integer[]{0, 7, 6,2};

        final var swapper = new ArraySwapper<>(partitionThis);
        final var partitioner = new Partitioner<Integer>(
                (a,b) -> a < b ? -1: a > b ? +1 : 0, swapper
        );

        final Integer pivot = 6;
        final int cutIndex = partitioner.partition(
                new ArrayWrapper<>(partitionThis), 0, partitionThis.length - 1, pivot
        );

        Assert.assertEquals(2, cutIndex);

        final var expected = new Integer[]{0,2,6,7};
        Assert.assertArrayEquals(expected, partitionThis);

    }//end of the method




}//end of the class
