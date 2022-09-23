package Chapter16;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Mapping {

    public static void main(String[] args) {

        Queue<String> colors = new PriorityQueue<>();
        colors.add("Blue");
        colors.add("Black");

        Map<String, Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B", 2);
        map.replace("A",3);

        System.out.println("from queue " + colors);
        System.out.println("from map " + map);
    }
}
