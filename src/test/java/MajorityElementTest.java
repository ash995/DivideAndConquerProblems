import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MajorityElementTest {

    @Test
    public void isMajorityTest1() throws Exception {
        MajorityElement majorityElement = new MajorityElement();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(3);
        integerList.add(3);
        integerList.add(3);
        integerList.add(3);
        integerList.add(3);
        integerList.add(3);
        integerList.add(4);
        integerList.add(4);
        integerList.add(4);

        Assert.assertEquals(true, majorityElement.isMajority(integerList, 3));
    }

    @Test
    public void isMajorityTest2() throws Exception {
        MajorityElement majorityElement = new MajorityElement();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(2);
        integerList.add(2);
        integerList.add(3);
        integerList.add(3);
        integerList.add(3);
        integerList.add(3);
        integerList.add(4);
        integerList.add(4);
        integerList.add(4);

        Assert.assertEquals(false, majorityElement.isMajority(integerList, 3));
    }

    @Test
    public void isMajorityTest3() throws Exception {
        MajorityElement majorityElement = new MajorityElement();

        List<Integer> integerList = new ArrayList<>();
        Assert.assertEquals(false, majorityElement.isMajority(integerList, 3));
    }

}