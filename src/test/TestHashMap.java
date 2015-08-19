package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**Map的2种迭代方式
 * 1 迭代key
 * 2 迭代Entey
 * */
public class TestHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("G1", 50);
        map.put("G2", 100);
        map.put("G3", 300);
        迭代key(map);
        迭代Entry(map);
    }
    public static void 迭代key(Map<String, Integer> map){
        System.out.println("迭代key:");
        Set<String> keys = map.keySet();
        for(String str:keys){
            System.out.println(str+":"+map.get(str));
        }
    }
    public static void 迭代Entry(Map<String, Integer> map){
        System.out.println("迭代Entry:");
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for(Map.Entry<String, Integer> per:set){
            System.out.println(per.getKey()+":"+per.getValue());
        }
    }
}
