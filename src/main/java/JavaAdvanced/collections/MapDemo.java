package JavaAdvanced.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> myHashMap =  new HashMap<>();
        myHashMap.put(1, "ABC");
        myHashMap.put(2, "BCD");
        myHashMap.put(3, "CDE");
        myHashMap.put(4, "DEF");



        System.out.println("Print Map: " + myHashMap);

        //myHashMap.entrySet() -->Returns SET of ENTRIES -> Entry = Key-Value Pair
        Set<Map.Entry<Integer, String>> entries = myHashMap.entrySet();
        System.out.println("SET of ENTRIES: " + entries);

        Set<Integer> keys = myHashMap.keySet();  // myHashMap.keySet() --> Returns SET of Keys
        System.out.println("SET of Keys: " + keys);

        Collection<String> values = myHashMap.values(); //myHashMap.values() --> Returns COLLECTION of Values
        System.out.println("COLLECTION of Values: " + values);
        System.out.println();

        System.out.println("myHashMap.isEmpty(): " + myHashMap.isEmpty());
        System.out.println("Get map size: " + myHashMap.size());
        System.out.println(myHashMap.get(1));
        System.out.println(myHashMap.get(10));  //Will give null as key 10 doesn't exist
        System.out.println("myHashMap.containsKey(5): " + myHashMap.containsKey(3));
        System.out.println("myHashMap.containsValue(lmn): " + myHashMap.containsValue("lmn"));
        System.out.println();

        System.out.println(entries);
        myHashMap.remove(3); // Removes the third Entry (Key Value Pair)
        System.out.println(entries);
        System.out.println();

        System.out.println("----put()->adds/changes, replace()->only replaces value------");
        myHashMap.put(1,"First Change"); //If Key=1 is Present. will replaces value orElse will add another entry
        myHashMap.replace(4,"Sumit"); //Will replace Key=4 value. If Key not found will not add another entry
        myHashMap.put(7,"xyz"); // Here Put will add this entry
        myHashMap.replace(8,"pqr"); // Here replace will do nothing as Key 8 duesn't exist
        System.out.println(myHashMap);
        System.out.println(entries);
        System.out.println();

        System.out.println("-----putIfAbsent()->adds ENTRY only, does not replace-----");
        myHashMap.putIfAbsent(1, "Second Change"); //Nothing will change here
        myHashMap.putIfAbsent(8, "mnp"); //Since Key=8 doesn't exist. Will add ENTRY
        System.out.println(myHashMap);
        myHashMap.clear(); //Deletes all entries
    }
}
