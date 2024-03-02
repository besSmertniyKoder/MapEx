import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(5,"hello");
        hashMap.put(6,"world");
        hashMap.put(7,"java");
        hashMap.put(8,"cats");
        Collection<String> list =  hashMap.values();
        hashMap.get(8);
      Iterator iterator = list.iterator();
      while (iterator.hasNext()){
          System.out.println(iterator.next());
      }
        hashMap.get(5);
        System.out.println(hashMap.containsValue("hello"));
        System.out.println(hashMap);
        hashMap.isEmpty();
        hashMap.keySet();
        hashMap.values();// -> List
        hashMap.remove(7);
        System.out.println(hashMap);
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5,"hello");
        treeMap.put(6,"world");
        treeMap.put(8,"cats");
        treeMap.put(7,"java");
        System.out.println("////////////////////");
        System.out.println(treeMap);

    }
}
