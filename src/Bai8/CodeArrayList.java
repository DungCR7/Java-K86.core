package JavaK86.core.Bai8;

//import java.util.ArrayList;
//import java.util.List;

import java.util.HashMap;

public class CodeArrayList {
    public static void main(String[] args) {
//        List<Integer> arrayList = new ArrayList<>();
//        arrayList.add(6);
//        arrayList.add(0,4);
//        //index = 0 ,gia tri = 4
//        // mang co gia tri 4,6,7,3
//        // remove 1 => 4,7,3,remove 2 => 4,7
//        arrayList.remove(1);
//        arrayList.add(7);
//        arrayList.add(3);
//        arrayList.remove(2);
//        System.out.println(arrayList);
//        HashMap hashMap = new HashMap();
//        hashMap.put("1","Backend");
//        hashMap.put("2","PHP");
//        hashMap.put("4","Python");
//        hashMap.put("1","Java");
//        System.out.println(hashMap);
        HashMap hashMap = new HashMap();
        hashMap.put("1","Java");
        hashMap.put("2","null");
        hashMap.put("4","Python");
        hashMap.put(null,"PHP");
        hashMap.put(null,null);
        System.out.println(hashMap.size());
    }
}
