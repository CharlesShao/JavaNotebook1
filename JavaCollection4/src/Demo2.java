import java.util.IdentityHashMap;

/**
 * @author CharlesShao
 */
public class Demo2 {
    public static void main(String[] args) {
        IdentityHashMap<String, String> ihmHashMap = new IdentityHashMap<String, String>();
        // 下面两行代码只会向IdentityHashMap对象中添加一个key-value对
        // 如果没有通过 new String() 来初始化的字符串，其实都是在 字符串常量池的，可以通过 == 来比较，如果一样的话，则返回 true
        ihmHashMap.put("name", "13");
        ihmHashMap.put("name", "16");
        // 下面两行代码将会向IdentityHashMap对象中添加两个key-value对
        ihmHashMap.put(new String("zhangsan"), "14");
        ihmHashMap.put(new String("zhangsan"), "11");
        System.out.println(ihmHashMap);
    }
}
