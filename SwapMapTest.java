import org.junit.Assert;

import java.util.HashMap;

import static org.junit.Assert.*;

public class SwapMapTest {

    @org.junit.Test
    public void inverse() {
        HashMap<Integer, String> map = new HashMap();
        HashMap<String, Integer> swapMap = new HashMap();
        map.put(12, "Даня");
        map.put(21, "Кирилл");
        map.put(13, "Витька");
        map.put(33, "Ян");
        swapMap.put("Даня", 12);
        swapMap.put("Кирилл", 21);
        swapMap.put("Витька", 13);
        swapMap.put("Ян", 33);
        SwapMap swapmap = new SwapMap();
        HashMap newmap = swapmap.inverse(map);
        Assert.assertEquals(swapMap, newmap);
    }
}