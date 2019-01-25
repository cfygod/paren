package com.cfygit.pattern.hashmap;

import java.util.HashMap;
import java.util.Map;

public class hashmapDemo {

    public static void main(String[] args) {

        Map<MapKey,String> map = new HashMap<MapKey, String>();
        //第一阶段
     /*   for (int i = 0; i < 6; i++)
        {
            map.put(new MapKey(String.valueOf(i)), "A");
        }*/
        //第二阶段
      /*  for (int i = 0; i < 10; i++)
        { map.put(new MapKey(String.valueOf(i)), "A"); }*/
        //第三阶段

        for (int i = 0; i < 18; i++)
        {
            map.put(new MapKey(String.valueOf(i)), "A"+i);
        }

        /*for (int i = 0; i < 50; i++)
        {
            map.put(new MapKey(String.valueOf(i)), "A"+i);
        }*/
         //第四阶段
      /*  map.put(new MapKey("X"), "B");
        map.put(new MapKey("Y"), "B");
        map.put(new MapKey("Z"), "B");*/
        System.out.println(map);
    }

}
