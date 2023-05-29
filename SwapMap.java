
import java.util.*;

public class SwapMap {
    public <V, K>HashMap inverse(HashMap<K, V> map){
        HashMap<V, K> resultMap = new HashMap();
        for (K key: map.keySet()){
            resultMap.put(map.get(key), key);
        }

        return resultMap;
    }
}