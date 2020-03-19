import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        hashMap01();
        weakHashMap();
    }
    //hashmap
    public static void hashMap01() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(new String("张三1"), new String("北京"));
        hashMap.put(new String("张三2"), new String("北京"));
        hashMap.put(new String("张三3"), new String("北京"));
        //通知系统垃圾回收
        System.gc();
        System.out.println("hashmap:" + hashMap);
    }
    //weakhashmap
    public static void weakHashMap() {
        WeakHashMap<String, String> weakHashMap = new WeakHashMap<String, String>();
        weakHashMap.put(new String("李四1"), new String("北京"));
        weakHashMap.put(new String("李四2"), new String("北京"));
        weakHashMap.put(new String("李四3"), new String("北京"));
        //通知系统垃圾回收
        System.gc();
        System.out.println("hashmap:" + weakHashMap);
    }
}
