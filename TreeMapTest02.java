package edu.xcdq;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest02 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMAp = new TreeMap<>();
        treeMAp.put(1, "二狗子");
        treeMAp.put(2, "二狗子");
        treeMAp.put(3, "二狗子");
        treeMAp.put(4, "二狗子");
        treeMAp.put(4, "二狗子");//自动去重，如果值和原来的不同，那么会覆盖掉旧值
        System.out.println(treeMAp);

        for (Map.Entry<Integer, String> m : treeMAp.entrySet()) {
            System.out.println(m);
        }
        for (Integer key : treeMAp.keySet()) {
            System.out.println(key + "=" + treeMAp.get(key));
        }
        for (String value : treeMAp.values()) {
            System.out.println(value + "\t");
        }

    }
}
